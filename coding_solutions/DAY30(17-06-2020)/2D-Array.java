import java.util.*;
public class Main {

  public static void main(String[] args) {
   int nums[][] = {{1, 2, 3, 4}, 
                  {5, 6, 7 ,8}, 
                  {9, 10, 11, 12}, 
                  {13, 14, 15, 16}}; 
	 int rows = 4;    
	 int search_element = 7;		   
     int ans[] = Saddleback(nums, rows - 1, 0, search_element);
        System.out.println("Position of "+search_element+" in the matrix is ("+ans[0] + "," + ans[1]+")");			   
    } 
    private static int[] Saddleback(int nums[][], int row, int col, int search_element) {
        int element_pos[] = {-1, -1};
        if (row < 0 || col >= nums[row].length) {
            return element_pos;
        }
        if (nums[row][col] == search_element) {
            element_pos[0] = row;
            element_pos[1] = col;
            return element_pos;
        }
        else if (nums[row][col] > search_element) {
            return Saddleback(nums, row - 1, col, search_element);
        }
        return Saddleback(nums, row, col + 1, search_element);
    }
}