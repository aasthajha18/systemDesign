package systemDesign.AbstractFactory.ZOO;

public class Main {

    public static void createFactoryProduct(ZooFactory fact) {
        IDog dog = fact.createDog();
        ICat cat = fact.createCat();

        dog.bark();
        cat.meow();
    }

    public static void main(String[] args) {

        ZooFactory Domfact = new DomesticFactory();
        createFactoryProduct(Domfact);

        ZooFactory Wildfact = new WildLifeFactory();
        createFactoryProduct(Wildfact);
    }
}
