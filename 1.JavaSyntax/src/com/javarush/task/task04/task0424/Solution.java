package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int res = 0;
        if (hasTwoIdenticalNumbers(a, b, c)) {
            if (a == b) {
                res = 3;
            } else if (b == c) {
                res = 1;
            } else {
                res = 2;
            }
            System.out.println(res);
        }
    }

    private static boolean hasTwoIdenticalNumbers(int a, int b, int c) {
        return a == b || b == c || a == c;
    }
}
