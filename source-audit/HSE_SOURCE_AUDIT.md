# HSE art-history source audit

Verified on 2026-10-30. Owner approved the resulting catalog/texts and publication with these source limits on 2026-10-30. This audit did not publish data, access organizer accounts or participant/result records, or create an organizer crawler.

## Scope and evidence

- [Official task archive](https://olymp.hse.ru/mmo/tasks-arthist): the archive lists only final-stage files for academic years 2024/25 and 2025/26. There are two variant groups, grades 9–10 and grade 11. The task PDFs identify stage 2 and calendar years 2025/2026 respectively.
- [Official preparation page](https://olymp.hse.ru/mmo/materials-arthist): historical demos and recommendations are separate preparation resources, not evidence that the actual selection-stage tests were published. It also lists current 2026/27 demos for selection rounds 1 and 2.
- [Official archive index](https://olymp.hse.ru/mmo/archive): explicitly directs readers to each profile's pages for preparation/tasks. No additional art-history task archive was identified there.
- Profile participation is in grade categories 9–11. The [2026/27 recommendations, p. 3](https://olymp.hse.ru/mirror/pubs/share/1201096973.pdf) also allow younger pupils to solve for a selected category. Do not invent separate grade 7/8 files.

## Actual competition files: all eight exposed final-stage PDFs

Each link was opened as `application/pdf` and parsed by the web tool. The 2024/25 grade 11 task timed out once and parsed successfully on retry. Keys physically combine answers and marking guidance: keep one material with `kind=combined` and `documentKinds=[answers,criteria]` rather than duplicating downloads.

| Academic year | Grades | Tasks | Answers + criteria |
| --- | --- | --- | --- |
| 2024/25 | 9–10 | [9 pages](https://olymp.hse.ru/mirror/pubs/share/1017225170.pdf) | [5 pages](https://olymp.hse.ru/mirror/pubs/share/1021836579.pdf) |
| 2024/25 | 11 | [9 pages](https://olymp.hse.ru/mirror/pubs/share/1017225192.pdf) | [5 pages](https://olymp.hse.ru/mirror/pubs/share/1021836585.pdf) |
| 2025/26 | 9–10 | [11 pages](https://olymp.hse.ru/mirror/pubs/share/1132463854.pdf) | [6 pages](https://olymp.hse.ru/mirror/pubs/share/1134692621.pdf) |
| 2025/26 | 11 | [11 pages](https://olymp.hse.ru/mirror/pubs/share/1134351144.pdf) | [6 pages](https://olymp.hse.ru/mirror/pubs/share/1135473263.pdf) |

Machine-readable metadata, including every preparation URL, is in [hse-inventory.json](hse-inventory.json). It contains 8 actual archive PDFs, 13 historical preparation PDFs, 6 current preparation PDFs, and explicit gap records. Preparation files are never substituted for missing actual tasks.

## Gaps and verification limits

- Actual selection-stage tasks and separate/combined solutions for grades 9, 10, 11 in both historical years: **not listed on the audited official profile pages**. Classified `unpublished` with this bounded meaning; this is not proof that no public copy exists elsewhere. Six year/grade combinations each have task and solution gaps (12 records). Do not split historical selection into two rounds using the new 2026/27 rules.
- Separate answer and criterion downloads for finals: not missing; they are supplied together in the four key PDFs.
- Current 2026/27 final preparation column is empty. No current final demo URL is manufactured. Actual current-season future-stage tasks are not historical archive materials.
- Six historical selection demos (approximately 15–22 MB) exceeded the web parser's size limit. A targeted HTTP range request for each returned 206, `application/pdf`, and a `%PDF` header. They are reachable PDFs, but their complete pages and embedded answers were **not** inspected. The same limitation affects three current round-2 demos. Current round-1 grade 11 timed out in the web parser; a range request succeeded. These are `header_only` evidence, not end-to-end download proof.
- No Android PDF-opening/saving or owner-network verification occurred in this source audit. Link availability can change. Overall coverage remains partial because selection-stage actuals are unestablished and some large preparation documents lack complete content inspection.
- A fixed, manually selected set of official pages/links was checked. No scheduled or recursive organizer scraper was created. No third-party mirrors replace official evidence.

## Current rules and source-backed calendar candidates

The [official documents page](https://olymp.hse.ru/mmo/official) labels the [regulation](https://olymp.hse.ru/mirror/pubs/share/1177293678.pdf) and [position](https://olymp.hse.ru/mirror/pubs/share/1177293691.pdf) updated 2026-05-07; both PDFs parsed. Regulation section 2 provides two selection rounds followed by a final; round 2 uses asynchronous proctoring. These current rules must not be backdated to older archives.

- Exact subject event: **2026-11-22, 09:00 Moscow (UTC+03:00), 45 minutes, grades 9–11, selection stage round 2**. [Official timetable](https://olymp.hse.ru/mmo/timetable1), art-history row. Region scope is common/nationwide; a pupil's selected pilot oblast does not change this time. This is not the final.
- Final-stage common window: **2027-02-05 through 2027-02-15**, from the [official landing page](https://olymp.hse.ru/mmo/). No exact art-history final date was verified, so store only a window if needed.
- The landing page registration window is 2026-08-20 through 2026-09-22 14:00 Moscow. Its separate November 2 extension is for industrial programming and must not be attached to art history.
- The landing page and page banners disagree about first-round results timing (late October versus first half of November). Do not create a results-date event from either. No participant results were opened.

The timetable is direct schedule evidence; its publication date was not established. `verifiedOn=2026-10-30` is editorial verification, not a news publication date. No made-up news timestamp is supplied.

## Editorial follow-up

The owner reviewed this inventory and [Russian guidance](GUIDANCE_REVIEW.md) and approved publication with the disclosed limits. Resolve missing actual selection tasks through an official publication if one is later found; otherwise retain the explicit gap. A full download/content check of large demos remains separate verification work. Publication/network outcomes belong in the delivery record, not this source audit.
