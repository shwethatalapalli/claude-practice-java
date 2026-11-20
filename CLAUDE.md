# Project rules (read this first, every time)

This file is the "company handbook" for Claude. It is loaded automatically at the start of every session, so you do not need to repeat these instructions in your prompts.

## What this project is
A tiny in-memory task tracker library. It exists only for practice.

## Tech stack
- Language: Java 21
- Build tool: Maven (`pom.xml`)
- Testing: JUnit 5 (`org.junit.jupiter`)
- Dependencies: only JUnit for tests. Do not add libraries without asking.

## Architecture
- Production code: `src/main/java/com/example/tasks/`
- Tests: `src/test/java/com/example/tasks/`. Each class `Foo` has a test class `FooTest` in the same package.
- `tickets/` holds practice tickets (stand-ins for Jira). Treat them as read-only task descriptions.
- `TaskStore` owns the list of tasks and all rules about them. `Task` is plain data.
- No frameworks (no Spring), no static mutable state.

## Commands
- Run all tests: `mvn test`
- Compile only: `mvn compile`
- There is no linter configured.

## Conventions
- Four-space indentation. Braces on the same line.
- Classes in PascalCase, methods and variables in camelCase, constants in UPPER_SNAKE_CASE.
- Prefer immutable fields (`final`). Return new or unmodifiable collections, never internal lists.
- Invalid input throws `IllegalArgumentException` with a clear message. Never return `null` silently.
- Every behaviour change needs a test. For bugs, write the failing test first.
- Commit messages: `TICKET-ID: short summary in present tense`, e.g. `TICKET-001: add completeTask`.
- Branch names: `feature/TICKET-ID-short-name` or `fix/TICKET-ID-short-name`.

## Boundaries
- Never edit anything inside `tickets/`.
- Never edit `.claude/` or this file unless explicitly asked.
- Never commit secrets, tokens or real client information. This is a practice repo.
- Never commit the `target/` folder (build output).
- Do not push to `main`. Always work on a branch and open a pull request.

## When requirements are unclear
Stop and ask one specific question. Do not guess.
