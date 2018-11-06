package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Pedr", "Pedro");
        map.put("Kedr", "Kedro");
        map.put("Dedr", "Dedro");
        map.put("Sedr", "Sedro");
        map.put("Vedr", "Vedro");
        map.put("Nedr", "Nedro");
        map.put("Zedr", "Zedro");
        map.put("Qedr", "Qedro");
        map.put("Ledr", "Ledro");
        map.put("Tedr", "Tedro");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int res = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (name.equals(entry.getValue())) {
                res++;
            }
        }
        return res;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int res = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (lastName.equals(entry.getKey())) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
