
import java.util.Scanner;
public class binarypalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose binary needs to be checked: ");
        int n = sc.nextInt();
        
        String s = Integer.toBinaryString(n);
        System.out.println("Binary of the number: " + s);
        int j = s.length()-1; 
        
        boolean flag = true;
        for (int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(j)){
                flag=false;
                break;
            }
            j--;
        }
        if(flag){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
        sc.close();
    }
}
