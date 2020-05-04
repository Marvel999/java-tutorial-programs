package iF_ElseInJava;

import java.util.Scanner;

/**
 * Here each block are dependent to each other here the block will execute in order top to buttom.
 * else condition does not contain conditional statment
 */
public class ElseIF {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the overall Percentage and we will give Grade According to your marks.");
        System.out.println("Please Enter your Marks");
        int marks=sc.nextInt();
        if(marks>=90)
            System.out.println("Grade=A");
        else if(marks>=80 && marks<90)
            System.out.println("Grade=B");
        else if(marks>=70 && marks<80)
            System.out.println("Grade=C");
        else if(marks>=60 && marks<70)
            System.out.println("Grade=D");
        else
            System.out.println("Fail");


    }
}
