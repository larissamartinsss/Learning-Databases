package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Class2Add {
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
            String sql = "INSERT INTO produto(nome,descricao,preco,categoria_id)VALUES('Mi band','5th','250',2)";

            statement.execute(sql, statement.RETURN_GENERATED_KEYS);
            ResultSet ids = statement.getGeneratedKeys();

            while (ids.next()) {
                int id = ids.getInt(1);
                String.format("\nProduto com id nº: %s inserido com sucesso! ",id);
            }

            connection.close();
        } catch (Exception e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}

