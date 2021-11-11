package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class View {
    public static void main(String[] args) {
        // 1º step:
        try {
            String driverType = "jdbc";  String driverName = "postgresql";
            String host = "localhost";   String database = "postgres";
            String user = "postgres";    String pwd = "123456";
            int port = 5432;

            String connectionString = String.format("%s:%s://%s:%d/%s", driverType,driverName, host, port, database);
            Connection connection = DriverManager.getConnection(connectionString, user, pwd);
            connection.close();
            System.out.println("Banco de dados conectado! ");
        } catch (SQLException e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}


