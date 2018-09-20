package com.javarush.task.task01.task0121;

/* 
Контракт
*/

import java.lang.reflect.Array;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[] sal = {800, 1500, 2200, 2700, 3200};
        String[] year = {"в первый", "во второй", "в третий", "в четвертый", "в пятый"};

        System.out.println("Меня зовут Амиго.\n");
        for (int i = 0; i < sal.length; i++) {
            System.out.println("Я согласен на зарплату $" + sal[i] + "/месяц " + year[i] + " год.");
        }

        System.out.println("\nПоцелуй мой блестящий металлический зад!");
    }
}
