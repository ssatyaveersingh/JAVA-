
import java.util.Scanner;

public class HcfLcm {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
      int hcf=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        int lcm=(a*b)/hcf;
        System.out.println(hcf);
        System.out.println(lcm);
    }
}
