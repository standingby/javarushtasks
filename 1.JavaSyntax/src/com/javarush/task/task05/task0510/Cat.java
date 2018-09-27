package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;
    int avgWeight = 2;
    int avgAge = 2;
    String defaultColor = "Brown";

    public void initialize(String name) {
        this.name = name;
        this.weight = avgWeight;
        this.age = avgAge;
        this.color = defaultColor;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = defaultColor;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.weight = avgWeight;
        this.age = age;
        this.color = defaultColor;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.age = avgAge;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.age = avgAge;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
