package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public static void main(String[] args) {

    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int score = 0;
        int anotherScore = 0;

        if (this.age > anotherCat.age) anotherScore++;
        else score++;
        if (this.weight > anotherCat.weight) score++;
        else anotherScore++;
        if (this.strength > anotherCat.strength) score++;
        else anotherScore++;
        return score > anotherScore;
    }
}
