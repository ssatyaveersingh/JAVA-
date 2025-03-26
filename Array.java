import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int  i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
int sum=0;

for(int i=0;i<arr.length;i++){
    sum+=arr[i];
}
System.out.println(sum);
int average=sum/arr.length;

System.out.println(average);
        
    }
}
