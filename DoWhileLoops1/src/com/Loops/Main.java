package com.Loops;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // do while loops
        // do while loops with user input

        int num;
        do{
            System.out.print("enter the number : ");
            Scanner sc = new Scanner(System.in);
            num =sc.nextInt();
            System.out.print("Your number is : ");
            System.out.println(num);
        }while (num >= 0);
        System.out.println("THE END");
    }
}
