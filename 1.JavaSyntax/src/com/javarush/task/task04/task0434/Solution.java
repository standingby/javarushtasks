package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n = 0;
        int k = 1;
        int m = 1;

        while (k <= 10) {
            System.out.print((k * m) + " ");
            m++;
            n++;
            if (n % 10 == 0) {
                System.out.println();
                m = 1;
                k++;
            }
        }
    }
}
