package loop_in_Java;

import java.util.Scanner;

public class seriseSum_2 {

    public static void main(String[] args){
        float result=0.0f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            result += (1/i);
        }
        System.out.println("Sum of serise is="+result);
    }
}
