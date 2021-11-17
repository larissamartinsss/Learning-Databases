package views;

import model.Categoria;
import utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Class3Update {
    public static void main(String[] args) {
        try ( Connection connection = new ConnectionFactory().getConnection()){
            Categoria cat = new Categoria(5, "Atualizando...");

            String sql = "UPDATE categoria SET nome=? where id = ?";
            PreparedStatement prepStatement = connection.prepareStatement(sql);
            prepStatement.setInt(1, cat.getId());
            prepStatement.setString(2, cat.getNome());
            prepStatement.execute(sql);

            int linhasAlteradas = prepStatement.getUpdateCount();
            System.out.printf("\nO nº de linhas alteradas é de: %d", linhasAlteradas);

        } catch (Exception e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}
