package views;

import model.Categoria;
import utils.ConnectionFactory;

import java.sql.*;
import java.sql.PreparedStatement;

public class Class1List {
    public static void main(String[] args) {
        // 1º step:
        try (Connection connection = new ConnectionFactory().getConnection()) {

            try (PreparedStatement prepStatement = connection.prepareStatement("SELECT * FROM PRODUTO")) {
                //Buscar Retorno do statement:
                prepStatement.execute();
                ResultSet result = prepStatement.getResultSet();
                while (result.next()) {
                    Categoria cat = new Categoria(result.getInt("id"), result.getString("nome"));
                    System.out.println(cat);

                } }catch (Exception e) {
                e.printStackTrace();
            }
                System.out.println("Banco de dados conectado! ");
            } catch (SQLException e) {
                System.out.println("Não é possível conectar ao Banco de Dados. ");
            }
        }
    }



