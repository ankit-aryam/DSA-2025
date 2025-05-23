package Revision.Recursion;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scn.nextLine();
        boolean result = palindrome(0, str.length()-1, str);

        if(result == true){
            System.out.println("Yes it is");
        } else System.out.println("No it's not palindrome");

    }

    public static boolean palindrome(int start, int end, String str){
        if(start==end){
            return true;
        }

        if(str.charAt(start)==str.charAt(end)){
            return palindrome(start+1, end-1, str);
        } else return false;
        
    }
}
