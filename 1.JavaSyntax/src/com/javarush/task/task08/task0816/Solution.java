package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Lal", df.parse("OCTOBER 2 1921"));
        map.put("Kal", df.parse("SEPTEMBER 12 1212"));
        map.put("Pal", df.parse("NOVEMBER 3 1234"));
        map.put("Xal", df.parse("JULY 23 1982"));
        map.put("Hal", df.parse("AUGUST 25 1562"));
        map.put("Qal", df.parse("JANUARY 12 1873"));
        map.put("Fal", df.parse("FEBRUARY 8 1521"));
        map.put("Dal", df.parse("MARCH 12 1942"));
        map.put("Sal", df.parse("MAY 12 1212"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        for (Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Date> entry = it.next();
            Date date = entry.getValue();
            LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int month = localDate.getMonthValue();
            if (month > 5 && month < 9) {
                it.remove();
            }
        }

    }

    public static void main(String[] args) throws ParseException {
    }
}
