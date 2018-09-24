package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int i = 0;
        int k = 0;
        if (checkNegativePositive(a)) i++; else if (a == 0); else k++;
        if (checkNegativePositive(b)) i++; else if (b == 0); else k++;
        if (checkNegativePositive(c)) i++; else if (c == 0); else k++;

        System.out.println("количество отрицательных чисел: " + k);
        System.out.println("количество положительных чисел: " + i);
    }

    private static boolean checkNegativePositive(int a) {
        return a > 0;
    }
}
