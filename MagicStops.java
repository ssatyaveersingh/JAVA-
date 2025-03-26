import java.util.Scanner;

public class MagicStops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
     int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            int sqrt=(int)Math.sqrt(arr[i]);
            if (sqrt*sqrt==arr[i]) {
                count++;
            }
                
            }
            System.out.println(count);
        }
    }

