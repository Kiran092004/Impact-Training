// import java.util.*;
//     public class programday13{
//         public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n =sc.nextInt();
//         int i=sc.nextInt();
//       int result = n | (1 << i);
//         System.out.println(result);

    
//     }
// }
// public class programday13 {
//     public static void main(String[] args) {
//        int n =7;

//        if((n & 1)==0){
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }

//       }
//     }


// not(1<<i) makes the ith bit set bit
// n&not(1<<i) clearing the ith bit


// import java.util.*;
//     public class programday13{
//         public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n =sc.nextInt();
//         int i=sc.nextInt();
//       int r = n ^(1 <<i);
//         System.out.println(r);
//         }
//     }

import java.util.*;
public class programday13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        int temp=0;
       for(int i=1;i<arr.length;i++){
         if(arr[i]!=arr[i-1]){
            arr[temp]=arr[i];
            temp++;

         }

         System.out.print(arr[temp]+" ");
  

         
       }
              
        
    }    
    
}
