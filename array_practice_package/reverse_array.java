package array_practice_package;
import java.util.Scanner;

public class reverse_array {
public static void main(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=0;
	     while(i<n){
        i++;
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        for (int j = 0; j < arrSize; j++) {
            arr[j] = sc.nextInt();
        }

        for (int j = arrSize - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
            arrSize = 0;
        }
    }
    }
}
