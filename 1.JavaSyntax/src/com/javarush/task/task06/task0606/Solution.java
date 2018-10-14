package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //int num = Integer.parseInt(reader.readLine());
        String num = reader.readLine();
        int n;

        String[] numbers = num.split("");
        for (String number : numbers) {
            n = Integer.parseInt(number);
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }


        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
