// mport java.util.*; 
// public class programday2 { 
//     public static void main(String[]args){ 
//         Scanner sc =new Scanner(System.in); 
//         int a=sc.nextInt(); 
         
//         int last =a%10; 
//         int middle =((a/10)%10); 
//         int first =(a/100); 
//          int reverse=last*100+middle*10+first*1; 
 
//         System.out.print(reverse); 
         
         
 
//     } 
     
 
     
     
// } 
// import java.util.*; 
// public class programday2 { 
//     public static void main(String[]args){ 
//         Scanner sc =new Scanner(System.in); 
//         int total= sc.nextInt(); 
//         int b =sc.nextInt(); 
//         int c  =sc.nextInt(); 
//        int d = total*(b/100); 
//        int rem = d-total 
//        int e =  
//     } 
 
// import java.util.*; 
// public class programday2 { 
//     public static void main(String[]args){ 
//         Scanner sc =new Scanner(System.in); 
//         int a =sc.nextInt(); 
//         if (a<20){ 
//             System.out.print("number is less than 20") ; 
//         } 
//         else if (a>20){ 
//             if(a%2==0){ 
//             System.out.print("even"); 
//             } 
//             else{ 
//                 System.out.print("odd"); 
//             } 
 
             
                               
//         } 
//     } 
 
// } 
 
 
// import java.util.*; 
// public class programday2 { 
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in); 
//         int a = sc.nextInt(); 
//         int middle=(a / 10) % 10; 
         
//         if (middle % 3 == 0) { 
//             System.out.print("Number is trendy"); 
//         } else { 
//             System.out.print("Number is not trendy"); 
//         } 
         
//     } 
// } 
 
 
 
// import java.util.Scanner; 
 
// public class programday2 { 
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in); 
//         int a = sc.nextInt(); 
//         int count =0; 
//         while(a!=1) 
//         { 
//             if(a%2==0){ 
//                 System.out.print(a/2); 
//         } 
//             else{ 
//                 System.out.print(3*a+1); 
//             } 
//         } 
//     } 
// } 
 
 
// import java.util.Scanner; 
 
// public class programday2 { 
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in); 
         
//         System.out.print("enter the month"); 
//         int month=sc.nextInt(); 
        
//         System.out.print("enter the rent per day"); 
//         int rent =sc.nextInt(); 
         
//         System.out.print("enter the days spend"); 
//         int days =sc.nextInt(); 
         
//         if (month<1 && month>12){ 
//             System.out.println("invalid input"); 
//         } 
//         else if(month>=4 && month<=6 || month>=11 && month<=12){ 
//             int total1=rent*days*((20*5)/100); 
//             System.out.println(total1); 
//         } 
//         else{ 
//             int total2=rent*days; 
//             System.out.print(total2); 
//         } 
 
 
//     } 
 
// } 
 
// import java.util.Scanner; 
//  public class programday2 { 
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in); 
//     int box1 =sc.nextInt(); 
//     int box2 =sc.nextInt(); 
//     int box3=sc.nextInt(); 
//     int code =1; 
//     if(box2<box1){ 
//         box1=box2; 
 
//     } 
//     if(box3<box1){ 
//         box1=box3; 
//     } 
 
//     for(int i=1;i<=box1;i++){ 
//         if(box1%i==0 && box2%i==0 && box3%i==0){ 
//             code=i; 
//         } 
//     } 
//     System.out.println("the treasure is in the box has nubmer"+); 
//     System.out.println(code); 
 
//     } 
 
//  } 