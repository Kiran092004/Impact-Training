// // Arrays 1D - Online Game
// // You are playing an online game. In the game, a list of N 
// // numbers is given. The player has to arrange the numbers so that all the odd numbers on the
// //  list come after the even numbers. Write an algorithm to arrange the given list such that all the odd numbers of the list come after the even numbers.

// import java.util.*;

// public class programday8 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         int[] nums = new int[n];
        
//         for (int i=0; i<n; i++)
//             nums[i] = sc.nextInt();
        
//         int even = 0, odd = n-1;
        
//         while (even < odd){
//             if (nums[even] % 2 != 0){
//                 if (nums[odd] % 2 == 0)
//                     nums[even] = (nums[even] + nums[odd]) - (nums[odd] = nums[even]);
//                 odd--;
//             } else
//             even++;
//         }
        
//         System.out.println("Array after Segregation");
//         for (int i=0; i<n; i++)
//             System.out.print(nums[i] + " ");
//     }
// }


// // Array 1D - Pair the Container

// // An oil factory has N number of containers and each has a different capacity. During renovation, the manager decided to make some changes with the containers. He wishes to make different pairs for the containers in such a way that in the first pair, the container of maximum capacity is paired with the container of minimum capacity, and so on for the rest of the containers, to maintain a balance throughout all the pairs of containers.

// import java.util.Scanner;
// import java.util.Arrays;
// class Main
// {
//   public static void main(String args[])
//   {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int arr[] = new int[a];
//     for(int i = 0; i<arr.length;i++){
//       arr[i] = sc.nextInt();
//     }
//     Arrays.sort(arr);
//     int k = arr.length - 1;
//     int i=0;
//     while(i<k){
//       System.out.println(arr[k]+" "+arr[i]);
//       i++;
//       k--;
//       if(i==k){
//         System.out.println(arr[i]+" 0");
//       }
//       }
//     }  
// }

// // Arrays 1D - Smallest Positive Missing Number

// // You are given an array a[] of n integers. The task is to find the smallest positive number missing from the array.



// // First line - n, the size of an array Second line - all the n elements (a[i] can be positive, negative, zero)

// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         for (int i=0; i<n; i++)
//             arr[i] = sc.nextInt();
        
//         Arrays.sort(arr);
//         int missing = n-1;
        
//         for (int i=0; i<n; i++) {
//             if (arr[i] > 0 && i < n-1 && arr[i]+1 < arr[i+1]) {
//                 missing = i;
//                 break;
//             }   
//         }
        
//         System.out.println(arr[missing]+1);
//     }
// }


// // Arrays 2D - Move all zeroes

// // Write a program to move all zeroes to the end of a given integer.

// // Input Format

// // The first line of input contains a number of test cases T.
// // For each test case, the first line of input contains a single integer of 0's and 1's.

// import java.util.Scanner;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
        
//         while(t-- > 0) {
//             int num = sc.nextInt();
//             int factor = 1, res = 0;
            
//             do {
//                 if (num%10 == 0)
//                     res *= 10;
//                 else
//                     res += factor;
                
//                 factor *= 10;
//             } while ((num /= 10) > 0);
            
//             System.out.println(res);
//         }
//     }
// }