package systemDesign.AbstractFactory.Furniture;

public class Brand1Chair implements IChair {

    @Override
    public void sit() {
        System.out.println("Brand 1 created Chair...");
    }

}
