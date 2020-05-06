package switchCase_in_java;

import java.util.Scanner;

public class swichCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter opration");
        char ch=sc.nextLine().charAt(0);
        int Result=0;
        switch (ch) {
            case '+':
                Result=a+b;
                System.out.println("Result="+Result);
                break;
            case '-':
                Result=a-b;
                System.out.println("Result="+Result);
                break;
            case '*':
                Result=a*b;
                System.out.println("Result="+Result);
                break;
            case '/':
                Result=a/b;
                System.out.println("Result="+Result);
                break;
            case '>':
                a>>=1;//it means devide by 2.
                Result=a;
                System.out.println("Result="+Result);
                break;
            case '<':
                a<<=1;//it means a multiply by 2.
                Result=a;
                System.out.println("Result="+Result);
            default:
                Result=0;
                System.out.println("Invalid Opration");

        }
    }
}
