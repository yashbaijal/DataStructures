package conceptsJava.SingleTonPattern;

public class Singleton {

    private static volatile Singleton instance=null; // making volatile will insure no metod call will face half initialized objects.
    private int id;

    private Singleton(int id)
    {
        this.id=id;
    }

    public static Singleton getInstance(int id) // we dont fo synchonize here as it will make every call to this method synchronized.
    {
        if(instance == null){
        synchronized (Singleton.class) { // this will synchonize only this block which is creating instance.
            if (instance == null) {
                instance = new Singleton(id);
            }
        }
        }
        return instance;
    }

}
