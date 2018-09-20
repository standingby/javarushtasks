package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String s = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        if (num1 == num2 && num2 == num3) {
            s = num1 + " " + num2 + " " + num3;
        } else {
            if (num1 == num2 || num1 == num3) {
                s = num1 + " " + num1;
            } else if (num2 == num3) {
                s = num2 + " " + num2;
            }
        }
        if (null != s)
        System.out.println(s);
    }
}