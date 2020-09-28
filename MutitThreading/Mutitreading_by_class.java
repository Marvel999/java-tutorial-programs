package MutitThreading;

public class Mutitreading_by_class {
    public static class A extends Thread{
        @Override
        public void run() {
            for (int i=0;i<5;i++){
                System.out.println("Hii");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class B extends Thread{
        @Override
        public void run() {
            for (int i=0;i<5;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        A obj=new A();
        B obj1=new B();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t2.start();
        Thread.sleep(100);
        t1.start();
    }
}
