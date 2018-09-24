package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(reader.readLine());
        String s = "";
        if (i >= 1 && i <= 999) {

            if (i % 2 == 0) {
                s += "четное ";
            } else {
                s += "нечетное ";
            }

            if (String.valueOf(i).length() == 1) {
                s += "однозначное число";
            } else if (String.valueOf(i).length() == 2) {
                s += "двузначное число";
            } else if (String.valueOf(i).length() == 3) {
                s += "трехзначное число";
            }
            System.out.println(s);
        }


    }
}
