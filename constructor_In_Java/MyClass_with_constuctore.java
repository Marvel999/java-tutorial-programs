package constructor_In_Java;

public class MyClass_with_constuctore {
    int Roll=12;
    String name="Manish";
    // Cunsteuctor overloading
    MyClass_with_constuctore(int Roll, String name) {
        this.Roll = Roll;
        this.name = name;
    }
    MyClass_with_constuctore(String name) {
        this.name = name;
    }
    MyClass_with_constuctore() {
        // Default Constructor.
    }

    public void print(){
        System.out.println("My name is "+name);
    }

    public void print1(){
        System.out.println("My name is "+name);
        System.out.println("My Roll number is "+Roll);
    }

}
