import java.util.*;
public class ArraySortLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
              arr[i]=sc.nextInt();
             
            
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
     
    }
}
