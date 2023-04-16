
import java.util.Arrays;
import java.util.Scanner;
public class hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mnumber of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the mnumber of columns:");
        int c = sc.nextInt();
        int i = 0,j = 0,k =0;
        int[][] arr = new int [r][c];
        int sum = 0;
        int[] out = new int [((r%2==0?r/2:r/2+1)* (c%2==0?c/2:c/2+1))+1];
        System.out.println("Enter the values(Total: " + r*c + " )");
        for (i = 0; i < r; i ++){
            for (j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (i =0; i < 3; i++){
            if(j == i+2){
                i++;
                j--;
            }
            else if (j == i){
                sum+=arr[i][j];
                i++;
                j--;
            }
            else{
                for(j = 0; j < 3; j++){
                    sum+=arr[i][j];
                }
            }
            
        }
        System.out.println("sum: "+ sum);
        System.out.println(Arrays.deepToString(arr));
    }
}
