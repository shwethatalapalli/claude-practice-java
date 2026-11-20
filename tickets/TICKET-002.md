# TICKET-002: Add task priority and sort by priority

**Type:** Feature
**Difficulty:** Medium

## Description
Tasks need a priority so the most important work can be shown first.

## Acceptance criteria
- Add an enum `Priority` with values `LOW`, `MEDIUM`, `HIGH`.
- `Task` gets a `getPriority()` method.
- Add an overload `addTask(String title, Priority priority)`. The existing `addTask(String title)` keeps working and uses `MEDIUM`.
- A `null` priority throws `IllegalArgumentException` with the message `Priority is required`.
- Add `listTasksByPriority()` that returns tasks ordered HIGH, then MEDIUM, then LOW. Tasks with the same priority keep the order they were added in.
- Existing behaviour and existing tests must not break.
- Tests cover the default, the null case, and the ordering.
