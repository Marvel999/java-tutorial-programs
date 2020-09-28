package MutitThreading;

public class MutiThreading_Lamdass {


    public static void main(String[] args) {
//        Runnable obj1=()-> {
//                for (int i=0;i<5;i++){
//                    try {
//                        System.out.println("Hii");
//                        Thread.sleep(200);
//                    }catch (Exception e){
//
//                    }
//
//                }
//
//        };

//
//        Runnable obj1=new Runnable() {
//            @Override
//            public void run() {
//                for (int i=0;i<5;i++){
//                    try {
//                        System.out.println("Hii");
//                        Thread.sleep(200);
//                    }catch (Exception e){
//
//                    }
//
//                }
//            }
//        };
        Thread t1=new Thread(()-> {
            for (int i=0;i<5;i++){
                try {
                    System.out.println("Hii");
                    Thread.sleep(200);
                }catch (Exception e){

                }

            }

        });
//        Runnable obj2=()-> {
//                for (int i=0;i<5;i++){
//                    try {
//                        System.out.println("Hello");
//                        Thread.sleep(200);
//                    }catch (Exception e){
//
//                    }
//
//                }
//
//        };
//        Runnable obj2=new Runnable() {
//            @Override
//            public void run() {
//                for (int i=0;i<5;i++){
//                    try {
//                        System.out.println("Hello");
//                        Thread.sleep(200);
//                    }catch (Exception e){
//
//                    }
//
//                }
//            }
//        };
        Thread t2=new Thread(()-> {
            for (int i=0;i<5;i++){
                try {
                    System.out.println("Hello");
                    Thread.sleep(200);
                }catch (Exception e){

                }

            }

        });
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        t1.start();
        try {
            Thread.sleep(100);
        }catch (Exception e){

        }
        t2.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}
