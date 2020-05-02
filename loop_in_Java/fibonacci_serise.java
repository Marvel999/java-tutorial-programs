package loop_in_Java;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class fibonacci_serise {

public static void  main(String[] args){
   int a=0;
   int b=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("please provide number till where you need fibbonacci number");
    int n=sc.nextInt();
    System.out.print(a+" "+b+" ");
    for(int i=0;i<n-2;i++){
        int c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
    }



}


}
