package sqlconnection;

/**
 * Created by Dima on 21.03.2017.
 */

// Use the JDBC driver

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnection {

    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
        String connectionString =
                "jdbc:sqlserver://localhost:1433;"
                        + "databaseName=Administrator;"
                        + "user=Admin;"
                        + "password=oxanadimavg1929;"
                        + "trustServerCertificate=false;"
                        + "hostNameInCertificate=*.database.windows.net;"
                        + "loginTimeout=30;";

        // Declare the JDBC objects.
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(connectionString);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) try {
                System.out.println("TEST");
                connection.close();
            } catch (Exception e) {
            }
        }
    }
}