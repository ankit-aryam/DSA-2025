import java.util.Scanner;

public class arrayElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array memory size: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<n;i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the number you want that index: ");
        int find = scn.nextInt();

        int i=0;
        for( i=0; i<arr.length; i++){
            if (find==arr[i]){
                break;
            }
        }
       
        System.out.println("The number is at: "+ i);

    }
}
