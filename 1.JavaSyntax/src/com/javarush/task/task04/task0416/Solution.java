package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double inp = Double.parseDouble(reader.readLine());

        if (inp % 5 < 3) {
            System.out.println("зеленый");
        } else {
            if (inp % 5 < 4) {
                System.out.println("желтый");
            } else {
                System.out.println("красный");
            }
        }
    }
}