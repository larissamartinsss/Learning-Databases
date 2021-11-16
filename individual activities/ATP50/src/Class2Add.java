
import utils.ConnectionFactory;

import java.sql.*;

public class Class2Add {
    public static void main(String[] args) {
        // try with resources
        try (Connection connection = new ConnectionFactory().getConnection()){

            String sql = "INSERT INTO produto(nome,descricao,preco, codigo)VALUES('Mi band','5th',250.0,2)";

            PreparedStatement prepStatement = connection.prepareStatement(sql);

            prepStatement.execute(sql, prepStatement.RETURN_GENERATED_KEYS);
            ResultSet ids = prepStatement.getGeneratedKeys();

            while (ids.next()) {
                int id = ids.getInt(1);
                String.format("\nProduto com id nº: %s inserido com sucesso! ",id);
            }
        } catch (Exception e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}

