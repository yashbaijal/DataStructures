package conceptsJava.factoryPatternNewWay;

public class OrderVeggieBurger extends Resturant{

    @Override
    public Burger createBurger() {
        System.out.println("Creating Veggie Burger");
        return new VeggieBurger();
    }
}
