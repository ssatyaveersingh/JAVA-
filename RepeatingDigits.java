
import java.util.Scanner;

public class RepeatingDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[sc.nextInt()];
int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         if(arr[i]==arr[i+1]){
            count++;
         }
               
        }
        System.out.println(count);
    }
}
