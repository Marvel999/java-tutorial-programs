package StringInJava;

/**
 * Stings are immutable in java.
 * a1==a return false due to string of heap area compare to pool area
 * a==b true
 */
public class StringJavaConcept {
    public static void main(String[] args){
        String a="Manish";
        String  b="Manish";
        String a1=new String("Ankit");//it create to string one at pool area heap area if already persent in heap area then not crated.
        System.out.println("a="+a);
        System.out.println("a1="+a1);
    }
}
