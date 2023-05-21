package DesignPatterns.BuilderPattern2;

public class Car {

    private final int id;
    private final int height;
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int noOfDoors;

    Car(int id,int height,String brand,String model,String color,String engine,int noOfDoors)
    {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.height = height;
        this.engine = engine;
        this.noOfDoors = noOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", height=" + height +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", noOfDoors=" + noOfDoors +
                '}';
    }
}
