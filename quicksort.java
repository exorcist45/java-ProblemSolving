
import java.util.Arrays;
import java.util.Scanner;

public class quicksort {
    
    static void swap(int a[], int i, int j){
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    static int partition(int[] a, int low, int high){
        int pivot = a[low];
        int i = low, j = high;
        while(i < j){
            do{
                i++;
            }while(i != high && a[i] <= pivot );

            do j--;
            while(a[j] > pivot);

            if(i<j)
                swap(a, i, j);
        }
        swap(a, low, j);
        return j;
    }

    static void sort(int[] a, int low, int high){
        if(low < high){
            int p = partition(a, low, high);
            sort(a, low, p);
            sort(a, p+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int start =  0, end = n;
        System.out.println("Enter the values of array:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        sort(arr, start, end);
        System.out.println("Final sorted array:\n" + Arrays.toString(arr));
        sc.close();
    }   
}
