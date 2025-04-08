import java.util.*;
public class fibonacci {
    public static int first =0, sec = 1,third = 0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        // System.out.println("Fibonacci Series: " + fibo(n));
        System.out.print(first+"\t"+sec+"\t");
        fibo(n-2);
    }

    public static void fibo(int n){

        // Simple Approach
    //    int first = 0;
    //    int sec = 1;
    //    int third = 0;
    //    System.out.print(first + "\t" + sec +"\t");

    //    for(int i = 2; i<n; i++){
    //     third = first+sec;
    //     System.out.print(third+"\t");
    //     first = sec;
    //     sec = third;
    //    }

    //Recursive Approach
        if(n>0){
            third = first+sec;
            first = sec;
            sec = third;
            System.out.print(third+"\t");
            fibo(n-1);
        }

    }
}
