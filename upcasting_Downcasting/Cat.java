package upcasting_Downcasting;

public class Cat extends Animal {
    public void color(){
        System.out.println("Cat is brown color");
    }
    public void cateat(){
        super.eat();
        System.out.println("Cat is eating");

    }

    public void walk(){
        super.walk();  // calling super function from Animal it call walk function from Animal
        System.out.println("Cat is walk");

    }


}
