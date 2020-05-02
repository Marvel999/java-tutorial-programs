package array_practice_package;

import java.util.Scanner;

public class leader_Array {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    StringBuffer s = new StringBuffer();

    while (t > 0) {
        t--;
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arrSize; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    s.append(arr[i] + " ");
                }
            } else if (i == arrSize - 1) {
                if (arr[i] > arr[i - 1]) {
                    s.append(arr[i] + " ");
                }

            } else {
                if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                    s.append(arr[i] + " ");

                }
            }


        }

        System.out.println(s);



    }
}
}
