
import java.util.*;
import java.lang.*;
import java.io.*;

public class activitySelectionforloop {

	public static void printMaxActivities(int s[], int f[], int n){
	int i, j;
	System.out.print("Following activities are selected : n\n");
	i = 0;
	System.out.print(s[i]+" "+f[i]+"\n");
	for (j = 1; j < n; j++){
		if (s[j] >= f[i]){
			System.out.print(s[j]+" " + f[j]);
			i = j;
		}
        System.out.println();
	}
	}
	public static void main(String[] args){
	int s[] = {1, 3, 0, 5, 8, 5};
	int f[] = {2, 4, 6, 7, 9, 9};
	int n = s.length;
	printMaxActivities(s, f, n);
	}
}


