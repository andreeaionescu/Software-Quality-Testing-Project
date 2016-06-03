package ro.ase.cts.model;

import java.sql.*;

/**
 * Created by Andreea-Ionescu on 5/31/2016.
 */
public class SingletonDBConnection {



    public static final String url= "jdbc:mysql://46.101.235.72:3306/";
    public static final String dbName = "timpliber";
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String userName = "root";
    public static final String password = "password";

    //referinta catre instanta unica globala
    private static SingletonDBConnection db = null;

    private SingletonDBConnection() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection createConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url+dbName,userName,password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR: Unable to Connect to Database.");
        }
        return connection;
    }

    public static Connection getInstance()
    {
        if(db==null){
            db = new SingletonDBConnection();
        }
        return db.createConnection();
    }

}
