package staticBlock;

/**
 * Static block first execute in order to top to bottom.
 * First Execute Static block the execute constructor block.
 */

public class StaticBlockExplanation {

    static {
        System.out.println("My name is Manish");
    }
    static {
        System.out.println("My fathername is Manoj Kumar Singh");
    }
    StaticBlockExplanation(String name){
        System.out.println("My name is "+name);

    }
    static {
        System.out.println("My Mothername is AshaDevi");
    }

}
