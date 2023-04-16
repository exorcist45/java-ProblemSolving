
import java.util.Arrays;
import java.util.Scanner;
public class collectingcandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases, number of boxes and candies in each box:");
        long T = sc.nextLong();
        int N = sc.nextInt();
        long sum,time;
        int k;
        long sumarr[] = new long[N];
        int[] arr = new int[N];
        while(T-- > 0 ){
            for(int i = 0; i < N; i++)
                arr[i] = sc.nextInt();

            Arrays.sort(arr);
            k = 0;
            sum = 0;
            for( int i = 0; i < N; i++){
                sum += arr[i];
                sumarr[k] = sum;
                k++;
            }
            time = 0;
            System.out.println("Minimum time reqired to collect candies:");
            for(int i = 1; i < k; i++)
                time += sumarr[i];
            System.out.println(time);
        }
        sc.close();
    }
}
