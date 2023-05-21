package conceptsJava.abstractFactoryPattern.factories;

import conceptsJava.abstractFactoryPattern.products.GPU;
import conceptsJava.abstractFactoryPattern.products.Monitor;

public abstract class Company {

    public abstract GPU createGPU();
    public abstract Monitor createMonitor();
}
