import java.util.Scanner;
import java.util.Stack;

public class intPalindrome {
    public static void main(String[] args) {
        int n = 121;

        Stack<Integer> st = new Stack<>();
        int org = n;
        boolean flag = true;
        
        while(n/10!=0){
            int num = n%10;
            st.push(num);
            n=n/10;
        }
        
        for(int i = 0; i<st.size();i++){
            if(org%10 == st.peek()){
                st.pop();
                org=org/10;
            } else{
                flag = false;
                break;
            }
        }
       System.out.println(flag);
    }
}
