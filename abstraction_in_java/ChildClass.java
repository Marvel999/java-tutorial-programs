package abstraction_in_java;

public class ChildClass extends AbstractionInJava {
    @Override
    public void print(int a) {
        System.out.println("You have entre"+a);
    }

    @Override
    public void print() {
        System.out.println("You have entre empty");

    }
}
