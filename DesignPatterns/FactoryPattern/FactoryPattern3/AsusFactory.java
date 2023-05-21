package conceptsJava.abstractFactoryPattern.factories;

import conceptsJava.abstractFactoryPattern.products.AsusGPU;
import conceptsJava.abstractFactoryPattern.products.AsusMonitor;
import conceptsJava.abstractFactoryPattern.products.GPU;
import conceptsJava.abstractFactoryPattern.products.Monitor;

public class AsusFactory  extends Company{

    public GPU createGPU()
    {
        return new AsusGPU();
    }

    public Monitor createMonitor()
    {
        return new AsusMonitor();
    }

}
