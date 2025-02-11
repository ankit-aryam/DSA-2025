package String;

import java.util.*;

public class palindrome { 

    public static boolean isPalindrome(String s) { 
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) { 
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scn.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String ss = str.substring(i, j);
                if (isPalindrome(ss)==true) { 
                    System.out.println(ss);
                }
            }
        }
    }
}