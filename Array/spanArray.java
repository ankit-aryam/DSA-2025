import java.util.*;
public class spanArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array memory size: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<n;i++){
            arr[i] = scn.nextInt();
        }

        int big = 0;
        int small = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>big){
                big = arr[i];
            }
            if(arr[i]<small){
                small = arr[i];
            }
        }
        int span = big-small;
        System.out.println("The span is: "+ span);

    }
}
