
//Lexiographical palindrome


import java.util.Arrays;
import java.util.Scanner;
public class palindrome {
    public static void palin(char[] arr,int len){
        boolean flag = ispalindrome(arr, len);
        if(!flag){
            char[] test = Arrays.copyOfRange(arr, 1, len);
            boolean flag2 = ispalindrome(test, len-1);
            if(flag2){
                System.out.println("Final change:");
                char temp = arr[0];
                for( int j = 1; j < len/2+1; j++){
                    arr[j-1] = arr[j];
                }
                arr[len/2] = temp;
                if(ispalindrome(arr, len))
                    System.out.println("Now its palindrome");
                else
                    System.out.println("It is not palindrome");
            }
            else{
                System.out.println("Its is not palindrome");
            }
        }
        else{
            System.out.println("Its is palindrome");
        }
    }
    public static boolean ispalindrome(char[] arr, int len){
        for (int i = 0; i < len/2; i++){
            if(arr[i]!=arr[len-i-1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check: ");
        String input = sc.next();
        boolean flag  = true, flag1 = true;
        char[] inp = input.toCharArray();
        int len = input.length();
        char[] output = new char[len];
        Arrays.sort(inp);
        System.out.println("Sorted array: "+ Arrays.toString(inp));
        if(len%2 !=0){
            flag1 = false;
        }
        for (int i = 0; i < len; i ++){
            if(!flag1 && i+1 == len){
                output[len/2] = inp[len-1];
                break;
            }
            if( flag && i%2 == 0){
                System.out.println("input: " + inp[i]);
                output[i/2] = inp[i];
            }
            else if ( flag && i % 2 != 0 ){
                System.out.println("input: " + inp[i]);
                output[len-i/2-1] = inp[i];
                System.out.println("output: " + output[len-i]);
            }    
        }
        System.out.println("output: "+ Arrays.toString(output));
        palin(output, len);
        System.out.println("output: "+ Arrays.toString(output));
        sc.close();
    }
}
