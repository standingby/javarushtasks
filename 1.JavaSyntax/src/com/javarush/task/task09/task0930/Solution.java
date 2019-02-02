package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!isNumber(array[i])) {
                for (int k = array.length - 1; k > i; k--) {
                    String s = array[i];
                    String temp = array[k];
                    if (isNumber(temp)) continue;
                    if (isGreaterThan(s, temp)) {
                        array[i] = temp;
                        array[k] = s;
                    }
                }
            } else {
                for (int k = array.length - 1; k > i; k--) {
                    int s = Integer.parseInt(array[i]);
                    if (!isNumber(array[k])) continue;
                    int temp = Integer.parseInt(array[k]);
                    if (s < temp) {
                        array[i] = String.valueOf(temp);
                        array[k] = String.valueOf(s);
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
