
import java.util.Scanner;
public class seqofOnesAfterFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        int l = s.length();
        System.out.println("Binary: " + s);
        
        int position=0,max=0,count = 0;
        boolean flag = false;
        for (int i = position; i < l; i++){
            if(s.charAt(i) == '0' && flag == false){
                s = s.substring(0, i) + '1' + s.substring(i+1, l);
                position = i;
                count++;
                flag = true;
            }
            else if(s.charAt(i)=='1'){
                count++;
            }
            else{
                max=Math.max(max, count);
                i =position;
                count = 0;
                flag = false;
            }
                
        }
        max=Math.max(max, count);

        System.out.println("Maximum number of ones after one flip: " + max);
        sc.close();
    }
}
