
import java.sql.*;
import java.sql.PreparedStatement;

public class Class1List {
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

             PreparedStatement prepStatement = connection.prepareStatement("SELECT id, nome FROM PRODUTO");

            //Buscar Retorno do statement:
            ResultSet result = prepStatement.getResultSet();
            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");

               String.format("\nId: %d \n Nome: %s", id, nome);

            }
            connection.close();
            System.out.println("Banco de dados conectado! ");
        } catch (SQLException e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}


