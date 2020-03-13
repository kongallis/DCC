package com.codewithkon;

import java.util.Scanner;

public class Main {

    /*
    Given an array of integers, determine whether it contains a Pythagorean triplet.
    Recall that a Pythogorean triplet (a, b, c) is defined by the equation a^2+ b^2= c^2.
     */

    public static void main(String[] args) {


        pythagoreanTriplet();

    }

    static void pythagoreanTriplet() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give number a");
        int a = input.nextInt();

        System.out.println("Please give number b");
        int b = input.nextInt();

        System.out.println("Please give number c");
        int c = input.nextInt();

        int aSquared = a * a;
        int bSquared = b * b;
        int cSquared = c * c;

        if (aSquared + bSquared == cSquared) {
            System.out.println("PYTHAGOREAN triplet");
        } else {
            System.out.println("NOT a Pythagorean triplet");
        }
    }


}
