// Adam Number is a number whose square is equal to the square of its reverse.
// For example, 12 is an Adam number because its square is 144, and the square of its reverse (21) is also 441.
// // Adam number using fumction in Java
// import java.util.Scanner;
// class Kiran{
//     public void adam(){
//         Scanner sc=new Scanner(System.in);
//         int a = sc.nextInt();
//         int square = a * a;
//         int reversed=0;
//         while(a!=0){
//             reversed =reversed*10+a%10;
//             a=a/10;
//         }
//         System.out.println(reversed);
//         int reversedsqaure=reversed*reversed;
        
//         System.out.println(reversedsqaure);
//         int revsqrev=0;
//         a = reversedsqaure;
//         while(a!=0){
//             revsqrev =revsqrev*10+a%10;
//             a=a/10;
//         }
//         System.out.println(revsqrev);
//         if(revsqrev==square){
//             System.out.println("Adam Number");
//         } else{
//             System.out.println("Not an Adam Number");
//         }
//     }
// }
// public class programday21 {
//     public static void main(String[] args) {
//        Kiran a=new Kiran();
//        a.adam();
//     }
// }



// maximum number and minimum in integer number in java function

// import java.util.*;
// class Kiran{
//     public void Maxmin(){
//         Scanner sc=new Scanner(System.in);
//         int n = sc.nextInt();
//         if (n <= 0) {
//             System.out.println("0");
//             return;
//         }
//         System.out.print("Enter number 1: ");
//         int number = sc.nextInt();
//         int min = number;
//         int max = number;

//         for (int i = 2; i <= n; i++) {
//             System.out.print("Enter number " + i + ": ");
//             number = sc.nextInt();

//             if (number < min) {
//                 min = number;
//             }

//             if (number > max) {
//                 max = number;
//             }
//         }

//         System.out.println("Minimum number: " + min);
//         System.out.println("Maximum number: " + max);

     
//     }
// }

// public class programday21 {
//     public static void main(String[] args) {
//         Kiran a = new Kiran();
//         a.Maxmin();
//     }
// }



import java.util.Scanner;

 class Kiran{
    // Function to find the second largest number
    public static int findSecondLargest(int[] arr, int n) {
        int largest = arr[0];
        int second = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        return second;
    }
}
     public class programday21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secondLargest = findSecondLargest(arr, n);
        System.out.println("Second largest number is: " + secondLargest);

        sc.close();
    }
}
