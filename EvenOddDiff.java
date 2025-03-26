
import java.util.Scanner;

public class EvenOddDiff {
   
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];

       int diff=OddEvenDifference(arr, n);
       System.out.println(diff);
       
       
       }
       public static int OddEvenDifference(int[] arr, int n){
        Scanner sc=new Scanner(System.in);
       int odd=0;
       int even=0;
       for(int i=0;i<arr.length;i++){
       arr[i]=sc.nextInt();
       }
       for(int i=0;i<arr.length;i++){
       if(arr[i]%2==0){
       even++;
       }else{
       odd++;
       }
       
       }
       System.out.println(even);
       System.out.println(odd);
       return odd-even;
       }
       }
    

   