package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int cnt = 10;
        int temp = 1;
        for (int i = 1; i <= cnt; i++) {
            temp = temp * i;
        }
        System.out.println(temp);
    }
}
