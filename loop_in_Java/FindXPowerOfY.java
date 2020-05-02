package loop_in_Java;

import java.util.Scanner;

public class FindXPowerOfY {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int result=1;

    System.out.println("Enter X and Power Y");
    int x=sc.nextInt();
    int y=sc.nextInt();
    for(int i=0;i<y;i++){

        result*=x;
    }
    System.out.println("Result of your question is="+result);


    }
}
