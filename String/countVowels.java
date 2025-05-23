package String;
import java.util.*;


public class countVowels {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scn.nextLine();
        int count = 0;
        
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(vowel(ch)){
                count++;
            }
        }
        System.out.println("This string contains "+count+" vowels");
    }

    public static Boolean vowel(char ch){
        Character[] arr = {'a','e','i','o','u'};

        for(int i = 0; i<arr.length;i++){
            if(ch==arr[i]){
                return true;
            } 
        }
        return false;
    }
}
