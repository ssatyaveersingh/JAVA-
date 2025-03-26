import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number of elements in the array");
    int[] arr=new int[sc.nextInt()];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       
    }
    int sum=0;
    int avg=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];avg=sum/arr.length;
      
   
    }
    System.out.println(sum);
    System.out.println(avg);
}
}
