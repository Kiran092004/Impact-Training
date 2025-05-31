// import java.util.Scanner;

// public class programday6 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int n1 = scanner.nextInt();
//         int[] arr1 = new int[n1];

//         for (int i = 0; i < n1; i++) {
//             arr1[i] = scanner.nextInt();
//         }
//         int n2 = scanner.nextInt();
//         int[] arr2 = new int[n2];

//         for (int i = 0; i < n2; i++) {
//             arr2[i] = scanner.nextInt();
//         }

//         if (n1 != n2) {
//             System.out.println("Incompatible");
//             return; 
//         }

//         for (int i = 0; i < n1; i++) {
//             if (arr1[i] < arr2[i]) {
//                 System.out.println("Incompatible");
//                 return; 
//             }
//         }
//         System.out.println("Compatible");
//     }
// }


// import java.util.*;
// public class day6_new2{

// public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     int n = sc.nextInt();
//     int []a=new int[n];
//     for( int i=0;i<n;i++){
//         a[i]=sc.nextInt();
//     }
//     int p,e;
//     p= sc.nextInt();
//     if(p>n){
//         System.out.println("Invalid Input");
//     }else{
//         e =sc.nextInt();
//         System.out.println("Array after insertion is");
//         for(int i=0;i<n;i++){
//             if(i== p-1){
//               System.out.println(e+" ");
//         }
//           System.out.print(a[i]+" ");
//     }
//     }
// }
// }

// package impact_training457;

// import java.util.*;
// public class day6_new3 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         int i,j,num;
//         for(i=0;i<n;i++)
//         {
//             a[i]=sc.nextInt();
//         }
//         System.out.println("Element are duplicate");
//         for(i=0;i<n;i++)
//         {
//             num=1;
//             for(j=0;j<i;j++){
//                 if(a[i]==a[j]){
//                     num=0;
//                 }
//             }
//             if(num==1){
//                 System.out.println(a[i]);
//             }   
//         }
//     }
// }