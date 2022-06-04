package com.bridgelabz;

import java.util.Random;

public class AddPartTimer {

    public static void main(String[] args) {

         int FULL_DAY = 1;
         int HALF_DAY = 2;

         int empHrs = 0;

        Random run = new Random();
        int check = run.nextInt(3);

        if (check == FULL_DAY)
        {
            empHrs = 8;
            System.out.println("full timer");
        }
        else if (check == HALF_DAY)
        {
            empHrs = 4;
            System.out.println("part timer");
        }
        else
        {
            System.out.println("absent");
        }

        double wages = empHrs * 20;
        System.out.println("total employee wages is: " + wages);

    }
}
