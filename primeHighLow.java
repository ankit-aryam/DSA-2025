import java.util.*;
public class primeHighLow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Lower number");
        int low = scn.nextInt();
        System.out.println("Enter a Higher number");
        int high = scn.nextInt();

        while(low<=high){
            boolean isPrime = false;
           for(int i=2;i*i<=low;i++){
                if(low%i==0){
                    isPrime=true;
                    break;
                }
           }
           if(isPrime){
            System.out.println(low + " Is Prime");
           } else{
            System.out.println(low + " Is Not Prime");
           }

           low++;
        }
    }
}
