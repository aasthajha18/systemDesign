package systemDesign.AbstractFactory.Furniture;

public class IBrandFactoryOne implements IFurnitureFactory {

    @Override
    public IChair createChair() {
        return new Brand1Chair();
    }

    @Override
    public ISofa createSofa() {
        return new Brand1Sofa();
    }

}
