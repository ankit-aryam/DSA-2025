import java.util.*;

public class dArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = scn.nextInt();
        System.out.println("Enter number of columns: ");
        int m = scn.nextInt();
        int [][] arr = new int[n][m];

        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("The 2D array is: ");

        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
