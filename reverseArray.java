import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n;i++){
            arr[i]= scn.nextInt();
        }
        
        int j =arr.length-1;
        for(int i=0;i<n/2;i++){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
