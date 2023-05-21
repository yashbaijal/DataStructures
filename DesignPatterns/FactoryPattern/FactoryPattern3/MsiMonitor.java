package conceptsJava.abstractFactoryPattern.products;

public class MsiMonitor implements Monitor {

    @Override
    public void assemble() {

        System.out.println("Assembling MSI Monitor");
    }
}
