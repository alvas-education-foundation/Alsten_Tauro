import java.util.*;
public class Main {  
    public static boolean checkRotation(String st1, String st2) {  
        if (st1.length() != st2.length()) {  
            return false;  
        }  
        String st3 = st1 + st1;  
        if (st3.contains(st2))  
            return true;  
        else  
            return false;  
    }  
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
         String str1,str2;  
         System.out.println("Enter first string :");
         str1=sc.next();
         System.out.println("Enter second string :");
         str2=sc.next();
         if (checkRotation(str1, str2)) {  
            System.out.println( str2 + " is rotation of " + str1);  
        } else {  
            System.out.println(str2 + " is not rotation of " + str1);  
        }  
    }  
}