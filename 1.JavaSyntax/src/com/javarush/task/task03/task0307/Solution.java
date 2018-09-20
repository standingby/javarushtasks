package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();

        zerg1.name = "Lal";
        zerg2.name = "Kek";
        zerg3.name = "Cheboorek";
        zerg4.name = "Lol";
        zerg5.name = "Lul";
        protoss1.name = "Lil";
        protoss2.name = "Lel";
        protoss3.name = "Lyl";
        terran1.name = "Zez";
        terran2.name = "Zaz";
        terran3.name = "Zuz";
        terran4.name = "Zoz";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
