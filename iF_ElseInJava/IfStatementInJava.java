package iF_ElseInJava;

import java.util.Scanner;

/**
 * If Statement is work on the true and false
 * 1. if(inside block is true then go inside the block other wise go out of the block or in else statement)
 * 2. every block is independent
 */
public class IfStatementInJava {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the overall Percentage and we will give Grade According to your marks.");
        System.out.println("Please Enter your Marks");
        int marks=sc.nextInt();
        if(marks>=90)
            System.out.println("Grade=A");
        if(marks>=80 && marks<90)
            System.out.println("Grade=B");
        if(marks>=70 && marks<80)
            System.out.println("Grade=C");
        if(marks>=60 && marks<70)
            System.out.println("Grade=D");
        if(marks<60)
            System.out.println("Fail");


    }
}
