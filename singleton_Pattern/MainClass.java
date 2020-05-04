package singleton_Pattern;

public class MainClass {
    public static void main(String[] args){
        AppConfig appConfig=AppConfig.getInstance();
        appConfig.print();
    }
}
