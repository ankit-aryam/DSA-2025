package Revision.Recursion;

import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = scn.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print(fibonacci(i) + " ");
        }


    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);

    }
}
