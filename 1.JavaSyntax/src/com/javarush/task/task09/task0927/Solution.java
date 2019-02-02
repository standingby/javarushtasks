package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> catMap = new HashMap<>();
        Cat mal = new Cat("Mal");
        Cat shal = new Cat("Shal");
        Cat shmal = new Cat("Shmal");
        Cat kal = new Cat("Kal");
        Cat dal = new Cat("Dal");
        Cat cal = new Cat("Cal");
        Cat aal = new Cat("Aal");
        Cat bal = new Cat("Bal");
        Cat pal = new Cat("Pal");
        Cat lal = new Cat("Lal");
        catMap.put(mal.name, mal);
        catMap.put(shal.name, shal);
        catMap.put(shmal.name, shmal);
        catMap.put(kal.name, kal);
        catMap.put(dal.name, dal);
        catMap.put(cal.name, cal);
        catMap.put(aal.name, aal);
        catMap.put(bal.name, bal);
        catMap.put(pal.name, pal);
        catMap.put(lal.name, lal);
        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>();
        for (Map.Entry<String, Cat> entry : map.entrySet()) {
            cats.add(entry.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
