package com.bridgelabz;

import java.util.Random;

public class CheckEmpPresent {

    public static final int FULL_DAY = 1;
    public static final int HALF_DAY = 2;
    public static final int ABSENT = 0;

    public static void main(String[] args) {

        Random random = new Random();
        int check;

        check = random.nextInt(3);
        switch (check){
            case FULL_DAY:
                System.out.println("Employee is present for full day");
                break;
            case HALF_DAY:
                System.out.println("Employee is present for half day");
                break;
            case ABSENT:
                System.out.println("Employee is absent today");
            default:
        }

    }
}
