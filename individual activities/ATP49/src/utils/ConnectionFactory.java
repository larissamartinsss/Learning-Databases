package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() throws SQLException {
        String driverType = "jdbc";  String driverName = "postgresql";
        String host = "localhost";   String database = "postgres";
        String user = "postgres";    String pwd = "123456";
        int port = 5432;
        String connectionString = String.format("%s:%s://%s:%d/%s", driverType,driverName, host, port, database);
        // Conectando:
        Connection connection = DriverManager.getConnection(connectionString, user, pwd);
        return connection;
    }
}
