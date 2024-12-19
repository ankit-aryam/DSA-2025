import java.util.*;
public class diffOfTwoArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n = scn.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the elements of first array");
        for(int i=0;i<n;i++){
            arr1[i] = scn.nextInt();
        }

        System.out.println("Enter the size of second array");
        int m = scn.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter the elements of second array");
        for(int i=0;i<m;i++){
            arr2[i] = scn.nextInt();
        }

        int i=arr1.length-1;
        int j=arr2.length-2;
        int diff[] = new int[n];
        int k=diff.length-1;
        int c=0;

        while(k>=0){
            int d =0;
            int a2val = j>=0?arr2[j]:0;
            if(arr1[i]+c>=a2val){
                d = arr1[i]+c -a2val;
            } else{
                
                d=arr1[i]+10+c-a2val;
                c=-1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx=0;
        for(idx=0;idx<diff.length;idx++){
            if(diff[idx]>0){
                break;
            }
        }
        while(idx<diff.length){
            System.out.println(diff[idx]);
            idx++;
        }
     
    }
    
}
