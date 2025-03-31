import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scn.nextInt();
        System.out.println("Enter the unsorted elements of array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = scn.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The number we want to insert
            int j = i - 1;

            // Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert the key at the correct position
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
