package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b;
        if (a < 0) {
            b = a + 1;
        } else if (a > 0) {
            b = a * 2;
        } else {
            b = a;
        }

        System.out.println(b);
    }

}