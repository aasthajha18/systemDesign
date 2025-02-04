package systemDesign.AbstractFactory.Furniture;

public class Main {
    public static void main(String[] args) {

        System.out.println("Product created by Brand 1");
        IFurnitureFactory factoty = new IBrandFactoryOne();
        IChair brand1Chair = factoty.createChair();
        brand1Chair.sit();

        IFurnitureFactory factory = new IBrandFactoryOne();
        ISofa brand1Sofa = factory.createSofa();
        brand1Sofa.sleepTime();

        System.out.println("");
        System.out.println("Product created by brand 2");
        IFurnitureFactory factoryy = new IBrandFactory2();
        IChair brand2Chair = factoryy.createChair();
        brand2Chair.sit();

        IFurnitureFactory fact = new IBrandFactory2();
        ISofa brand2Sofa = fact.createSofa();
        brand2Sofa.sleepTime();
    }

}
