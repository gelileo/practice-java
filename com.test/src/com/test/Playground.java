package com.test;

import java.text.SimpleDateFormat;
import java.util.*;

public class Playground {
    public void testDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = new GregorianCalendar();
        Date currentDate = calendar.getTime();
        System.out.println("Today: " + sdf.format(currentDate));
        calendar.setTime(new Date());
//        calendar.set(1977, 9, 16);
        Date johnBirthday = calendar.getTime();
        System.out.println("John’s Birthday: " + sdf.format(johnBirthday));
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Day: " + day);
        int month = calendar.get(Calendar.MONTH);
        System.out.println("Month: " + month);
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Year: " + year);
    }

    private String[] charArray2String(char[] charArray) {
        return new String(charArray).split(" ");
    }


    private char[][] splitCharArray(char[] charArray) {
        String[] words = charArray2String(charArray);

        char[][] ret = new char[words.length][];
        for (int i=0; i<words.length; i++) {
            ret[i] = words[i].toCharArray();
        }

        return ret;
    }

    public void splitCharArray() {
        char[] javaCharArray = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', ' ', 'l','e', 'o'};
        char[][] result = splitCharArray(javaCharArray);
        for (char[] item : result) {
            //System.out.println(item);
            for (char c: item) {
                System.out.print(' ');
                System.out.print(c);
            }
            System.out.println(",");
        }
    }



}