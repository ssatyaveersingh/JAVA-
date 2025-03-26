import java.util.*;
public class SecondL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
        int[] arr=new int[n];

        // int second=SecondLargest(arr, n);
        // System.out.println(second);

        int Largest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Largest)
            arr[i]=Largest;
    }
    System.out.println(Largest);
}
}

    
//     public static int SecondLargest(int[] arr,int n){
//         int Largest=-1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>Largest)
//            arr[i]=Largest;
//        }
//        int secondL=-1;
//        for(int i=arr.length-2;i>0;i--){
//            if(arr[i]!=Largest){
//                secondL=arr[i];
//                break;
//            }
//             }
      
//     return secondL;
//     }
// }
