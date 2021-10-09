package com.Operators;

public class Main {

    public static void main(String[] args) {
	    // Operators
        // Logical Operators
        //  &&(logical and) -> both condition are true then function print value
        // ||(logical or) -> any one condition are true then function print value
        // !(logical not) -> convert true to false,false to true

        int a = 30;
        int b = 40;

        //if(a<50 && b<50)
        //    System.out.println("both less than 50");

        //if(a>50 || b< 50)
        //    System.out.println("atleast one less than 50");

        boolean isSunUp = true;
        if(!isSunUp) {
            System.out.println("day");
        }else {
            System.out.println("night");
        }
    }
}
