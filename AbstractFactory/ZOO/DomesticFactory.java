package systemDesign.AbstractFactory.ZOO;

public class DomesticFactory implements ZooFactory {

    @Override
    public IDog createDog() {
        return new DomesticDog();
    }

    @Override
    public ICat createCat() {
        return new DomesticCat();
    }

}
