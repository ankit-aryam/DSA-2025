package Revision.Recursion;

import java.util.Scanner;

public class powerOfN {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = scn.nextInt();
        System.out.println("Enter the Power: ");
        int p = scn.nextInt();

        System.out.println(power(n, p));
    }

    public static long power(int n, int p){
        if(n==0){
            return 1;
        }

        return n*power(n, p-1);

    }
}
