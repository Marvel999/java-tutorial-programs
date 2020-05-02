package loop_in_Java;

import java.util.Scanner;

public class ChecknumberIsPrimeOrNot {
    public static void main(String[] args) {
        boolean isprime = true;
        int number;

        System.out.println("Enter number to check prime or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i * i <=num; i++) {
            if (num % i == 0){
                isprime=false;
            }
        }

        if(num<2)
            System.out.println("Given number is not prime number");
        else
        System.out.println("Number is prime="+isprime);

    }
}
