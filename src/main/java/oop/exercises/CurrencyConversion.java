/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class CurrencyConversion
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("How many euros are you exchanging? ");
        String input = in.nextLine();
        int euros = Integer.parseInt(input);
        System.out.print("What is the exchange rate? ");
        input = in.nextLine();
        double rate = Double.parseDouble(input);

        //processing
        double dollars = euros * rate;
        if((dollars * 1000) % 10 > 5)
        {
            dollars += 0.01;
        }

        //output
        System.out.printf("%d euros at an exchange rate of " + input + " is\n%.2f U.S. dollars.", euros, dollars);
    }
}
