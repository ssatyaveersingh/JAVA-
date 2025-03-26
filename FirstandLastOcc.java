import java.util.*;
public class FirstandLastOcc {
    public static int first=-1;
    public static int last=-1;
    
    public static void ElementofFirstandLast(String s,int idx,char element,int n){
       if(idx==n){
               System.out.println(first);
               System.out.println(last);
               return;
       }
       char curr=s.charAt(idx);
       if(curr==element){
             if(first==-1)
             first=idx;
            else{
            last=idx;
           }
        }
        ElementofFirstandLast(s, idx+1, element, n);
      
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length()-1;
        char element=sc.next.charAt(0);
        ElementofFirstandLast(s, 0,element,n);

    }
}
