package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(ward(19, 23));
        System.out.println(ward(46, 15));
        System.out.println(ward(23, 30));
        System.out.println(ward(24, 24));
        System.out.println(ward(13, -12));
        System.out.println(ward(generateRandomAge(), 23));
    }

    public static String ward(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "можно идти гулять";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "можно гулять";

        } else if (age < 45) {
            return "можно гулять";
        } else
            return "оставаяся доме";
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int ran = random.nextInt(100);
        return ran;
    }
}

