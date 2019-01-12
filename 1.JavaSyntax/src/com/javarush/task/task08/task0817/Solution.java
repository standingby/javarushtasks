package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Lol", "Kek");
        map.put("Lul", "Kuk");
        map.put("Lal", "Kak");
        map.put("Lel", "Kek");
        map.put("Lil", "Kik");
        map.put("Lyl", "Kuk");
        map.put("Leal", "Keak");
        map.put("Laul", "Kik");
        map.put("Loeil", "Kak");
        map.put("Lodsl", "Kik");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        List<String> list = new ArrayList<>(map.values());
        for(String value : list) {
            if (Collections.frequency(list, value) > 1) {
                removeItemFromMapByValue(map, value);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
    }
}
