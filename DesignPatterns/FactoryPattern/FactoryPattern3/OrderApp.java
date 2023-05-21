package conceptsJava.abstractFactoryPattern;

import com.sun.tools.javac.util.List;
import conceptsJava.abstractFactoryPattern.factories.AsusFactory;
import conceptsJava.abstractFactoryPattern.factories.Company;
import conceptsJava.abstractFactoryPattern.factories.MSIFactory;
import conceptsJava.abstractFactoryPattern.products.Product;

public class OrderApp {

    public static void main(String[] args) {

        Company msi=new MSIFactory();
        Company asus=new AsusFactory();

        List.of(msi.createGPU(), asus.createMonitor()).forEach(Product::assemble);
    }
}
