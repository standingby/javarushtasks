package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int y = 1;
        while (y <= 10) {
            int x = 1;
            while (x <= 10) {
                System.out.print(y * x + " ");
                x++;
            }
            y++;
            System.out.println();
        }
    }
}
