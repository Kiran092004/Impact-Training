// Adam's number // 
 
// import java.util.Scanner; 
 
// public class programday4 { 
//     public static void main(String[] args) { 
//         Scanner abc = new Scanner(System.in); 
 
//         int num = abc.nextInt(); 
//         int square = num * num; 
//         int reversedNumber = 0; 
         
//         while (num> 0) { 
//             reversedNumber = reversedNumber * 10 + (num % 10); 
//             num /= 10; 
//         }     
//         int reversedSquare = reversedNumber * reversedNumber; 
//         int reversedSquareOfReversed = 0; 
//         num = reversedSquare; 
         
//         System.out.println("reversed number is:"+reversedNumber); 
//         System.out.println("Square of number is:"+square); 
//         System.out.println("revrsed squared number is:"+reversedSquare); 
//         while (num > 0) { 
//             reversedSquareOfReversed = reversedSquareOfReversed * 10 + (num % 
// 10); 
//             num /= 10; 
//         } 
//         System.out.println("reversed square of reversed 
// number:"+reversedSquareOfReversed); 
//         if (square == reversedSquareOfReversed) { 
//             System.out.println( "It is an Adam number."); 
//         } else { 
//             System.out.println("It is not an Adam number."); 
//         } 
         
        
//     } 
// } 
 
 
 
 
// import java.util.Scanner; 
 
// public class programday4 { 
//     public static void main(String[] args) { 
//         Scanner scanner = new Scanner(System.in); 
//         int n =scanner.nextInt(); 
//         int square =n*n; 
//         int temp =n; 
//         int digits = 0; 
//         while(temp!=0){ 
//                temp/=10; 
//                digits ++; 
//         } 
//          int b=(int)Math.pow(10,digits);   
//         int r=square%b; 
//         int l=square/b; 
//         int total=r+l; 
//         System.out.print(total); 
 
//     } 
// }       
 
//  import java.util.Scanner; 
 
// public class programday4{ 
//     public static void main(String[] args) { 
//         Scanner scanner = new Scanner(System.in); 
         
//         System.out.print("Enter a number: "); 
//         int n = scanner.nextInt(); 
         
//         int originalNumber = n; 
//         int sumOfFactorials = 0; 
 
         
//         while (n!=0) { 
//             int digit = n % 10;  
//             int factorial = 1;  
             
             
//             for (int i = 1; i <= digit; i++) { 
//                 factorial *= i;  
//             } 
             
//             sumOfFactorials += factorial;  
//             n /= 10;  
//         } 
 
//         if (sumOfFactorials == originalNumber) { 
//             System.out.println(originalNumber + " is a Strong number."); 
//         } else { 
//             System.out.println(originalNumber + " is not a Strong number."); 
//         } 
//     } 
// } 
 
 
 
 
// Example: 
// import java.util.Scanner; 
 
// public class programday4 { 
//     public static void main(String[] args) { 
//         Scanner scanner = new Scanner(System.in); 
 
//         int a = scanner.nextInt(); 
 
//         for (int i = 1; i <=a i++) {  
//             for (int j = 1; j >= i; j++) {  
//                 System.out.print("* "); 
//             } 
//             System.out.println();  
//         } 
//     } 
// } 
 
// import java.util.Scanner; 
 
// public class programday4 { 
//     public static void main(String[] args) { 
//         Scanner scanner = new Scanner(System.in); 
 
//         int a = scanner.nextInt(); 
 
//         for (int i = a; i >= 1; i--) {  
//             for (int j = 1; j <= i; j++) {  
//                 System.out.print("* "); 
//             } 
//             System.out.println();  
//         } 
//     } 
// } 
 
