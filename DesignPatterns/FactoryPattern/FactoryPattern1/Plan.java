package conceptsJava.factoryPattern;

public abstract class Plan {

    double rate;
    public void getRate(){};

    public void calculateBill(int units)
    {
        System.out.println(units*rate);
    }

}
