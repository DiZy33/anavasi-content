"""Validate the explicit editorial record before deploying any catalog bytes."""
import json
import hashlib
from datetime import date
from pathlib import Path


def check(catalog: Path, approval: Path) -> None:
    release = json.loads(catalog.read_text(encoding="utf-8"))["releaseVersion"]
    fields = {}
    for line in approval.read_text(encoding="utf-8").splitlines():
        if ": " in line:
            key, value = line.split(": ", 1)
            if key in fields:
                raise ValueError("Duplicate approval field")
            fields[key] = value.strip()
    digest = hashlib.sha256(catalog.read_bytes()).hexdigest()
    if fields.get("Release") != str(release) or fields.get("SHA256") != digest:
        raise ValueError("Catalog bytes do not match the reviewed release")
    if not fields.get("Reviewer") or not fields.get("Date"):
        raise ValueError("Reviewer and review date are required")
    date.fromisoformat(fields["Date"])


if __name__ == "__main__":
    check(Path("catalog.json"), Path("EDITORIAL_APPROVAL.md"))
