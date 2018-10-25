package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int temp_min = Integer.MAX_VALUE;
        int temp_max = Integer.MIN_VALUE;
        int temp_idx_max = -1;
        int temp_idx_min = -1;

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (String string : list) {
            int len = string.length();
            if (len > temp_max) {
                temp_max = len;
                temp_idx_max = list.indexOf(string);
            }
            if (len < temp_min) {
                temp_min = len;
                temp_idx_min = list.indexOf(string);
            }
        }

        if (temp_idx_min < temp_idx_max) {
            System.out.println(list.get(temp_idx_min));
        } else {
            System.out.println(list.get(temp_idx_max));
        }
    }
}
