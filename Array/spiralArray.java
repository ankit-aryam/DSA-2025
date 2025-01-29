import java.util.*;
public class spiralArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int n = scn.nextInt();
        System.out.println("Enter col number: ");
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = m-1;
        int tne = n*m;
        int count = 0;

        while(count<tne){
            //left wall
            for(int i=minr,j=minc;i<=maxr && count<tne;i++){
                System.out.print(arr[i][j] + ", ");
                count++;
            }
            minc++;

            //bottom wall
            for(int i=maxr,j=minc;j<=maxc && count<tne;j++){
                System.out.print(arr[i][j] + ", ");
                count++;
            }
            maxr--;

            //right wall
            for(int i=maxr,j=maxc;i>=minr && count<tne;i--){
                System.out.print(arr[i][j] + ", ");
                count++;
            }
            maxc--;

            //top wall
            for(int i=minr,j=maxc;j>=minc && count<tne;j--){
                System.out.print(arr[i][j] + ", ");
                count++;
            }
            minr++;

        }

    }
}
