import java.util.*;

public class rotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n =scn.nextInt();
        System.out.println("Enter the elements of array: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the rotation value: ");
        int k= scn.nextInt();

        k = k%arr.length;
        if(k<0){
            k = k+arr.length;
        }

        //Part 1
        reverse(arr, 0, arr.length-k-1);

        //part 2
        reverse(arr, arr.length-k, arr.length-1);

        //full array rotate
        reverse(arr, 0, arr.length-1);

        System.out.println("The rotated arraye is: ");

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }

    public static void reverse(int[] arr,int i,int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    
}
