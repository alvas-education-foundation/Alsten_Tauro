import java.util.*; 
import java.lang.*; 
  
public class Main 
{ 
    public static int countZeroso(int[] a, int n) 
    { 
        int count2 = 0, count5 = 0; 
        for (int i = 0; i < n; i++)  
        { 
            while (a[i] % 2 == 0)  
            { 
                a[i] = a[i] / 2; 
                count2++; 
            } 
            while (a[i] % 5 == 0)  
            { 
                a[i] = a[i] / 5; 
                count5++; 
            } 
        } 
        return (count2 < count5) ? count2 : count5; 
    } 
    public static void main(String args[]) 
    { 
        int n,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size :");
        n=s.nextInt();
                int[] a=new int[n];
        System.out.println("enter elements of array :");
        for(i=0;i<n;i++)
        a[i]=s.nextInt();
        System.out.println(countZeroso(a, n)); 
    } 
      
}