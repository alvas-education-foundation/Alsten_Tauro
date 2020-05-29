import java.util.Scanner;
    public class Main{
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int num , originalNum, remainder, result = 0;
            System.out.println("Enter the number :");
            num=s.nextInt();
            originalNum = num;
            while (originalNum != 0)
            {
                remainder = originalNum % 10;
                result += Math.pow(remainder, 3);
                originalNum /= 10;
            }   
            if(result == num)
                System.out.println(num + " is an Armstrong number.");
            else
                System.out.println(num + " is not an Armstrong number.");
        }
    }