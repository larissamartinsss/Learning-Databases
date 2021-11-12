
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Class4Delete {
    public static void main(String[] args) {
        try {

            String driverType = "jdbc";  String driverName = "postgresql";
            String host = "localhost";   String database = "postgres";
            String user = "postgres";    String pwd = "123456";
            int port = 5432;
            String connectionString = String.format("%s:%s://%s:%d/%s", driverType,driverName, host, port, database);
            // Conectando:
            Connection connection = DriverManager.getConnection(connectionString, user, pwd);
            String sql = "DELETE FROM produto WHERE id = 3";
            PreparedStatement prepStatement = connection.prepareStatement(sql);
            prepStatement.execute(sql);
            prepStatement.execute(sql);

            int linhasExcluidas = prepStatement.getUpdateCount();
            System.out.printf("\nForam deletadas %d linhas.", linhasExcluidas);

            connection.close();
        } catch (Exception e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}
