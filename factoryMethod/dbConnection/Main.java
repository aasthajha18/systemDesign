package systemDesign.factoryMethod.dbConnection;

public class Main {

    public static void main(String[] args) {
        IDBConnectionfactory mongoConnectionFcatory = new MongoDbConnectionFactory();
        IDB mongodbConn = mongoConnectionFcatory.createConnection();
        mongodbConn.connect();

        IDBConnectionfactory sqlConnectionFactory = new SQLConnectionFactory();
        IDB sqlConn = sqlConnectionFactory.createConnection();
        sqlConn.connect();
    }
}
