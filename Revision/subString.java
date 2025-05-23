package Revision;
import java.util.*;

public class subString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scn.nextLine();
        for(int i = 0; i<str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }

        System.out.println("Do you want recursive way?(Y/N): ");
        Character op = scn.next().charAt(0);

        if(op=='Y' || op=='y'){
            subs(str, 0);
        }
    }

    public static void subs(String str, int start){
        if(start==str.length()){
            return;
        }

        for(int i = start+1; i<=str.length(); i++){
            System.out.println(str.substring(start, i));
        }
        subs(str, start+1);
    }
}
