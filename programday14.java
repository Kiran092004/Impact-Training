import java.util.*;
public class programday14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a="Kiran";
        String b="Kiran";
        String c =new String("Kiran");
        String d =new String("Kiran");
        System.out.println(a==b);
        System.out.println(c==d);
        System.err.println(a==d);
        System.out.println(a.equals(c));
        System.out.println(a.charAt(0));

    }

}

import java.util.*;
public class programday14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a="Kiran";
        System.err.println(a.charAt(0));
        System.out.println(a.indexOf('K'));
        System.out.println(a.concat(" hello  "));
        System.out.println(a.length());
        System.out.println(a.contains("1"));
        System.out.println(a.repeat(2));


    }
}

import java.util.*; 
public class programday14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        char tar="a";
        System.out.println(a.charAt(tar));
    }
}


     Use PALINDROME USING STRING        //
import java.util.*;
public class programday14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String empty="";
        for(int i=a.length()-1;i>=0;i--){
            empty+=a.charAt(i);
            }
        System.out.println(empty);
        
        if(a.equals(empty)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }       
    }
}


     Use Mutable JAVA USING STRINGBUILDER        //
import java.util.*;
public class programday14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a="kiran";
         System.out.println(a.concat("Patil"));
        StringBuilder b=new StringBuilder(a);
        b=b.append("a");
        System.out.println(b);
        System.out.println(b.delete(0,3));
       
    }
}

import java.util.*;
public class programday14{
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int count =0;
       String a =sc.nextLine();
       for(int i=0;i<a.length();i++){
           char b=a.charAt(i);
           if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u'|| b=='A' || b=='E' || b=='I' || b=='O' || b=='U'){
               count++;
           }
       }
        System.out.println(count);
}
}

 
import java.util.Scanner;
public class programday14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(char i='a';i<='z';i++){
            if(a.indexOf(i)==-1){
                System.out.print(i);
                return;
            }
        }
        }
    }

Smallest non-repeating character in a string Approach-1
import java.util.Scanner;
public class programday14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch]++;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (count[ch] == 1) {
                System.out.println(ch);
                return;
            }
        }

    }
}
           smallest non-repeating character in a string Approach-2
import java.util.Scanner;
public class programday14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                System.out.println(ch);
                return;
            }
        }
    }
}




