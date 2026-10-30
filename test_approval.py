import hashlib
import tempfile
import unittest
from pathlib import Path
from check_approval import check


class ApprovalTest(unittest.TestCase):
    def test_content_change_cannot_reuse_previous_editorial_approval(self):
        with tempfile.TemporaryDirectory() as folder:
            catalog = Path(folder) / "catalog.json"
            approval = Path(folder) / "EDITORIAL_APPROVAL.md"
            catalog.write_text('{"releaseVersion":1,"title":"Original"}', encoding="utf-8")
            self.approve(catalog, approval, 1)
            check(catalog, approval)
            catalog.write_text('{"releaseVersion":1,"title":"Unreviewed"}', encoding="utf-8")
            with self.assertRaises(ValueError):
                check(catalog, approval)
            catalog.write_text('{"releaseVersion":2,"title":"Reviewed"}', encoding="utf-8")
            self.approve(catalog, approval, 2)
            check(catalog, approval)

    def test_missing_reviewer_or_date_is_not_approval(self):
        with tempfile.TemporaryDirectory() as folder:
            catalog = Path(folder) / "catalog.json"
            approval = Path(folder) / "EDITORIAL_APPROVAL.md"
            catalog.write_text('{"releaseVersion":1}', encoding="utf-8")
            self.approve(catalog, approval, 1)
            approval.write_text(approval.read_text().replace("Reviewer: Test editor\n", ""))
            with self.assertRaises(ValueError):
                check(catalog, approval)

    @staticmethod
    def approve(catalog, approval, release):
        digest = hashlib.sha256(catalog.read_bytes()).hexdigest()
        approval.write_text(f"Release: {release}\nSHA256: {digest}\nReviewer: Test editor\nDate: 2026-10-30\n", encoding="utf-8")


if __name__ == "__main__":
    unittest.main()
