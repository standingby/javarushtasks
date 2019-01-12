package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Lol", "Kek");
        map.put("Kek", "Lol");
        map.put("Lol", "Lol");
        map.put("Kek", "Kek");
        map.put("Lel", "Kek");
        map.put("Lul", "Kok");
        map.put("Lil", "Kik");
        map.put("Kik", "Kok");
        map.put("Lul", "Lel");
        map.put("Lel", "Lel");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
