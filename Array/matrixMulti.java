import java.util.*;
public class matrixMulti {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Row and Column Size of First Array: ");
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int [][] arr1 = new int[r1][c1];
        System.out.println("Enter Elements of First Array: ");
        for(int i= 0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j] = scn.nextInt();
            }
        }

        System.out.println("Enter Row and Column Size of Second Array: ");
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int [][] arr2 = new int[r2][c2];
        System.out.println("Enter Elements of Second Array: ");
        for(int i= 0;i<r1;i++){
            for(int j=0;j<arr2[0].length;j++){
                arr2[i][j] = scn.nextInt();
            }
        }

        int [][] prod = new int[c2][r1];
        for(int i = 0;i<c2;i++){
            for(int j=0;j<r1;j++){
                for(int k =0;k<c2;k++){
                    prod[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }

        for(int i=0;i<prod.length;i++){
            for(int j=0;j<prod[0].length;j++){
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }


    }
}
