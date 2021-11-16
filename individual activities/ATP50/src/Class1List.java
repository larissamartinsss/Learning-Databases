
import utils.ConnectionFactory;

import java.sql.*;
import java.sql.PreparedStatement;

public class Class1List {
    public static void main(String[] args) {
        // 1º step:
        try (Connection connection = new ConnectionFactory().getConnection()) {
            String sql = "SELECT id, nome FROM PRODUTO";

            try (PreparedStatement prepStatement = connection.prepareStatement(sql)) {
                //Buscar Retorno do statement:
                ResultSet result = prepStatement.getResultSet();
                while (result.next()) {
                    int id = result.getInt("id");
                    String nome = result.getString("nome");
                    System.out.printf("\nId: %d \n Nome: %s", id, nome);

                } }catch (Exception e) {
                e.printStackTrace();
            }
                System.out.println("Banco de dados conectado! ");
            } catch (SQLException e) {
                System.out.println("Não é possível conectar ao Banco de Dados. ");
            }
        }
    }



