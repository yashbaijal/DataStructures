package DesignPatterns.BuilderPattern2;

public class Director {

    public void buildBugatti(Builder builder)
    {
        builder.brand("Buggati")
                .engine("8L")
                .noOfDoors(2)
                .height(115);
    }

    public void buildLambo(Builder builder)
    {
        builder.brand("Lamborgini")
                .engine("10L")
                .noOfDoors(2)
                .height(120);
    }
}
