package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        String s = "";
        if (a == 0) {
            s = "ноль";
        } else if (a % 2 == 0) {
            if (a < 0) {
                s = "отрицательное четное число";
            } else {
                s = "положительное четное число";
            }
        } else if (a % 2 != 0) {
            if (a < 0) {
                s = "отрицательное нечетное число";
            } else {
                s = "положительное нечетное число";
            }
        }
        System.out.println(s);
    }
}
