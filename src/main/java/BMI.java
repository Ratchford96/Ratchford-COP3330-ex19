/*
 * UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Joseph Ratchford
 */

import java.util.Scanner;
public class BMI {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
         int weight;
         int height;
         double bmi;

         System.out.print(" Enter your weight: ");
         weight = scan.nextInt();

         System.out.print(" Enter your height: ");
         height =scan.nextInt();

         bmi = (weight  / (height * height)) * 703;

         System.out.println(" Your BMI is " + bmi %.2f);


         if ( bmi < 18.50)
        {
            System.out.println(" you are within the ideal weight range");
        } else if (bmi > 25.00)
        {
            System.out.println(" You are overweight. You should see your doctor");
        }


    }
}
