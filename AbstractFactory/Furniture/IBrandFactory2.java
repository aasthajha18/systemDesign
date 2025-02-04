package systemDesign.AbstractFactory.Furniture;

public class IBrandFactory2 implements IFurnitureFactory {

    @Override
    public IChair createChair() {
        return new Brand2CChair();
    }

    @Override
    public ISofa createSofa() {
        return new Brand2Sofa();
    }

}
