package Revision.Recursion;

import java.util.*;

public class permutationOfStringL {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scn.nextLine();

        List<String> result = new ArrayList<>();
        permutation(str.toCharArray(), 0, result);

        for(String s:result){
            System.out.println(s);
        }
    }

    public static void permutation(char[] str, int idx, List<String> result){

        if(idx==str.length){
            result.add(new String(str));
            return;
        }


        for(int i=idx;i<str.length;i++){
            swap(i, idx, str);

            permutation(str, idx+1, result);

            swap(i, idx, str);
        }

    }

    public static void swap(int i, int j, char[] str){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;

    }
}
