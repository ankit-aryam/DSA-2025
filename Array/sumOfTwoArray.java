import java.util.Scanner;

public class sumOfTwoArray {
    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the size of first array: ");
    int n = scn.nextInt();
    System.out.println("Enter the elements of first array: ");
    int arr1[] = new int[n];
    for(int i=0;i<n;i++){
        arr1[i] = scn.nextInt();
    }

    System.out.println("Enter the size of second array: ");
    int m = scn.nextInt();
    System.out.println("Enter the elements of second array: ");
    int arr2[] = new int[m];
    for(int i=0;i<m;i++){
        arr2[i] = scn.nextInt();
    }

    int sum[] = new int[m>n?m:n];
    int i=arr1.length-1;
    int j=arr2.length-1;
    int k=sum.length-1;
    int c=0;

    while(k>=0){
        int d=c;
        if(i>=0){
            d+=arr1[i];
        }
        if(j>=0){
            d+=arr2[j];
        }
        c = d/10;
        d = d%10;
        sum[k]=d;

        i--;
        j--;
        k--;
    }

    System.out.println("The Sum is: ");
    if(c!=0){
        System.out.print(c);
    }
    for(int val:sum){
        System.out.print(val);
    }

    }

}
