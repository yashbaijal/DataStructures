package conceptsJava.factoryPatternNewWay;

public class OrderBeefBurger extends Resturant{

    @Override
    public Burger createBurger() {
        System.out.println("Creating BeefBurger");
        return new BeefBurger();
    }
}
