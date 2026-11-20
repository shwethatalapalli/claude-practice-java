package com.example.tasks;

import java.util.ArrayList;
import java.util.List;

/** A tiny in-memory task store. No database, no dependencies. */
public class TaskStore {

    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public Task addTask(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Add Title");
        }
        Task task = new Task(nextId++, title.trim());
        tasks.add(task);
        return task;
    }

    public List<Task> listTasks() {
        return List.copyOf(tasks);
    }
}
