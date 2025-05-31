// // import java.util.Scanner;

// // public class programday15{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         String[] words = new String[100]; 
// //         int count = 0;  
// //         String previousWord = "";

// //         while (true) {
// //             String word = sc.nextLine();

// //             if (word.equals("####")) {
// //                 break; 
// //             }

// //             boolean repeated = false;
// //             for (int i = 0; i < count; i++) {
// //                 if (words[i].equals(word)) {
// //                     repeated = true;
// //                     break;
// //                 }
// //             }

// //             if (!previousWord.equals("")) {
// //                 char lastChar = previousWord.charAt(previousWord.length() - 1);
// //                 char firstChar = word.charAt(0);
// //                 if (lastChar != firstChar) {
// //                     break;  
// //                 }
// //             }
// //             words[count] = word;
// //             count++;
// //             previousWord = word;

// //             if (count == 100) {
// //                 break;
// //             }
// //         }

        
// //         for (int i = 0; i < count; i++) {
// //             System.out.println(words[i]);
// //         }

// //         sc.close();
// //     }
// // }


// import java.util.*;
// class main{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//       String a=sc.nextLine();
//       String b =sc.nextLine();
//       String d=new StringBuilder(a).reverse().toString();
//       if(b.equals(d)){
//        System.out.print(true);
//       }
//       else{
//         System.out.print(false);
//       }
//   }
// }

import java.util.*;
public class programday15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "#####";
        String previous =sc.nextLine();
        System.out.println(previous);
        String Current =sc.nextLine();
        while(!Current.equals(a)){
            if(previous.charAt(previous.length()-1)==Current.charAt(0)){
                System.out.println(Current);
                previous=Current;
                
            }
            else{
                break;
            }
            Current =sc.nextLine();

}



}
}