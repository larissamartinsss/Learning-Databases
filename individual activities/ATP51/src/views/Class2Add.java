package views;

import model.Categoria;
import utils.ConnectionFactory;

import java.sql.*;

public class Class2Add {
    public static void main(String[] args) {
        // try with resources
        try (Connection connection = new ConnectionFactory().getConnection()){
            Categoria cat1 = new Categoria("Celulares");
            String sql = "INSERT INTO categoria(nome)VALUES(?)";
            PreparedStatement prepStatement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, cat1.getNome());
            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();

            while (ids.next()) {
                int id = ids.getInt("id");
                System.out.printf("\nProduto com id nº: %s inserido com sucesso! ",id);
            }
        } catch (Exception e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}

