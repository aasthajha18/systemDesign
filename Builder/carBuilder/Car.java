package systemDesign.Builder.carBuilder;

public class Car {
    String color;
    String engine;

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String toString() {
        return "color: " + this.color + "engine: " + this.engine;
    }
}
