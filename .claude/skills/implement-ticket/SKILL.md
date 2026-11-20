---
name: implement-ticket
description: Implement a practice ticket end to end. Use when the user gives a ticket ID such as TICKET-001 and wants it implemented, tested and prepared as a pull request.
---

# Implement a ticket

Follow these steps in order. Rules in CLAUDE.md always apply.

## 1. Read the ticket
- Open `tickets/<TICKET-ID>.md`.
- Restate the goal and the acceptance criteria in two or three lines.
- If anything is ambiguous, ask one question before continuing.

## 2. Plan
- List which files you will change and why.
- Keep the change as small as possible. Do not refactor unrelated code.

## 3. Create a branch
- `git checkout -b feature/<TICKET-ID>-<short-name>` (use `fix/` for bugs).

## 4. Implement with tests
- For bugs: write a failing test that shows the bug first, then fix the code.
- For features: add a test for each acceptance criterion.
- Run `mvn test` and make sure everything passes.

## 5. Commit
- One commit, message format `TICKET-ID: short summary`.

## 6. Prepare the pull request
- If the repository has a remote and `gh` is installed and logged in, run `gh pr create` with a description.
- Otherwise, print the description for the user to paste.
- The description must include these headings:
  - **Ticket**: the ID and title
  - **What changed**: plain-language summary
  - **How it was tested**: which tests were added or run
  - **Risks / notes**: anything a reviewer should look at closely

## 7. Report back
Finish with two or three sentences: what was done, whether tests pass, and anything you were unsure about.
