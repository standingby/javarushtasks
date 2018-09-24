package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        String day;
        if (a == 1) {
            day = "понедельник";
        } else if (a == 2) {
            day = "вторник";
        } else if (a == 3) {
            day = "среда";
        } else if (a == 4) {
            day = "четверг";
        } else if (a == 5) {
            day = "пятница";
        } else if (a == 6) {
            day = "суббота";
        } else if (a == 7) {
            day = "воскресенье";
        } else {
            day = "такого дня недели не существует";
        }

        System.out.println(day);
    }
}