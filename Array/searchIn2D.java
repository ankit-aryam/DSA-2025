import java.util.*;
public class searchIn2D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter row and col number: ");
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter the target number: ");
        int target = scn.nextInt();

        int i =0;
        int j = arr[0].length -1;

        while(i<arr.length && j>=0){
            if(arr[i][j]==target){
                System.out.println(i + ", " + j);
                return;
            } else if(arr[i][j]<target){
                //System.out.println(i + ",if less " + j);
                i++;
            } else{
               // System.out.println(i + ",if great " + j);
                j--;
            }
        }
        System.out.println("Not Found");
    }
}
