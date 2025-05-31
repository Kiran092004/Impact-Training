//  import java.util.*;
// public class programday18{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int d1 = 0;
//         int d2 = 0;
//         int n = sc.nextInt();
//         int arr[][] = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == j) {
//                     d1 += arr[i][j];
//                 }
//                 if (i == n - 1 - j) {
//                     d2 += arr[i][j];
//                 }
//             }
//         }
//         if (d1 == d2) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }
//  


//  rotate a array

// import java.util.*; 
// public class programday18{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[][]=new int[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
        
//     for(int i=0;i<n;i++){
//         for(int j=n-1;j>=0;j--){
//             System.out.print(arr[j][i]);
//         }
//         System.out.println(" ");

//     }
    
//     }
// }
import java.util.*;
public class programday18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr []= new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                System.out.print(mid);
                return;
            }
            else if(arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        System.out.print(-1);
         // If target is not found
    
    }
}


