
import utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Class3Update {
    public static void main(String[] args) {
        try ( Connection connection = new ConnectionFactory().getConnection()){

            String sql = "UPDATE produto SET categoria_id = 1 where id > 0";
            PreparedStatement prepStatement = connection.prepareStatement(sql);
            prepStatement.execute(sql);

            int linhasAlteradas = prepStatement.getUpdateCount();
            System.out.printf("\nO nº de linhas alteradas é de: %d", linhasAlteradas);

        } catch (Exception e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}
