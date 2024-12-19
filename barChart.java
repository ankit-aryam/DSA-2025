import java.util.Scanner;

public class barChart {
      public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array memory size: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<n;i++){
            arr[i] = scn.nextInt();
        }

        int max = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
       
         for(int floor=max; floor>=1; floor--){ 
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=floor){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            }
            System.out.println();
         }
        

    }
}
