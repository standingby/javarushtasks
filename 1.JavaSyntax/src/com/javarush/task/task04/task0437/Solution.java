package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        for (int i = 1; i <= 10; i++) {

            for (int k = 1; k <= i; k++) {
                System.out.print(8);
            }
            if (i != 10)
            System.out.println();
        }
    }
}
