package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int inp;
        int temp = -2147483648;

        for (int i = 0; i < n; i++) {
            inp = Integer.parseInt(reader.readLine());
            if (inp > temp) {
                temp = inp;
            }
        }

        System.out.println(temp);
    }
}

