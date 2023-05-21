package conceptsJava.abstractFactoryPattern.factories;

import conceptsJava.abstractFactoryPattern.products.GPU;
import conceptsJava.abstractFactoryPattern.products.Monitor;
import conceptsJava.abstractFactoryPattern.products.MsiGPU;
import conceptsJava.abstractFactoryPattern.products.MsiMonitor;

public class MSIFactory extends Company{

    public GPU createGPU()
    {
        return new MsiGPU();
    }

    public Monitor createMonitor()
    {
        return new MsiMonitor();
    }

}
