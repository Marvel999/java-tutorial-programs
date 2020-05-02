package loop_in_Java;

import java.util.Scanner;

public class SeriseSum_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre nuber till where you want you serise sum");
        int n=sc.nextInt();
        int result=0;
        for(int i=1; i<=n;i++){
            result+=i;
        }
        System.out.println("Sum of Serise is="+result);

    }
}
