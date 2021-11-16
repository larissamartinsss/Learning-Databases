package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    String driverType = "jdbc";  String driverName = "postgresql";
    String host = "localhost";   String database = "postgres";
    String user = "postgres";    String pwd = "123456";
    int port = 5432;
    String connectionString = String.format("%s:%s://%s:%d/%s", driverType,driverName, host, port, database);

    // Poll conexões
    public ConnectionFactory() {
        ComboPooledDataSource poll = new ComboPooledDataSource();
        poll.setJdbcUrl(this.connectionString);
        poll.setUser(this.user);
        poll.setPassword(this.pwd);
        poll.setMaxPoolSize(50);
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionString, user, pwd);
    }
}
