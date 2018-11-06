package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add((int) (Math.random() * 1000));
        }
        System.out.println(set);
        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код
        /*for (int i = 0; i < set.size(); i++) {
            if (set. > 10) {
                set.remove(num);
            }
        }*/

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            int temp = (int) iterator.next();
            if (temp > 10) {
                iterator.remove();
            }
        }

        return set;
    }

    public static void main(String[] args) {
    }
}
