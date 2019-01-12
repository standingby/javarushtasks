package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        StringBuilder stringList = new StringBuilder();
        for (String string : s.split("\\s+")) {
            String newVal = string.substring(0, 1).toUpperCase() + string.substring(1);
            stringList.append(newVal).append(" ");
        }
        System.out.println(stringList.toString().trim());
    }
}
