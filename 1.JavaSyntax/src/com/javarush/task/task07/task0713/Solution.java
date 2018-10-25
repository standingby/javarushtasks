package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> dividedBy3 = new ArrayList<>();
        ArrayList<Integer> dividedBy2 = new ArrayList<>();
        ArrayList<Integer> others = new ArrayList<>();
        int temp;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            temp = Integer.parseInt(reader.readLine());
            mainList.add(temp);

            if (temp % 3 == 0) dividedBy3.add(temp);
            if (temp % 2 == 0) dividedBy2.add(temp);
            if (temp % 3 != 0 && temp % 2 != 0) others.add(temp);
        }

        printList(dividedBy3);
        printList(dividedBy2);
        printList(others);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
