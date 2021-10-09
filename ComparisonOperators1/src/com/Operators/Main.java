package com.Operators;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // ComparisonOperators
        // Comparison Operators with user input

        Scanner sc = new Scanner(System.in);
        System.out.print("User enter your Age : ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You can drive bike");
        }else {
            System.out.println("you can't drive bike");
        }
    }
}
