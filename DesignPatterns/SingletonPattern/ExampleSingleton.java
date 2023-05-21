package conceptsJava.SingleTonPattern;

public class ExampleSingleton {

    public static void main(String[] args) {

        Singleton instance=Singleton.getInstance(4);
        System.out.println(instance);
        Singleton newinstance=Singleton.getInstance(10);
        System.out.println(newinstance);
    }
}
