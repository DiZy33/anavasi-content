# Anavasi open catalog

Curated metadata and official source links for ВсОШ по искусству (МХК) and «Высшая проба» по истории искусств. No third-party PDFs are hosted here. Source evidence and gaps are in `source-audit`.

Run `gradle run --args=catalog.json` with JDK 21 and Gradle 8.13 before publication. The typed format and validator are in `src/main/kotlin/io/github/dizy33/anavasi/data/catalog`; format changes require a coordinated app update. Increment `releaseVersion` for every content change, preserve stable IDs, update verification dates only after checking the official sources, and keep qualified windows distinct from confirmed dates. Record missing/unpublished/unavailable/non-PDF materials honestly.

The owner reviews content before each publication. Record `Release: <number>`, `SHA256: <hash of exact catalog bytes>`, `Reviewer: <name>` and `Date: <YYYY-MM-DD>` on separate lines in `EDITORIAL_APPROVAL.md`; no approval file is supplied automatically. Require PR review through branch protection. Actions validates the candidate and exact approved bytes before publishing `catalog.json` through Pages. Failed validation must leave the previous Pages artifact in place.

After publication validate the actual HTTPS response with the same tool, then test app retrieval and official PDF downloads on the target network. Editorial verification dates and download times have separate meanings. Do not place participant data, credentials, application UI source/history or PDF copies here.
