package com.examples;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        int People;
        System.out.print("How many people? ");
            People = myObj.nextInt();

        int Pizzas;
        System.out.print("How many pizzas do you have? ");
            Pizzas = myObj.nextInt();

        int Slices;
        System.out.print("How many slices per pizza? ");
            Slices = myObj.nextInt();

        int TotalSlices = Slices * Pizzas;
        int PiecesofPizza = TotalSlices / People;
        int LeftOver = TotalSlices % People;

        System.out.println(People + " people with " + Pizzas + " pizzas (" + TotalSlices + " Slices)");
        System.out.println("there are " + LeftOver + " leftover pizzas");
    }
}
