package Revision.Recursion;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scn.nextLine();
        String reversedStr = "";


       System.out.println("Reversed String: " + reverse(0,reversedStr, str));
    }

    public static String reverse(int idx, String rvrs, String str){
        if(idx==str.length()){
            return rvrs;
        }

        rvrs = str.charAt(idx) + rvrs;
        return reverse(idx+1, rvrs, str);

    }
}
