package iF_ElseInJava;
/**
 * if block insode it onemore if block(or if else block or elseif block) that is called nested if.
 */

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the overall Percentage and we will give Grade According to your marks.");
        System.out.println("Please Enter your Marks");
        int marks=sc.nextInt();
        if(marks>=60){
            System.out.println("Congratulation, You have pass your class");
        if(marks>=90)
            System.out.println("Grade=A");
        else if(marks>=80 && marks<90)
            System.out.println("Grade=B");
        else if(marks>=70 && marks<80)
            System.out.println("Grade=C");
        else if(marks>=60 && marks<70)
            System.out.println("Grade=D");
        }
        else {
            System.out.println("better luck try next time, Sorry");
            System.out.println("Fail");
        }

    }
}
