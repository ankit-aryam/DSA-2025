package Revision.Recursion;

import java.util.*;

public class permutationOfString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scn.nextLine();

        permutation(str.toCharArray(), 0);
    }

    public static void permutation(char[] str, int idx){

        if(idx==str.length){
            System.out.println(str);
            return;
        }


        for(int i=idx;i<str.length;i++){
            swap(i, idx, str);

            permutation(str, idx+1);

            swap(i, idx, str);
        }

    }

    public static void swap(int i, int j, char[] str){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;

    }
}
