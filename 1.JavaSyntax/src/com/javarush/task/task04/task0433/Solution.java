package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n = 0;
        int k = 0;

        while (k < 10) {
            System.out.print("S");
            n++;
            if (n % 10 == 0) {
                System.out.println();
                k++;
            }
        }
    }
}
