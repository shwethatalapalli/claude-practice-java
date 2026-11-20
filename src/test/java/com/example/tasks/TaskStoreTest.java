package com.example.tasks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskStoreTest {

    private TaskStore store;

    @BeforeEach
    void setUp() {
        store = new TaskStore();
    }

    @Test
    void addTaskStoresTaskWithIdAndNotDone() {
        Task task = store.addTask("Write report");
        assertEquals(1, task.getId());
        assertEquals("Write report", task.getTitle());
        assertFalse(task.isDone());
    }

    @Test
    void listTasksReturnsAllTasksInOrder() {
        store.addTask("First");
        store.addTask("Second");
        List<String> titles = store.listTasks().stream().map(Task::getTitle).toList();
        assertEquals(List.of("First", "Second"), titles);
    }

    @Test
    void listTasksReturnsUnmodifiableCopy() {
        store.addTask("Only");
        List<Task> listed = store.listTasks();
        assertThrows(UnsupportedOperationException.class, () -> listed.remove(0));
        assertEquals(1, store.listTasks().size());
    }
}
