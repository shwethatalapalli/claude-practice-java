package com.example.tasks;

/** A single task. Plain data holder, no framework needed. */
public class Task {

    private final int id;
    private final String title;
    private final boolean done;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.done = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return done;
    }
}
