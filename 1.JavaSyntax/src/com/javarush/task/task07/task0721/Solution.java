package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nums[] = new int[20];

        int maximum;
        int minimum;
        int tempMin = Integer.MAX_VALUE;
        int tempMax = Integer.MIN_VALUE;

        //напишите тут ваш код

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > tempMax) {
                tempMax = nums[i];
            }
            if (nums[i] < tempMin) {
                tempMin = nums[i];
            }
        }
        maximum = tempMax;
        minimum = tempMin;

        System.out.print(maximum + " " + minimum);
    }
}
