package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int temp = 0;
        int cntr = 0;

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (String string : list) {
            int len = string.length();
            if (len > temp) {
                temp = len;
            } else if (len == temp) {
                continue;
            } else {
                if (cntr == 0) {
                    cntr++;
                    System.out.println(list.indexOf(string));
                }
            }
        }
    }
}

