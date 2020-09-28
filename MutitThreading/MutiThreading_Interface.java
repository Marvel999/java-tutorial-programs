package MutitThreading;

import java.io.IOException;

public class MutiThreading_Interface {
    public static class Hii implements Runnable{

        @Override
        public void run() {
            for (int i=0;i<5;i++){
                try {
                    System.out.println("Hii");
                    Thread.sleep(200);
                }catch (Exception e){

                }

            }
        }
    }
    public static class Hello implements Runnable{

        @Override
        public void run() {
            for (int i=0;i<5;i++){
                try {
                    System.out.println("Hello");
                    Thread.sleep(200);
                }catch (Exception e){

                }

            }
        }
    }

    public static void main(String[] args) {
        Runnable obj1=new Hii();
        Thread t1=new Thread(obj1);
        Runnable obj2=new Hello();
        Thread t2=new Thread(obj2);
        t1.start();
        try {
            Thread.sleep(100);
        }catch (Exception e){

        }
        t2.start();
    }
}
