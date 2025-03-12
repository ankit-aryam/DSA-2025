package String;
import java.util.*;

public class removePrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList <>();
        System.out.println("Enter size of arrayList: ");
        int arsize = scn.nextInt();
        System.out.println("Enter numbers: ");
        for(int i = 0;i<arsize;i++){
            
            list.add(scn.nextInt());
        }
        // for(int i = 0;i<arsize;i++){
            
        //     System.out.println(list.get(i));
        // }

        for(int i = arsize-1; i>=0; i--){
            if(isPrime(list.get(i))){
                list.remove(i);
            }
        }

        System.out.println("List: "+ list);
        

    }
    public static boolean isPrime(int val){
        for(int i =2;i*i<=val;i++){
            if(val%i==0){
                return false;
            }
        }
        return true;
    } 
}
