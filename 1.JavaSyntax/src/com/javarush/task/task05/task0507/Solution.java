package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        int sum = 0;
        int a;

        while (true) {
            a = Integer.parseInt(reader.readLine());

            if (a == -1) {
                System.out.print((double) sum/cnt);
                break;
            }

            cnt ++;
            sum += a;
        }
    }
}

