# ВсОШ Art (МХК): official source audit

Verified on **2026-10-30**. Scope: academic years **2024/25 and 2025/26**, national applicable stages and **Moscow Oblast, Leningrad Oblast, Vladimir Oblast**. Moscow city and Saint Petersburg city are excluded. The owner approved the resulting catalog/texts and publication with these source limits on 2026-10-30. This audit is not itself a publication; per-file statuses preserve the state at discovery.

The machine-readable evidence is [vsosh-inventory.json](vsosh-inventory.json). It preserves every identified file URL, archive member path, year/stage/grade grouping, document kind, source page and verification limitation. Do not manufacture direct URLs for compressed/cloud members, or generate replacement PDFs.

## Result and meaning of completeness

All MHK links on the checked national subject page and seven Moscow archive stage pages were inventoried. Both target years on the Leningrad school/municipal archive pages were inspected, and every PDF entry in the two 2025/26 subject folders was enumerated. Vladimir's current operator, both year archives, school/municipal pages, preparation page and linked historical subject archive were checked.

This does **not** establish exhaustive coverage of every municipal/school website in three oblasts. Leningrad 2024/25 compressed members and independent local regional/final duplicates remain unverified. These are explicit limitations, not claims that materials were never published. No `unpublished` conclusion was inferred solely from a missing link.

| Evidence group | Identified assets | Verification / app download boundary |
| --- | --- | --- |
| Moscow Oblast direct archival PDFs | 40 | 32 HTTP200/206 PDF bytes verified; 8 repeatedly timed out |
| Moscow Oblast additional links | 15 DOCX, 1 image ZIP, 1 video | Non-PDF; no PDF conversion |
| National archival supporting PDFs | 8 | MIME/signature verified; methodology, requirements, presentation, essay criteria |
| National 2024/25 methodology package | 1 7z | Non-PDF; members not enumerated |
| National task/criteria archives | 4 ZIPs / 51 PDF member entries | ZIP delivery; members have no invented direct file URL |
| Leningrad Oblast 2025/26 | 18 PDF entries in 2 cloud shares | All folder entries enumerated with source MIME/size; direct PDF retrieval not verified |
| Leningrad Oblast 2024/25 | 2 7z cloud files | Source metadata confirms year/name; member lists unverified |
| Vladimir methodology mirrors | 2 PDFs | MIME/signature verified; federal methodology, not local task sets |
| Current 2026/27 national supporting PDFs | 3 | MIME/signature verified; separate from the two archive years |

There are **50 direct archival PDF links**, of which **42** passed the binary check and **8** timed out; current-season supporting documents add three verified direct PDFs. Archive/folder entries overlap official exports and are not unique-content counts. Signature checking is not complete editorial page-by-page validation.

## National source and stage coverage

