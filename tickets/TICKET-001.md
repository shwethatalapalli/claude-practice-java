# TICKET-001: Add a way to mark a task as complete

**Type:** Feature
**Difficulty:** Easy

## Description
Users can add and list tasks but cannot mark them as done. Add a method `completeTask(int id)` to `TaskStore`.

## Acceptance criteria
- `completeTask(id)` marks the task with that id as done and returns the updated `Task`.
- If no task has that id, it throws `IllegalArgumentException` with the message `Task not found: <id>`.
- Completing an already-completed task is allowed and changes nothing.
- `listTasks()` reflects the completed state.
- Tests cover all of the behaviours above.
