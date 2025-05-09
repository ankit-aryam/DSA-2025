public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int last = n-1;
        int first = 0;
        
        
        
        reverse(arr,first,last);
        first = 1;
        reverse(arr,1,last);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        
        
    }
    
    public static int[] reverse(int[] arr, int first, int last){
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    
    }
}
