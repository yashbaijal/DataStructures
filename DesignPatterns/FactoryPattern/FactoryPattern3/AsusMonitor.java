package conceptsJava.abstractFactoryPattern.products;

public class AsusMonitor implements Monitor {

    @Override
    public void assemble() {
        System.out.println("Assembling Asus Monitor");
    }
}
