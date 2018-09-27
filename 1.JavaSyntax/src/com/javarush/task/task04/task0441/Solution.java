package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int res;

        int [] arr = new int [3];      // создаем массив
        arr [0] = a;               // присваивам массиву введенное число.
        arr [1] = b;               // присваивам массиву введенное число.
        arr [2] = c;               // присваивам массиву введенное число.
        Arrays.sort(arr);               // сортируем массив по возрастанию.
        System.out.println(arr[1]);     // выводим второе число.
    }
}
