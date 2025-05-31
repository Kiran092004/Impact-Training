// import java.util.Scanner;

// public class programday17 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         String original = Integer.toString(number);
//         String swapped = "";

//         for (int i = 0; i < original.length(); i=i+2) {
//             if (i + 1 < original.length()) {
                
//                 swapped += original.charAt(i + 1);
//                 swapped += original.charAt(i);
//             } else {
                
//                 swapped += original.charAt(i);
//             }
//         }
//         System.out.println( swapped);
//     }
// }

// import java.util.*;
// public class programday17{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String a= sc.nextLine();
//         int sum=0;
//         int n=0;
//         for(int i=0;i<a.length();i++){
//             char ch=a.charAt(i);
//            if(ch>='0' && ch<='9'){
//             n=n*10+(ch-'0');
//            }
//            else{
//             sum+=n;
//             n=0;
//            }
           
//         }
//         sum+=n;
//           System.out.print(sum);


//     }}


// import java.util.*;
// public class programday17{
//        public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     String a=sc.nextLine();
//     String b=sc.nextLine();
//     String c ="";
//     for(int i=0;i<b.length();i++){
//         if(a.indexOf(b.charAt(i))==-1){
//             c+=b;
//             System.out.print(c);
//     }


//     }
     
    
//        }
// }



//     //    2D ARRAY//
//     import java.util.Scanner;

// public class programday17 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

        
//         int n = scanner.nextInt();

//         int[][] matrix = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }

//         System.out.println("Original matrix is:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

       
//         System.out.println("Transpose matrix is:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(matrix[j][i] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class programday17 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int[][] arr = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 arr[i][j] = scanner.nextInt();
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//         boolean upper = true;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (arr[i][j]!=0){
//                     upper=false;
//                     break;
//                 }               
                
//                 }
//             }

//             if (upper) {
//                 System.out.println("Not An Upper triangular matrix");
//             } else {
//                 System.out.println(" Upper triangular matrix");
//             }
//         }
//     }


// import java.util.*;

// public class programday17 {

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int arr[][] = new int[a][b];

//     for (int i = 0; i < a; i++) {
//         for (int j = 0; j < b; j++) {
//             arr[i][j] = sc.nextInt();
//         }
//     }

//     for (int j = 0; j < b; j++) {
//         int m = 0;
//         for (int i = 0; i < a; i++) {
//             if (arr[i][j] > m) {
//                 m = arr[i][j];
//             }
//         }
//         System.out.println(m);
//     }
//     System.out.println(" ");
// }
// }


// import java.util.*;
// public class programday17 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int arr[][] = new int[a][b];
//         for (int i = 0; i < a; i++) {
//             for (int j = 0; j < b; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         int sum=0;
//        for(int i=0;i<b;i++){
//             sum+=arr[0][i];
//             sum+=arr[a-1][i];
//         }
//         for(int i=1;i<a-1;i++){
//             sum+=arr[i][b-1-i];
//         }
//         System.out.println(sum);
//     }
// }
            
        

// import java.util.Scanner;
// public class programday17{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b =sc.nextInt();
//         int arr[][]=new int[a][b];
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println(" ");
//         }
//         int sum=0;
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){

//                 if(i==j||i+j==a-1){
//                     sum+=arr[i][j];
//                 }
//             }
//         }
//         System.out.println(sum);
//     }
// }






// import java.util.*;
// public class programday17{
// public static void main(String[] args) {
    
//      Scanner sc=new Scanner(System.in);
//     int d1=0;
//     int d2=0;
//     int n=sc.nextInt();
//     int [][]arr=new int[n][n];
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             arr[i][j]=sc.nextInt();
//         }
//     }
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n;j++){
//             if(i==j){
//                  d1=d1+arr[i][j];
//             }
//             if(i==n-1-j){
//                 d2=d2+arr[i][j];
//             }
//         }
//     }
//     if(d1==d2){
//         System.out.println("Yes");
//     }
//     else{
//          System.out.println("No");
//     }

// }
// }