package inheritance_java;

import dataType.Actore;

public  class Person {
    public static void main(String[] args){
        String name="Manish";
        Student obj=new Student();
        obj.eveningWalk();
        obj.makeVideos();
        Actore act=new Actore();//Actore class is at dataType package.
        act.makeVideos();
        act.acting();
        Youtuber yt= new Youtuber() {// you can make object of abstract class but you have to implement their abstract method.
            @Override
            public void makeVideos() {
                System.out.println("i am youtuber and want to make videos");
            }
        };
        yt.makeVideos();
        }
    }


