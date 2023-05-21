package conceptsJava.factoryPatternNewWay;

public abstract class Resturant {

    public void orderBurger()
    {
        System.out.println("Ordering burger ...");
        Burger burger= createBurger();
        burger.prepare();
    }

    public abstract Burger createBurger();
}
