
import java.util.Scanner;


public class nibbleswap {
    private static int binary(int mi) {
        int output=0;
        int i = 0;
        do{
            output+=Math.pow(10, i)*(mi%2);
            mi/=2;
            i++;
        }while(mi!=0);
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to nibble swap:");
        int n = sc.nextInt();
        int b = binary(n);
        String s = Integer.toString(b);
        int l = s.length();
        if (l<8){
            for (int i = l; i < 8; i++){
                s = '0' + s;
            }
        }
        String s1 =s.substring(0, 4);
        String s2 = s.substring(4, 8);
        String outstr = s2 + s1;
        int output = Integer.parseInt(outstr,2);
        System.out.println("Swapped nibble: " + output);
        sc.close();

    } 

}
