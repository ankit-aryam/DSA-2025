import java.util.*;
public class printSubarray{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scn.nextInt();
        System.out.println("Enter the elements of array: ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
    }
}