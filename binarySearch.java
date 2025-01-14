import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");

        for(int i =0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the searchable number: ");
        int num = scn.nextInt();

        int l = 0;
        int h = arr.length;

        while(l<=h){

        int m = (l+h)/2;
            if(num == arr[m]){
                System.out.println("Number is at index: " + m);
                return;
            } else if(num>arr[m]){
                l = m+1;
            } else {
                h = m-1;
            } 
        }
        System.out.println("Number not found");
    }
}
