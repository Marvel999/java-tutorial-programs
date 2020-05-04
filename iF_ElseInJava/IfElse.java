package iF_ElseInJava;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the overall Percentage and we will give you are pass or fail According to your marks.");
        System.out.println("Please Enter your Marks");
        int marks=sc.nextInt();
        if(marks>=60)
            System.out.println("Pass");
         else
             System.out.println("Fail");

    }
}
