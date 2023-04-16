
import java.util.Arrays;
import java.util.Scanner;

public class manacherAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.next();
        int len = input.length();
        input= "#"+input+"#";
        int[] length = new int[len]; 
        int extend,max = 0;
        for (int i = 1; i <= len; i ++){
            extend = 1;
            while(input.charAt(i-extend)!='#' && input.charAt(i+extend)!='#' && input.charAt(i-extend)==input.charAt(i+extend)){
                extend++;
            }
            length[i-1] = (extend-1)*2 + 1;
        }
        System.out.println("All the parandrome lengths:\n" + Arrays.toString(length));
        for ( int i = 0; i < len; i++){
            max = Math.max(max,length[i]);
        }
        System.out.println("Therefore the maximum length of substring that is palindrome => " + max);
        sc.close();
    }   
}
