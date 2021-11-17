package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class View {
    public static void main(String[] args) {
        try {
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            
            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);    
            String user = "postgres";
            String pwd = "91332686@a";   
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);

            conn.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}