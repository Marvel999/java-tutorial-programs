package singleton_Pattern;

/**
 * Sigleton pattern is concept where we are creating restrice to make multiple object
 * only one oject ca mack
 */
public class AppConfig {
    private AppConfig(){

    }
    private static AppConfig obj=null;

    public static AppConfig getInstance(){
        if(obj==null)
        obj=new AppConfig();
        return obj;
    }
    public void print(){
        System.out.println("nothing you have enter");
    }


}
