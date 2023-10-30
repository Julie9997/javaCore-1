package ru.julie.hw1.classes;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void markTaskAsDone(Task task) {
        task.markAsDone();
    }

    public void markTaskAsUndone(Task task) {
        task.markAsUndone();
    }

    public Task getTaskByNumber(int number) {
        if (number >= 1 && number <= tasks.size()) {
            return tasks.get(number - 1);
        } else {
            throw new IllegalArgumentException("Некорректный номер");
        }
    }

    public void displayTasks() {
        System.out.println("Задачи:");

        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            String status = task.isDone() ? "[X]" : "[ ]";
            System.out.println(i + 1 + ". " + status + " " + task.getDescription());
        }
    }
}

