import java.util.*;
public class inverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scn.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of of array: ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int inv[] = new int[n];
        for(int i=0;i<n;i++){
            int v = arr[i];
            inv[v] = i;
        }

        System.out.println("The Value: ");
        for(int i=0;i<n;i++){
            System.out.println(inv[i]);
        }

    }
}
