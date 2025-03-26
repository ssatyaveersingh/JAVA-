import java.util.*;

class FeqOFArray {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int[] arr=new int[n];
          
          for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
           
          }
           CountFreq(arr,n);
          
         
    }
     public static void CountFreq(int[] arr, int n){
              boolean visit[]=new boolean[n];
              int count=1;
              for(int i=0;i<n;i++){
                  if(visit[i]==true)
                  continue;
                  
                  for(int j=i+1;j<n;j++){
                      if(arr[i]==arr[j]){
                          visit[j]=true;
                          count++;
                      }
                  }
                  System.out.println(arr[i]+" "+count);
                  
              }
          }
}