package Revision;
import java.util.*;

import java.util.Scanner;

public class leftRotateByOne {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        
        reverse(1, arr.length-1, arr);

        reverse(0, arr.length-1,arr);

        for(int i= 0; i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }


}

public static int[] reverse(int first, int last, int[] arr){
    while(first<last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] =temp;
        first++;
        last--;
    }
    return arr;
}
}
