package views;

import utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Class4Delete {
    public static void main(String[] args) {
        try( Connection connection = new ConnectionFactory().getConnection()){

            String sql = "DELETE FROM produto WHERE id = 3";
            PreparedStatement prepStatement = connection.prepareStatement(sql);
            prepStatement.execute(sql);
            prepStatement.execute(sql);

            int linhasExcluidas = prepStatement.getUpdateCount();
            System.out.printf("\nForam deletadas %d linhas.", linhasExcluidas);

        } catch (Exception e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}
