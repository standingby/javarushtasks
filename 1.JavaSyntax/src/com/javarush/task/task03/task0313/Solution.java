package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String[] arr = {"Мама", "Мыла", "Раму"};
        System.out.println(arr[0] + arr[1] + arr[2]);
        System.out.println(arr[0] + arr[2] + arr[1]);
        System.out.println(arr[1] + arr[0] + arr[2]);
        System.out.println(arr[1] + arr[2] + arr[0]);
        System.out.println(arr[2] + arr[1] + arr[0]);
        System.out.println(arr[2] + arr[0] + arr[1]);
    }
}
