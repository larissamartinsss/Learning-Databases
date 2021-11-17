package views;

import utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Class4Delete {
    public static void main(String[] args) {
        try( Connection connection = new ConnectionFactory().getConnection()){
            int idDeleted = 2;
            String sql = "DELETE FROM categoria WHERE id = ?";

            try(PreparedStatement prepStatement = connection.prepareStatement(sql)){
            prepStatement.execute(sql);
            prepStatement.execute(sql);

            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.printf("\nForam deletadas %d linhas.", linhasAfetadas);
}catch (Exception e) {
            e.printStackTrace();
        }

        } catch (Exception e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}
