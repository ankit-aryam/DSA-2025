import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args){
         Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scn.nextInt();
        System.out.println("Enter the unsorted elements of array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = scn.nextInt();
        }

        for(int i = 0; i<n-1;i++){
            int smallest = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp; 
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
