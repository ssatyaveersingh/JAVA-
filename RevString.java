import java.util.*;
public class RevString {

public static void RverseString(String s,int idx){
    if(idx==0){
        System.out.println(s.charAt(idx));
        return;
    }
      System.out.println(s.charAt(idx));

      RverseString(s, idx-1);


   
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int idx=s.length()-1;

        RverseString(s,idx);
    }
}
