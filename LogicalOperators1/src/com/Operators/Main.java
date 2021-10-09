package com.Operators;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Logical Operators
        // Logical Operators with user input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your cash Amount : ");
        int cash = sc.nextInt();
        // pen = 10, notebook = 40
        if(cash < 10){
            System.out.println("can't buy any thing");
            System.out.println("get more cash");
        }else if(cash > 10 && cash < 40){
            System.out.println("can get 1 thing");
        }else {
            System.out.println("can get both");
        }
    }
}
