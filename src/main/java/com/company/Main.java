package com.company;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("What is your age? ");
        int age = Integer.parseInt(scan.nextLine());
        final String out = age >= 16
                ?"You are old enough to legally drive."
                :"You are not old enough to legally drive.";
        System.out.println(out);

        // write your code here
    }
}
