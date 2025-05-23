package Revision.Recursion;

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = scn.nextInt();

        System.out.println("Foctorial of "+n +" is " + factorial(n));
    }

    public static long factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
