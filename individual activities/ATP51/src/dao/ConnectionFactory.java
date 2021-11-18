package dao;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
    String driverType = "jdbc";  String driverName = "postgresql";
    String host = "localhost";   String database = "postgres";
    String user = "postgres";    String pwd = "123456";
    private DataSource dataSource;
    int port = 5432;
    String connectionString = String.format("%s:%s://%s:%d/%s", driverType,driverName, host, port, database);

    // Poll conexões
    public ConnectionFactory() {
        ComboPooledDataSource poll = new ComboPooledDataSource();
        poll.setJdbcUrl(this.connectionString);
        poll.setUser(this.user);
        poll.setPassword(this.pwd);
        poll.setMaxPoolSize(50);
        this.dataSource = poll;
    }

    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
