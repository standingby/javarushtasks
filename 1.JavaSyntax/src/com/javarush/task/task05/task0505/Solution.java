package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Cat lolka = new Cat("Lolka", 2, 3, 5);
        Cat lalka = new Cat("Lalka", 2, 1, 4);
        Cat lulka = new Cat("Lulka", 3, 5, 2);

        System.out.println(lolka.fight(lalka));
        System.out.println(lolka.fight(lulka));
        System.out.println(lulka.fight(lalka));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
