package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().toCharArray();
        List<String> gl = new ArrayList<>();
        List<String> sgl = new ArrayList<>();

        for (char character : chars) {
            String value = String.valueOf(character);
            if (value.equals(" ")) {
                continue;
            }

            if (isVowel(character)) {
                gl.add(value);
            } else {
                sgl.add(value);
            }
        }

        for (String s : gl) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (String s : sgl) {
            System.out.print(s + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}