package loop_in_Java;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        System.out.println("please entre number of pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0 ;j<=i-1;j++){
                System.out.print("  ");

            }

            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
