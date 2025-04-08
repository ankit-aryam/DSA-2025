import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = scn.nextInt();
        System.out.println("Factorial: " + factorial(n));

    }

    public static long factorial(long n){
        if(n==1) return 1;

        return n*factorial(n-1);

    }
}
