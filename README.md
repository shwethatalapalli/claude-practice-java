# claude-practice-java

A tiny Java practice project for learning the "ticket to pull request" workflow with Claude Code. It contains no client data.

## What is inside
| Path | Purpose |
|---|---|
| `pom.xml` | Maven config: Java 21 and JUnit 5 |
| `src/main/java/com/example/tasks/` | The code: `Task` and `TaskStore` |
| `src/test/java/com/example/tasks/` | Automated tests (JUnit 5) |
| `tickets/` | Three fake tickets standing in for Jira |
| `CLAUDE.md` | The rules file Claude reads automatically |
| `.claude/skills/implement-ticket/SKILL.md` | A reusable recipe for turning a ticket into a PR |

## Requirements
- JDK 21 (check with `java -version`)
- Maven 3.9 or newer (check with `mvn -v`)
- Internet access the first time, so Maven can download JUnit

## Run the tests
```
mvn test
```
You should see 3 tests pass.

## Try it with Claude Code
From this folder, run `claude`, then ask:

> Implement TICKET-003.

Claude should read `CLAUDE.md`, use the `implement-ticket` skill, work on a branch, add tests and prepare a PR. Review the result yourself before merging. Then try TICKET-001 and TICKET-002.

## Resetting
To redo a ticket, run `git checkout main` and delete the branch Claude created.
