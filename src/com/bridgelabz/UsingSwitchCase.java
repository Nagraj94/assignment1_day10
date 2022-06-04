package com.bridgelabz;

import java.util.Random;

public class UsingSwitchCase {

    public static void main(String[] args) {

        final int FULL_DAY = 1;
        final int HALF_DAY = 2;
        final int WAGES_PER_HOURS = 20;

        int empHrs = 0;

        Random run = new Random();
        int check = run.nextInt(3);

        switch (check) {
            case FULL_DAY -> {
                empHrs = 8;
                System.out.println("full timer");
            }
            case HALF_DAY -> {
                empHrs = 4;
                System.out.println("part timer");
            }
            default -> System.out.println("absent");
        }

        int wages = empHrs * WAGES_PER_HOURS;
        System.out.println("total employee wages: " + wages);

    }
}
