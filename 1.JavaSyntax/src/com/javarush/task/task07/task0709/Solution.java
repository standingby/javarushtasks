package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        int temp = Integer.MAX_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        for (String string : strings) {
            if (string.length() < temp) {
                temp = string.length();
                result.clear();
                result.add(0, string);
            } else if (string.length() == temp) {
                result.add(string);
            }
        }

        for (String string : result) {
            System.out.println(string);
        }
    }
}
