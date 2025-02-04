package systemDesign.factoryMethod.dbConnection;

public class SQLConnectionFactory implements IDBConnectionfactory {

    @Override
    public IDB createConnection() {
        return new SQLDBConnect();
    }

}
