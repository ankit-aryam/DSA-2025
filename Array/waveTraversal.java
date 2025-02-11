import java.util.*;
public class waveTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int r = scn.nextInt();
        System.out.println("Enter the col size: ");
        int c = scn.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the elements of array: ");
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        for(int i=0;i<c;i++){
            if(i%2==0){
                for(int j = 0;j<r;j++){
                    System.out.print(arr[j][i]);
                }
            } else{
                for(int j = arr.length-1;j>=0;j--){
                    System.out.print(arr[j][i]);
                }
            }
        }

    }
}
