package loop_in_Java;

import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args){
     System.out.println("please entre number of pattern");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for (int j=0;j<i;j++)
                System.out.print("* ");
            System.out.println();

    }
    }
}
