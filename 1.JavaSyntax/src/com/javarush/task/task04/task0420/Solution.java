package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String astr = reader.readLine();
        String bstr = reader.readLine();
        String cstr = reader.readLine();
        int a = Integer.parseInt(astr);
        int b = Integer.parseInt(bstr);
        int c = Integer.parseInt(cstr);
        int res1 = 0; //maximum
        int res2 = 0; //medium
        int res3 = 0; //minimum
        if (Integer.max(a, b) == a && Integer.max(a, c) == a)
            res1 = a;
        if (Integer.max(a, b) == b && Integer.max(b, c) == b)
            res1 = b;
        if (Integer.max(a, c) == c && Integer.max(c, b) == c)
            res1 = c;
        if (Integer.min(a, b) == a && Integer.min(a, c) == a)
            res3 = a;
        if (Integer.min(a, b) == b && Integer.min(b, c) == b)
            res3 = b;
        if (Integer.min(a, c) == c && Integer.min(c, b) == c)
            res3 = c;
        res2 = a + b + c - res1 - res3;
        System.out.println(res1 + " " + res2 + " " + res3);
    }
}
