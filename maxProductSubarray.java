
import java.util.Scanner;
public class maxProductSubarray {

    static int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
    
        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int result = max_so_far;
       
        for (int i = 1; i < nums.length; i++) {
          int curr = nums[i];
          int temp_max = Math.max(curr, Math.max(max_so_far * curr, min_so_far * curr));
          min_so_far = Math.min(curr, Math.min(max_so_far * curr, min_so_far * curr));
       
          max_so_far = temp_max;
       
          result = Math.max(max_so_far, result);
        }
        return result;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int n = sc.nextInt();
        int[] arr = new int [n];
        System.out.println("Enter the values of array: ");
        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
       
        System.out.println("\nMaximum product of a subarray from given array: ");
        
        System.out.println(maxProduct(arr));
        sc.close();
    }
}
        // All conditions satisfied.