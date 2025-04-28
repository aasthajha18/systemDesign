package systemDesign.factoryMethod.dbConnection;

public class MongoDbConnectionFactory implements IDBConnectionfactory {

    @Override
    public IDB createConnection() {
        return new MongoDBConnect();
    }

}
