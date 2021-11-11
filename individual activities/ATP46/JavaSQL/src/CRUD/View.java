package CRUD;

import java.sql.*;

public class View {
    public static void main(String[] args) {
        // 1º step:
        try {
            String driverType = "jdbc";  String driverName = "postgresql";
            String host = "localhost";   String database = "postgres";
            String user = "postgres";    String pwd = "123456";
            int port = 5432;
            String connectionString = String.format("%s:%s://%s:%d/%s", driverType,driverName, host, port, database);
            // Conectando:
            Connection connection = DriverManager.getConnection(connectionString, user, pwd);
            // Acessando DB - Query SQL:
            Statement statement = connection.createStatement();
            statement.execute("SELECT * FROM PRODUTO");
            //Buscar Retorno do statement:
            ResultSet result = statement.getResultSet();
            while (result.next()) {
                int id = result.getInt("id");
                System.out.println(id);
            }
            connection.close();
            System.out.println("Banco de dados conectado! ");
        } catch (SQLException e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}


