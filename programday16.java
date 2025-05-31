// import java.util.Scanner;
// public class programday16{
   


//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int count =0;
//         String s = sc.nextLine();
//         for (int i = 0;i<s.length();i++) {
//             for (int j = i + 1;j<=s.length(); j++) {
//                 System.out.println(s.substring(i,j));
//                 count++;
//             }

//               }
              
//         }
//      }

// import java.util.*;
// public class programday16 {
//     public static void main(String[] args) {
        
//       Scanner sc = new Scanner(System.in);
//       String s = sc.next();
//       String t = sc.next();
//       int j = 0;
//       for (int i = 0; i < t.length() && j < s.length(); i++) {
//             if (t.charAt(i) == s.charAt(j)) {
//                 j++;
//             }
//         }

//         System.out.println(j == s.length());
//     }
// }
 

// // import java.util.Scanner;
// // public class Main
// // {
// //   public static void main(String args[])
// //   {
// //     Scanner sc = new Scanner(System.in);
// //     int a = sc.nextInt();
// //     String str = ""+a;
// //     String str1 = "";
// //     for(int i=0;i<str.length()-1;i++){
// //         str1+= str.charAt(i+1);
// //         str1+= str.charAt(i);
// //       i++;
// //       if(i==str.length()-2){
// //         str1+=str.charAt(i+1);} 
// //     }
// //     System.out.println(str1);
// //   }
    



import java.util.*;
public class programday16{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String str = ""+a;
    String str1 = "";
    for(int i=0;i<str.length()-1;i++){
        str1+= str.charAt(i+1);
        str1+= str.charAt(i);
      i++;
      if(i==str.length()-2){
        str1+=str.charAt(i+1);} 
    }
    System.out.println(str1);
  }
}
// import java.util.*;
// class programday16 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String haystack = sc.nextLine();
//         String needle = sc.nextLine();
//         int i=0,j=0;
//         for(j=0;i<=needle.charAt(j);j++){
//                for(i=0;j<=haystack.charAt(i);i++){
//             if(haystack.indexOf(i)==needle.indexOf(j)){
//                 System.out.print(haystack.indexOf(i));
//             } 
//                }
//             }
//             System.out.println(-1);
              
//         }
        
//     }
