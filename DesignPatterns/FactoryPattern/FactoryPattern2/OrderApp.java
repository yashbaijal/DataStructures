package conceptsJava.factoryPatternNewWay;

public class OrderApp {

    public static void main(String[] args) {
        Resturant beefOrder= new OrderBeefBurger();
        beefOrder.orderBurger();

        System.out.println("==========================================");
        Resturant vegBurger= new OrderVeggieBurger();
        vegBurger.orderBurger();

    }
}
