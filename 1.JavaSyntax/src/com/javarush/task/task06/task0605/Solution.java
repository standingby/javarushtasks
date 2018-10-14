package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            //напишите тут ваш код
            double idx = weight / (height * height);
            String result;
            double underweight = 18.5;
            double normal = 25;
            double excessWeight = 30;
            if (idx < underweight) {
                result = "Недовес: меньше чем 18.5";
            } else if (idx >= underweight && idx < normal) {
                result = "Нормальный: между 18.5 и 24.9";
            } else if (idx >= normal && idx < excessWeight) {
                result = "Избыточный вес: между 25 и 29.9";
            } else {
                result = "Ожирение: 30 или больше";
            }
            System.out.println(result);
        }
    }
}
