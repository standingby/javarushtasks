package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();

        strings.add("asd");
        strings.add("1241gsdf");
        strings.add("ewtherh");
        strings.add("dghjtgymkjk");
        strings.add("rewtrihi3w23");

        System.out.println(strings.size());

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
