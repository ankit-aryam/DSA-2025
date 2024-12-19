import java.util.*;

public class primeNumber{
    public static void main(String[] args) {

        //Simple Method
         Scanner scn = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int n = scn.nextInt();

        // boolean flag=false;

        // for(int i=2;i<n;i++){
        //     if(n%i==0){
        //         flag=true;
        //     }
        // }

        // if(flag==true){
        //     System.out.println(n + " is Prime");
        // } else{
        //     System.out.println(n + " is not Prime");
        // }

        // A bit complex and optimized code
        int t = scn.nextInt();
        for(int i=0;i<t;i++){
            int n = scn.nextInt();

            boolean prime = false;
            for(int j=2; j*j<=n;j++){                //square root is sufficient to determine primality.
                if(n%j==0){
                    prime=true;
                    break;
                }
            }

            if(prime){
                System.out.println(n + " Is Prime");
            } else{
                System.out.println(n + " Is Not Prime");
            }
        }

    }
}
