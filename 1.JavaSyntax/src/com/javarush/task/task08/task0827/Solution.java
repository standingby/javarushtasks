package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 2 2013"));
    }

    //TODO: Date, Calendar works
    public static boolean isDateOdd(String date) throws ParseException {
        boolean result = false;
        DateFormat df = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date date1 = df.parse(date);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date1);
        if (calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0) {
            result = true;
        }
        return result;
    }
}
