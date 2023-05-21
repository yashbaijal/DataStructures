package conceptsJava.SingleTonPattern;

public class Singleton {

    private static volatile Singleton instance=null;
    private int id;

    private Singleton(int id)
    {
        this.id=id;
    }

    public static Singleton getInstance(int id)
    {
        if(instance == null){
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(id);
            }
        }
        }
        return instance;
    }

}
