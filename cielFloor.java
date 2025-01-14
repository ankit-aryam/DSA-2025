import java.util.*;
public class cielFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the base number: ");
        int num = scn.nextInt();
        int ceil = 0;
        int floor = 0;

        for(int i=0;i<n;i++){
            if(num==arr[i]){
                ceil = arr[i];
                floor = arr[i];
                break;
            }else if(arr[i]>num){
                ceil = arr[i-1];
                floor = arr[i];
                break;
            }

        }
        System.out.println("Ceil = "+ ceil + " Floor: " + floor);


    }
}
