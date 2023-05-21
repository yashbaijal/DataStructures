package DesignPatterns.BuilderPattern2;

public class MainApp {

    public static void main(String[] args) {

        Director director=new Director();

        CarBuilder carBuilder=new CarBuilder();
        director.buildBugatti(carBuilder);
        carBuilder.model("Chiron");
        carBuilder.color("black");
        carBuilder.engine("10L");
        System.out.println(carBuilder.build());
    }
}
