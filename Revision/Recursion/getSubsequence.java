package Revision.Recursion;

import java.util.*;

public class getSubsequence {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scn.nextLine();

        ArrayList<String> subsequence = getSequence(str);

        System.out.println(subsequence);
    }

    public static ArrayList<String> getSequence(String str){
        if(str.length()==0){
            ArrayList<String> es = new ArrayList<>();
            es.add("");
            return es;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> avls = getSequence(ros);
        
        ArrayList<String> nssl = new ArrayList<>();
        for(String cs:avls){
            nssl.add(cs+ch);
            nssl.add(""+cs);
        }

        return nssl;
    }
}
