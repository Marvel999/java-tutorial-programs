package loop_in_Java;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        int i;
        int n=1;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter factorial base number");
        int fact=sc.nextInt();

        for (i=1; i<=fact;i++)
            n*=i;

        System.out.println("Factorial of given number is="+n);
    }

}
