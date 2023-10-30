package ru.julie.hw1.sample;

import ru.julie.hw1.classes.Task;
import ru.julie.hw1.classes.ToDoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("задача 1");
        toDoList.addTask(task1);
        Task task2 = new Task("задача 2");
        toDoList.addTask(task2);
        toDoList.displayTasks();
        toDoList.markTaskAsDone(toDoList.getTaskByNumber(1));
        toDoList.displayTasks();

    }
}
