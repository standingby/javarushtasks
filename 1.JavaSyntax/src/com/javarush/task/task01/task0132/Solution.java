package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String nums = Integer.toString(number);
        String[] numsArr = nums.split("");
        int res = 0;
        for (int i = 0; i < nums.length(); i++) {
            res += Integer.parseInt(numsArr[i]);
        }
        return res;
    }
}