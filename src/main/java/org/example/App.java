package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 14 - Tax Calculator");
        double orderamount , tax = 0.0, total1 = 0;
        System.out.print("What is the order amount? ");
        Scanner in = new Scanner(System.in);
        orderamount = Double.parseDouble(in.next());
        System.out.print("What is the state? ");
        String state = in.next();

        if(state.equalsIgnoreCase("WI"))
        {
            System.out.println("The subtotal is $" + orderamount);
            tax = orderamount * (5.5/100.0);
            System.out.println("The tax is $"+tax);
        }
        else if(state.equalsIgnoreCase("MN"))
        {
            tax = 0.0;
        }
        total1 = orderamount + tax;
        System.out.print("The total is $" + total1);

    }
}
