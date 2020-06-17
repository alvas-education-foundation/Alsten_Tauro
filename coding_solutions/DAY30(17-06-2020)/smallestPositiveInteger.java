import java.util.*;
public class Main {

	private static int FindSmallestInteger(int[] arr) {
		int res = 1;
		for(int i=0;i< arr.length && arr[i]<= res;i++) {
			res += arr[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		int i;
		int arr[] = new int[10];
		System.out.println("enter array size :");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        System.out.println("Enter elements :");
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Result is :");
		System.out.println(FindSmallestInteger(arr));
	}
}