
import java.util.Arrays;
import java.util.Scanner;
public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt(), temp;
        int[] arr = new int[n];
        System.out.println("Enter Values:");
        for( int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        for( int i = 0; i < n-1; i++){
            int minPos = i;
            for( int j = i+1; j < n; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("\nSorted Array: \n" + Arrays.toString(arr));
        sc.close();
    }
}
