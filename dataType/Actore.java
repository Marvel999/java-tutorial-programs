package dataType;

import inheritance_java.Youtuber;

public class Actore extends Youtuber {
    private  String nameActore="rishi Kapoor";
    //Inheriting class with thier keyword extends and the class name.
    @Override
    public void makeVideos() {
        System.out.println("wow !! Actore is also an youtuber and he want to make video eveyday");
    }

    public void acting() { // out package class cant inherit defualt fuction of class, only public function can be inherit.
        System.out.println("This is fun time");
    }
}
