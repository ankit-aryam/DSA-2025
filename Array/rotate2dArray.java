import java.util.*;
public class rotate2dArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter row and col of 2D array: ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println("Enter the elements of 2D array: ");
        int arr[][] = new int[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        //Transpose the matrix
        for(int i = 0; i<arr.length;i++){
            for(int j = i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Now reverse the matrix
        for(int i =0;i<arr.length;i++){
            int li = 0;
            int ri = arr.length-1;

            while(li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
        }


    }
}
