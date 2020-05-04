package upcasting_Downcasting;

public class MainClass {
    public static void main(String[] args){
        Cat c= new Cat();
        Animal a= c;      //upCasting
        a.walk();

        Dog d=new Dog();
        Animal a1=d;       //downCasting
        Dog d1=(Dog)a;
        d1.dogcolor();
        a1.walk();;




    }
}
