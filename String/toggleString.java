package String;
import java.util.*;

public class toggleString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = scn.nextLine();
        StringBuilder sb = new StringBuilder(word);
        for(int i = 0; i<word.length();i++){
            char ch = sb.charAt(i);
            if(ch>='a' && ch<='z'){
                ch = (char)('A'+ch-'a');
                sb.setCharAt(i, ch);
            } else if(ch>='A' && ch<='Z'){
                ch = (char)('a'+ch-'A');
                sb.setCharAt(i, ch);
            }
        }
        System.out.println("Updated String: "+ sb);
    }
}
