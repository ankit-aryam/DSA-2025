import java.util.*;
public class saddlePoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the size of 2D array: ");
        int n = scn.nextInt();
        System.out.println("Enter the elements of 2D array: ");
        int arr[][] = new int[n][n];
        for(int i = 0; i<n;i++){
            for(int j =0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int i =0;i<arr.length;i++){
            int lvi = 0;
            for(int j=0;j<arr[0].length;j++){
            if(arr[i][lvi]<arr[i][j]){
                lvi = j;
            }
        }

            boolean flag = true;
            for(int k = 0;k<arr.length;k++){
                if(arr[i][lvi]>arr[k][lvi]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(arr[i][lvi]);
                return;
            }
            
        }
        System.out.println("Invalid Input");
        
    }
}
