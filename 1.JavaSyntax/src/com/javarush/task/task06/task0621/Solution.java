package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gFatherName = reader.readLine();
        Cat gFather = new Cat(gFatherName);

        String gMotherName = reader.readLine();
        Cat gMother = new Cat(gMotherName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, null, gFather);

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName, gMother,null);

        String lolName = reader.readLine();
        Cat lol = new Cat(lolName, mother, father);

        String lolkaName = reader.readLine();
        Cat lolka = new Cat(lolkaName, mother, father);

        System.out.println(gFather);
        System.out.println(gMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(lol);
        System.out.println(lolka);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String motherString = "no mother, ";
            String fatherString = "no father";
            String mainStr = "The cat's name is " + name + ", ";
            if (mother != null) motherString = "mother is " + mother.name + ", ";
            if (father != null) fatherString = "father is " + father.name;
            return mainStr + motherString + fatherString;
        }
    }

}
