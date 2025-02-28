package String;
import java.util.*;
public class stringComp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scn.nextLine();
        String ns = " "+s.charAt(0);
        int count =1;
    
        for(int i = 1; i<s.length();i++){
            char curr = s.charAt(i);
            char pre = s.charAt(i-1);
            
            if(curr != pre){
                if(count>1){
                    ns+=count;
                    count=1;
                }
                ns+=curr;
            }else count++;
            
        }
        System.out.println(ns);
    }
}
