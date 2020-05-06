package opratoreInJava;

public class terrrary_Oprator {
    public static void main(String[] args){
        System.out.println(graterNumber(2,6,18));
    }
    public static int graterNumber(int a,int b){
        return a>b?a:b; //terrary optrator.
    }
    public static int graterNumber(int a,int b,int c){
        return a>b?a>c?a:b:b>c?b:c;
    }
}

