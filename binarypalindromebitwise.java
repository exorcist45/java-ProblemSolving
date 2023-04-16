
import java.util.Scanner;
public class binarypalindromebitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose binary needs to be checked: ");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome");
        }
        else {
            System.out.println(n + " is not a palindrome");
        }

        sc.close();
    }

    public static boolean isPalindrome(int n)
    {
        int rev = 0;
        int k = n;
        while (k > 0)
        {
            rev = (rev << 1) | (k & 1);
            System.out.println(rev);
            k = k >> 1;     
        }
        return n == rev;
    }
}
