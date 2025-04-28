package systemDesign.AbstractFactory.ZOO;

public class WildLifeFactory implements ZooFactory {

    @Override
    public IDog createDog() {
        return new WildLifeDog();
    }

    @Override
    public ICat createCat() {
        return new WildLifeCat();
    }

}
