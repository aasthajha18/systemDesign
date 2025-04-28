package systemDesign.factoryMethod.dbConnection;

public class MongoDBConnect implements IDB {

    @Override
    public void connect() {
        System.out.println("Inside MongoDBConnection......");
    }

}
