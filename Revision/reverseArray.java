package Revision;
import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int i =0, j=n-1;

        while(j>i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int k = 0; k<n; k++){
            System.out.print(arr[k]+" ");
        }

    }
}
