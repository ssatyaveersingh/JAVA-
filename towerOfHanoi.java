public class towerOfHanoi {
    
    public static void hanoi(int n,String src,String helper,String dest){
if(n==1){
    System.out.println("transfer disk"+n+"from"+src+"to"+dest);
    return;
}

hanoi(n-1,src,dest,helper);
System.out.println("transefer disk"+n+"from"+src+"to"+helper);

hanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args){
  int n=2;
  hanoi(n,"A","B","C");
    }
}
