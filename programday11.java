// import java.util.*;

// public class programday11 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[5];


//         int target = sc.nextInt();

//         for (int i = 0; i < 5; i++) {
//             for (int j = i + 1; j < 5; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     System.out.print(i + ","+ j);
//                     return;
//                 }
//             }
//         }
//     }
// }

import java.util.*;

public class programday11 {
    public double main(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        // Merge both arrays
        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }

        Arrays.sort(merged); // Sort the merged array

        // Find median
        if (merged.length % 2 == 0) {
            // Even number of elements
            double median = (merged[merged.length / 2 - 1] + merged[merged.length / 2]) / 2.0;
            System.out.print(median);
            return median;
        } else {
            // Odd number of elements
            double median = merged[merged.length / 2];
            System.out.print(median);
            return median;
        }
    }
}