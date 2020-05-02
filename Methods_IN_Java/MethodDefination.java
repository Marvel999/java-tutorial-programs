package Methods_IN_Java;

public class MethodDefination {
    public static void main(String[] args){
        Dog a= new Dog();
        max(a);
        a.legs=3;
        System.out.println("legs="+a.legs);

    }
   static void max(Dog dog){
        dog.legs=6;
    }
}

class Dog{
    int legs;
//    void max(){
//        legs=6;
//    }
}
