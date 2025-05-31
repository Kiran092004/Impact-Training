// // import java.util.*;
// // public class programday10{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int a=sc.nextInt();
// //         int place=1,rev=0;
// //         while(a!=0){
// //             int  rem=a%2;
// //             rev=rev+rem*place;
// //             place=place*10;
// //             a=a/10;
// //         }
// //         System.out.print(rev);
        
// //     }
    
// // }

// import java.util.*;

// public class programday10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a binary number: ");
//         int a = sc.nextInt();
//         int base = 1;
//         int result = 0;

//         while (a != 0) {
//             int rem = a % 10; 
//             result = result + (rem * base);
//             base = base * 2; 
//             a = a / 10; 
//         }

//         System.out.println( result);
//     }
// }

import java.util.*;

public class programday10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();             
        int arr[] = new int[n];
  for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();        
        }
        int max = 0;
        int secondMax = 0;
for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
     } else if (arr[i] > secondMax ) {
                secondMax = arr[i];
            }
        }
          System.out.println(secondMax);
          }
}