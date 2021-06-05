package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Chad Higgins
 */

import java.util.Scanner;

/*
Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers
 as a whole number instead of a decimal.

Write a program to evenly divide pizzas.
Prompt for the number of people, the number of pizzas, and the number of slices per pizza.
Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get.
If there are leftovers, show the number of leftover pieces.

Example Output
How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How many people?");
        double people = in.nextDouble();
        System.out.println("How many pizzas do you have?");
        double pizza = in.nextDouble();
        System.out.println("How many slices per pizza?");
        double slices = in.nextDouble();

        System.out.printf("%.0f people with %.0f pizzas (%.0f slices)\n", people, pizza, pizza*slices);

        System.out.printf("Each person gets %.0f pieces of pizza.\n", pizza*slices/people);

        System.out.printf("There are %.0f leftover pieces.", pizza*slices%people);


    }
}
