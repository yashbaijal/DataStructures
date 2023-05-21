package conceptsJava.abstractFactoryPattern.products;

public class MsiGPU implements GPU {

    @Override
    public void assemble() {

        System.out.println("Assembling MSI GPU");
    }
}
