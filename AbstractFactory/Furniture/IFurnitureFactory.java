package systemDesign.AbstractFactory.Furniture;

public interface IFurnitureFactory {
    IChair createChair();

    ISofa createSofa();
}
