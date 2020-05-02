package FunctionOverloading;

public class FunctionTesting {
    public static void main(String[] args){
        sum(12,12,24,13);
        printname("Manish");
    }

    /** function overloading in java type
     * 1. Number of parameter.
     * 2. Type of parameter.
     */
    public static void sum(){
        System.out.println("Please enter two number");
    }

    public static void sum(int a){
        System.out.println("Please enter Second number");
    }
    public static void sum(int a, int b ){
        int sum=a+b;
        System.out.println("Sum="+sum);
    }
    public static void sum(int a, int b,int c ){
        int sum=a+b+c;
        System.out.println("Sum="+sum);
    }
    private static void sum(int a, int b,int c,int d ){
        int sum=a+b+c+d;
        System.out.println("Sum="+sum);
    }

    private static void printname( ){
        System.out.println("Unknown person is want to enter in program.");
    }

    private static void printname(String name){
        System.out.println(name+" is want to enter in program.");
    }

}
