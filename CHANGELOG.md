# Changelog DataElementHub Data Access Layer
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [3.0.2] - 2022-11-29
### Security
- Update postgresql to 42.5.1 to fix [CVE-2022-41946](https://cve.mitre.org/cgi-bin/cvename.cgi?name=2022-41946)

## [3.0.2] - 2022-09-29
### Security
- Update postgresql to 42.5.0 in the flyway plugin dependency as well

## [3.0.1] - 2022-09-29
### Security
- Update postgresql to 42.5.0 [CVE-2022-31197](https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2022-31197)

## [3.0.0] - 2022-07-12
### Removed
- Resourcemanager and MigrationUtil [[#16](https://github.com/mig-frankfurt/dataelementhub.dal/issues/16)]
  - they are no longer needed since the dsl context is autowired in dehub-rest
- flyway and slf4j dependencies
  - they are also no longer needed

## [2.4.1] - 2022-07-06
### Fixed
- Remove "on update" part of trigger to check for duplicate identifiers since it prevented releasing elements

## [2.4.0] - 2022-07-05
### Removed
- Status "STAGED" [[#14](https://github.com/mig-frankfurt/dataelementhub.dal/issues/14)]
  - it was no longer used and therefore was removed

## [2.3.0] - 2022-07-01
### Added
- unique constraint for value domain scoped identifiers [[#7](https://github.com/mig-frankfurt/dataelementhub.dal/issues/7)]
  - there was a problem with different value domain types having the same identifier
### Changed
- update to latest parent.pom (set java version to 17)
- updated libs

## [2.2.0] - 2022-03-07
### Security
- Update postgresql to 42.3.3

## [2.1.0] - 2022-01-26
### Added
- Import process_status enum [[#1](https://github.com/mig-frankfurt/dataelementhub.dal/issues/1)]
  - to track the status of an import process
### Changed
- Staging and import tables are expanded to contain more details [[#1](https://github.com/mig-frankfurt/dataelementhub.dal/issues/1)]
  - import and staging tables were updated to enable importing elements into namespaces for users

## [2.0.0] - 2021-12-03
### Changed
- user_namespace_grants is now user_namespace_access [[#2](https://github.com/mig-frankfurt/dataelementhub.dal/issues/2)]
  - renamed to a better fitting name
- grant_type is now access_level_type [[#2](https://github.com/mig-frankfurt/dataelementhub.dal/issues/2)]
    - renamed to a better fitting name

## [1.0.0] - 2021-09-24
### Added
- initial commit
