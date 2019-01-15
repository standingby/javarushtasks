package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        List<Human> family = new ArrayList<>();
        Human sin1 = new Human();
        sin1.age = 13;
        sin1.sex = true;
        sin1.name = "Sin1";
        Human sin2 = new Human();
        sin2.age = 37;
        sin2.sex = true;
        sin2.name = "Sin2";
        Human do41 = new Human();
        do41.age = 22;
        do41.sex = false;
        do41.name = "Do41";
        Human pap = new Human();
        pap.age = 123;
        pap.sex = true;
        pap.name = "Pap";
        Human mam = new Human();
        mam.age = 1234;
        mam.sex = false;
        mam.name = "Mam";
        Human ded1 = new Human();
        ded1.age = 228;
        ded1.sex = true;
        ded1.name = "Ded1";
        Human ded = new Human();
        ded.age = 228;
        ded.sex = true;
        ded.name = "Ded";
        Human bab1 = new Human();
        bab1.age = 228;
        bab1.sex = false;
        bab1.name = "Bab1";
        Human bab = new Human();
        bab.age = 220;
        bab.sex = false;
        bab.name = "Bab";
        ArrayList<Human> childs = new ArrayList<>();
        childs.add(sin1);
        childs.add(sin2);
        childs.add(do41);
        pap.children = childs;
        mam.children = childs;
        ded.children.add(pap);
        bab.children.add(pap);
        ded1.children.add(mam);
        bab1.children.add(mam);
        family.add(ded);
        family.add(ded1);
        family.add(bab);
        family.add(bab1);
        family.add(mam);
        family.add(pap);
        family.add(sin1);
        family.add(sin2);
        family.add(do41);
        for (Human member : family) {
            System.out.println(member.toString());
        }
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
