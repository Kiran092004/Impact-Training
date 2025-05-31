// import java.util.Scanner; 
 
// public class programday5 { 
//     public static void main(String[] args) { 
//         Scanner scanner = new Scanner(System.in); 
 
//         int a = scanner.nextInt(); 
 
//         for (int i =1 ; i <= a; i++) {  
//             for (int j = 0; j<=a-i; j++) {  
//                 System.out.print("* "); 
//             } 
//             System.out.println();  
//         } 
//     } 
// } 
 
// public class programday5 { 
//     public static void main(String[] args) { 
//         int n = 5;  
 
//         for (int i = 0; i <= n; i++) { 
             
//             for (int j = 0; j <= (n- i); j++) { 
//                 System.out.print(" "); 
//             } 
             
//             for (int k = 1; k <= i+1; k++) { 
//                 System.out.print("*"); 
//             } 
             
//             System.out.println(); 
//         } 
//     } 
// } 
 
// public class programday5 { 
//     public static void main(String[] args) { 
//         int n = 5;  
 
//         for (int i = 0; i <= n; i++) { 
             
//             for (int j = 0; j <=i; j++) { 
//                 System.out.print(" "); 
//             } 
             
//             for (int k = 1; k <= (n-i); k++) { 
//                 System.out.print(""); 
//             } 
             
//             System.out.println(); 
//         } 
//     } 
// } 
 
// public class programday5 { 
//     public static void main(String[] args) { 
//         int n = 5; 
//     for(int i=1;i<n;i++){ 
//         for(int j=1;j<n;j++){ 
//                 if (i == 1|| i == (n-1) || j == 1 || j == (n-1)) { 
//                     System.out.print("* "); 
//                 } else { 
//                     System.out.print("  ");  
//                 } 
//             } 
// System.out.println();                 
// } 
// } 
// } 
//  Arrays 
// an array is a data structure used to store multiple values of the same data type in a single 
// variable. 
// int[] numbers;      
// numbers = new int[5]; 
// int[] numbers = {10, 20, 30, 40, 50}; 
//  by User Input 
// int size = input.nextInt(); 
// int[] numbers = new int[size];  
// for (int i = 0; i < size; i++) { 
// numbers[i] = input.nextInt(); 
// } 
// Example: 
// import java.util.*; 
// public class programday5 { 
// public static void main(String[] args) { 
// Scanner sc=new Scanner(System.in); 
// int n =sc.nextInt(); 
// int arr[]=new int[n]; 
// for(int i=0;i<n;i++){ 
// arr[i]=sc.nextInt(); 
//        } 
//        int sum=0; 
//        for(int i=0;i<n;i++){ 
//         sum+=arr[i]; 
//         System.out.println(arr[i]+" "); 
//        } 
//        System.out.print(sub); 
//      } 
//     } 
 
// import java.util.*; 
// public class programday5 { 
//      public static void main(String[] args) { 
//        Scanner sc=new Scanner(System.in); 
//        System.out.print("enter the array size:"); 
//        int n =sc.nextInt(); 
//        int arr[]=new int[n]; 
//        for(int i=0;i<n;i++){ 
//         arr[i]=sc.nextInt(); 
 
//        } 
//        int sub=0; 
//        for(int i=0;i<n;i++){ 
//         sub=sub-arr[i]; 
//         System.out.println(arr[i]+" "); 
//        } 
//        System.out.print("subtraction:"+sub); 
//      } 
//     } 
 
 
// import java.util.*; 
// public class programday5 { 
//      public static void main(String[] args) { 
//        Scanner sc=new Scanner(System.in); 
//        System.out.print("enter the array size:"); 
//        int a=sc.nextInt(); 
//        int arr[]=new int[a]; 
//        int b =sc.nextInt(); 
//        int arr2[]=new int[b]; 
//        for(int i=0;i<a;i++){ 
//         arr[i]=sc.nextInt(); 
//        } 
//        for(int j=0;j<b;j++){ 
//         arr2[j]=sc.nextInt(); 
//        } 
//        aint sum1=0; 
//        for(int i=0;i<a;i++){ 
//         sum1=sum1+arr[i]; 
//         ; 
//        } 
        
//        int sum2=0; 
//        for(int j=0;j<b;j++){ 
//         sum2 = sum2+arr2[j]; 
         
//        } 
//        int total=sum1+sum2; 
//        if(sum1==sum2){ 
//         System.out.print("same"); 
//        } 
//        else{ 
//         System.out.print("not same"); 
//        } 
//      } 
//     } 
 
// import java.util.*; 
// public class programday5 { 
//      public static void main(String[] args) { 
//         int[] array = {1, 2, 3, 2, 4, 1, 5, 3};  
//         int count=0; 
//         System.out.print("Distinct elements: "); 
         
        
//         for (int i = 0; i < array.length; i++) { 
//             boolean isDistinct = true;  
             
//             for (int j = 0; j < i; j++) { 
//                 if (array[i] == array[j]) { 
//                     isDistinct = false;  
//                     break;   
//                 } 
//             } 
             
             
//             if (isDistinct) { 
//                 count++; 
                 
//                 System.out.println(count); 
//             } 
//         } 
//     } 
// } 
 
 
