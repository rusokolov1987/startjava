package com.startjava.lesson_2.person;

public class Person {

    String sex = "male";
    String name = "Alex";
    double weight = 84.5;
    int age = 33;

    public void move() {
        System.out.println("Иду");
    }

    public void sit() {
        System.out.println("Сижу ");
    }

    public void run() {
        System.out.println("Бегу");
    }

    public void talk() {
        System.out.println("Говорю");
    }

    public void studyJava() {
        System.out.println("Изучаю Java");
    }
}