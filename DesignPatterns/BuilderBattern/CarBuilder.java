package DesignPatterns.BuilderPattern2;

public class CarBuilder implements Builder{

    private int id;
    private int height;
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int noOfDoors;

    public CarBuilder id(int id)
    {
        this.id=id;
        return this;
    }

    public CarBuilder height(int height)
    {
        this.height=height;
        return this;
    }

    public CarBuilder brand(String brand)
    {
        this.brand=brand;
        return this;
    }

    public CarBuilder model(String model)
    {
        this.model=model;
        return this;
    }

    public CarBuilder color(String color)
    {
        this.color=color;
        return this;
    }

    public CarBuilder engine(String engine)
    {
        this.engine=engine;
        return this;
    }

    public CarBuilder noOfDoors(int noOfDoors)
    {
        this.noOfDoors=noOfDoors;
        return this;
    }

    public Car build()
    {
        return new Car(id,height,brand,model,color,engine,noOfDoors);
    }

}
