package com.Loops;

public class Main {

    public static void main(String[] args) {
        // Continue statements

        int i = 0;

        while (true) {
            if(i == 5){         // or (i == 5 || i == 6)
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if (i > 10) {
                break;
            }

        }
    }
}
