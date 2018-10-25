package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human dalba1 = new Human("Dalba", true, 228);
        Human dalba2 = new Human("Malba", false, 1337);
        Human dalba3 = new Human("Kalba", true, 123);
        Human dalba4 = new Human("Salba", false, 1);
        Human dalba5 = new Human("Palba", true, 312, dalba1, dalba2);
        Human dalba6 = new Human("Qalba", false, 412, dalba3, dalba4);
        Human dalba7 = new Human("Halba", true, 4142, dalba5, dalba6);
        Human dalba8 = new Human("Balba", false, 41, dalba5, dalba6);
        Human dalba9 = new Human("Lalba", true, 91823, dalba5, dalba6);

        System.out.println(dalba1.toString());
        System.out.println(dalba2.toString());
        System.out.println(dalba3.toString());
        System.out.println(dalba4.toString());
        System.out.println(dalba5.toString());
        System.out.println(dalba6.toString());
        System.out.println(dalba7.toString());
        System.out.println(dalba8.toString());
        System.out.println(dalba9.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}