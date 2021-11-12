package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Class3Update {
    public static void main(String[] args) {
        try {
            String driverType = "jdbc";  String driverName = "postgresql";
            String host = "localhost";   String database = "postgres";
            String user = "postgres";    String pwd = "123456";
            int port = 5432;
            String connectionString = String.format("%s:%s://%s:%d/%s", driverType,driverName, host, port, database);
            // Conectando:
            Connection connection = DriverManager.getConnection(connectionString, user, pwd);
            Statement statement = connection.createStatement();
            String sql = "UPDATE produto SET categoria_id = 1 where id > 0";
            statement.execute(sql);

            int linhasAlteradas = statement.getUpdateCount();
            System.out.printf("\nO nº de linhas alteradas é de: %d", linhasAlteradas);

            connection.close();
        } catch (Exception e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}
