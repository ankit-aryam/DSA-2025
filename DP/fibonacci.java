package DP;

import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n = scn.nextInt();
        
        int dp[] = new int[n+1];
        //Arrays.fill(dp, -1);
        int fib = fibn(n, dp);
        

        System.out.println(fib);
    }

    public static int fibn(int n, int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        // System.out.println(n);

        int fibo = fibn(n-1, dp) + fibn(n-2, dp);
        dp[n] = fibo;
        return fibo;
    }
}
