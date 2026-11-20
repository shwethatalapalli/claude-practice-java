# TICKET-003: Bug - addTask accepts empty titles

**Type:** Bug
**Difficulty:** Easy

## Description
`addTask("")` and `addTask("   ")` currently create tasks with a blank title. `addTask(null)` is also accepted. This makes the task list look broken.

## Steps to reproduce
1. Create a `TaskStore`.
2. Call `addTask("   ")`.
3. Call `listTasks()` and see a task with a blank title.

## Acceptance criteria
- A title that is `null` or empty after trimming spaces throws `IllegalArgumentException` with the message `Title is required`.
- A valid title is stored trimmed, so `"  Pay bills  "` is saved as `"Pay bills"`.
- A rejected call must not consume an id (the next valid task still gets the next number).
- A failing test reproducing the bug is added before the fix.