Authority: [Federal subject archive](https://vserosolimp.edsoo.ru/iskusstvo). Regional and final materials are common across the three pilot oblasts; do not falsely label them as locally authored sets. School/municipal national links are methodological recommendations, not a universal local task pack.

| Academic year / stage | Official delivery | PDF member entries |
| --- | --- | --- |
| 2024/25 regional | [ZIP](https://vso.edsoo.ru/public.php/dav/files/i3yfqS5FTbXTAqN/?accept=zip) | 15: grades9,10,11; tasks, dictation, illustrations, dictation answers, criteria |
| 2024/25 final | [ZIP](https://vso.edsoo.ru/public.php/dav/files/wFcPYrd8g7EpEXa/?accept=zip) | 18: grades9,10,11; theoretical/creative tasks, illustrations and separate marking documents |
| 2025/26 regional | [ZIP](https://vso.edsoo.ru/public.php/dav/files/f92iWBfQJSCgzMJ/?accept=zip) | 6: tasks and criteria for grades9,10,11; separate image/video assets |
| 2025/26 final | [ZIP](https://vso.edsoo.ru/public.php/dav/files/Dkjdj7SXtcRjpyg/?accept=zip) | 12: theoretical and creative tasks/criteria for grades9,10,11; repeated creative filenames in task/criteria folders retained |

The 2025/26 archives are **442,104,855** and **922,976,173 bytes**. HEAD and HTTP206 tail ranges exposed their ZIP central directories without downloading full multimedia archives. Member contents were not opened. The JSON preserves exact full paths and separate non-PDF assets, excluding incidental `Thumbs.db`. Round names are retained where explicit; no extra round is inferred from an ambiguous filename.

The subject page also provides all identified archival method/requirement/presentation PDFs and a separately labeled essay-criteria PDF. Some official URLs end in `?accept=zip` while their payload is actually `application/pdf`: the binary response, not the suffix, determines format. The 2024/25 school/municipal methodology URL is a 7z package.

## Moscow Oblast

Authority confirmed by the [Взлёт homepage](https://olympmo.ru/) and [official archive index](https://olympmo.ru/olympiad-tasks.html). All cloud storage URLs below are linked by this organizer, not an unrelated aggregator.

| Year / stage | Official page | Complete subject-link inventory |
| --- | --- | --- |
| 2024/25 school | [Archive](https://reg.olympmo.ru/olymp-stage/tasks-vos-sch-2024) | 5 task PDFs:5–6,7–8,9,10,11; no separate answer/criteria links.5–6,10,11 endpoints timed out; other2 verified |
| 2024/25 municipal | [Archive](https://reg.olympmo.ru/olymp-stage/tasks-vos-mun-2024) | 12 verified PDFs: tasks, illustrations, answers for7–8,9,10,11; one video |
| 2024/25 regional | [Archive](https://reg.olympmo.ru/olymp-stage/tasks-vos-reg-2024) | 15 DOCX: tasks, dictation, illustrations, answers, criteria for9,10,11; national PDFs remain ZIP members |
| 2024/25 final | [Index](https://olympmo.ru/olympiad-tasks.html) | No local final-stage year link; national final ZIP found |
| 2025/26 school | [Archive](https://reg.olympmo.ru/olymp-stage/tasks-vos-sch-2025) | 5 combined task/answer PDFs:5–6,7–8,9,10,11; all5 endpoints timed out twice |
| 2025/26 municipal | [Archive](https://reg.olympmo.ru/olymp-stage/tasks-vos-mun-2025) | 12 verified PDFs: tasks, answers, illustrations for7–8,9,10,11 |
| 2025/26 regional | [Archive](https://reg.olympmo.ru/olymp-stage/tasks-vos-reg-2025) | 6 verified PDFs: tasks/criteria for9,10,11;1 separate image ZIP |
| 2025/26 final | [Archive](https://reg.olympmo.ru/olymp-stage/tasks-vos-final-2025) | No MHK subject tab found; national final ZIP found |

Unavailable means a live official page lists the asset but this environment could not read its body after two attempts. It does not mean deletion or non-publication. Grouped7–8 materials are preserved as published, without inventing separate per-grade exports.

## Leningrad Oblast

Authority: ГБУ ДО Центр «Интеллект», [school archive](https://center-intellect.ru/vsosh/shkolnyy-etap/zadaniya-proshlykh-let/) and [municipal archive](https://center-intellect.ru/vsosh/munitsipalnyy-etap/zadaniya-proshlykh-let/). This is the oblast organizer, not Saint Petersburg's Академия талантов.

| Year / stage | Organizer-linked delivery | Inventory |
| --- | --- | --- |
| 2024/25 school | [7z share](https://disk.yandex.ru/d/w-5TQ9i5pFc0rw) | File name confirms target academic year; PDF members/grades remain unverified |
| 2024/25 municipal | [7z share](https://disk.yandex.ru/d/tz3BfozXpN-YIQ) | File name confirms target academic year; PDF members/grades remain unverified |
| 2025/26 school | [Folder](https://disk.yandex.ru/d/oszKFNge3ZJwaw) | 10 PDFs:5–6,7–8,9,10,11; separate tasks and criteria |
| 2025/26 municipal | [Folder](https://disk.yandex.ru/d/lmtKa47y2dK67Q) | 8 PDFs:7–8,9,10,11; separate tasks and criteria |

The JSON records all18 public resource paths, sizes, MIME and API discovery URLs. Expiring signed download URLs are deliberately omitted. These are verified listed PDF resources, not yet verified durable direct downloads. Criteria labels are retained without asserting that every file is a separate answer key. Shared national regional/final sets are inventoried above; local duplicates were not independently audited.

Ordinary web requests repeatedly returned timeouts/502 or an incomplete certificate chain. Explicit read-only page requests succeeded with certificate verification disabled solely for research. App HTTPS validation must remain enabled; successful research reads do not prove these endpoints work on the owner's network.

## Vladimir Oblast

[Платформа Владимир](https://cpod.viro33.ru/nashi-meropriyatiya/olimpiady/) links ВсОШ to the [ВИРО operator page](https://viro33.ru/deyatelnost/dopolnitelnoe-obrazovanie-detey/meropriyatiya-dlya-obuchayushchikhsya/regionalnyy-etap-vserossiyskoy-olimpiady-shkolnikov.php). Checked [2024/25 archive](https://viro33.ru/deyatelnost/dopolnitelnoe-obrazovanie-detey/meropriyatiya-dlya-obuchayushchikhsya/arkhiv-2024-2025-uchebnogo-goda.php), [2025/26 archive](https://viro33.ru/deyatelnost/dopolnitelnoe-obrazovanie-detey/meropriyatiya-dlya-obuchayushchikhsya/arkhiv-2025-2026-uchebnogo-goda.php), current school/municipal pages and their preparation link.

The target-year pages expose orders, federal methodology and results/protocols, but no appropriate target-year local MHK task/answer/criteria files were found. Two methodological PDF mirrors passed MIME/signature checks. The [historical subject page](https://odardeti.viro33.ru/index.php/regionalnyj-etap-vserossijskoj-olimpiady-shkolnikov-vo-vladimirskoj-oblasti/45-vsosh/325-mirovaya-khudozhestvennaya-kultura) links older2019/20 municipal work; these are out of scope. This is a missing-from-checked-archive result, not an assertion that no Vladimir municipality publishes files. Regional/final common sets remain available through national archives.

No result PDF, student scan or participant name was copied. A protocol whose title merely contains «Искусство» is not a preparation material.

## Current 2026/27 schedule evidence

These six rows are verified official schedule entries; no publication timestamp is invented. Preserve civil dates. Unknown time zones are null; source wall times must not become UTC timestamps by assumption. All entries require owner editorial review before publication.

| Territory / stage | Official civil date | Evidence / qualification |
| --- | --- | --- |
| Moscow Oblast / school | September25–26,2026 | [Schedule](https://olympmo.ru/vos-sch-2026-2027.html); date window,10:00–20:00 source wall time |
| Moscow Oblast / municipal | November12,2026 | [Schedule](https://olympmo.ru/vos-mun-2026-2027.html);14:00,180minutes,grades7–11 |
| Leningrad Oblast / school | September25,2026 | [Schedule](https://center-intellect.ru/vsosh/shkolnyy-etap/grafik-provedeniya-shkolnogo-etapa/); exact civil date, no source time |
| Leningrad Oblast / municipal | November12,2026 | [Schedule](https://center-intellect.ru/vsosh/munitsipalnyy-etap/grafik-provedeniya-munitsipalnogo-etapa/); exact civil date, no source time |
| Vladimir Oblast / school | September24,2026 | [Official DOCX schedule](https://viro33.ru/download/prilozhenie__2_k_prikazu_2026_2027.docx); asterisk means Sirius.Courses platform |
| Vladimir Oblast / municipal | November27,2026 | Same official schedule, exact civil date, no source time |

The Vladimir DOCX is Appendix2 to order1102 of2026-08-27; its document XML was inspected in memory. The published MHK row is unambiguous even though an unrelated PE row has a year typo; no correction of unrelated source data is imported. Current regional/final dates are not established by this audit. General homepage news and unrelated school-subject news were not copied.

Current [national methodology](https://vso.edsoo.ru/public.php/dav/files/Mdt8k635qCok4Ad/?accept=zip) confirms school task grades5–11, municipal7–11 and higher-grade choice; current [regional requirements](https://vso.edsoo.ru/public.php/dav/files/Y7pLeS4L6yTFwfd/?accept=zip) cover grades9–11. These are guidance sources, not dated competition events. The historical regional operator page lists all four stages, while current Moscow municipal guidance gives advancement eligibility; eligibility copy still needs editorial approval.

## Remaining editorial checks

Resolve the eight unavailable Moscow school files and check every admitted PDF's actual year, territory, pages, task/answer/criteria distinction and artwork. Enumerate Leningrad2024 7z contents; establish supported stable direct links for cloud PDFs or retain honest non-PDF coverage. Additional Vladimir municipality research may uncover local target-year files, but no unsourced date/file should fill those gaps. Verify phone-network reachability at publication time. Preserve checked-versus-missing distinctions in the runtime seed and never present this audit as complete content acceptance.
