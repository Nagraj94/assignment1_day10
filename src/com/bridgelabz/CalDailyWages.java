package com.bridgelabz;

public class CalDailyWages {

    public static int WAGES_PER_HOURS = 20;

    public static void main(String[] args) {

        int empHrs = 8;
        int wages;

        wages = empHrs * WAGES_PER_HOURS;
        System.out.println("daily wages of employee is: " + wages);


    }
}
