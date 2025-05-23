package Revision.Recursion;

import java.util.Scanner;

public class sumOfNnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = scn.nextInt();

        System.out.println(sum(n));
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}
