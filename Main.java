package grand.circus;

import java.util.Scanner;

public class Main {
    /* Original source code from Programming Simplified website. Modified to answer the Grand Circus Deliverables. Assignment by Ny Derry*/
    public static void main (String[] args)
     {
// Initialize and declare all variables
        int n         = 0;
        int sum       = 0;
        int temp      = 0;
        int remainder = 0;
        int digits    = 0;

// Receive Input from User to evaluate
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to check if the sum of the cubed digits equal the original number (an Armstrong number).");
        n = in.nextInt();

// Setup temporary number to parse digits
        temp = n;

// Count number of digits and evaluate separate digits and sum cubed values

        while (temp != 0) {
            digits++;
            temp = temp/10;
        }

        temp = n;

        while (temp != 0) {
            remainder = temp%10;
            sum = sum + power(remainder, digits);
            temp = temp/10;
        }

// Compare original number to sum of cubed digits for logic statement
        if (n == sum)
            System.out.println("True");
        else
            System.out.println("False");
    }

    static int power(int n, int r) {
        int c, p = 1;

        for (c = 1; c <= r; c++)
            p = p*n;

        return p;
    }
}

