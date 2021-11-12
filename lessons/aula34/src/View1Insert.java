import java.sql.*;

public class View1Insert {
    public static void main(String[] args) {
        try {
            // SQL Injection
            String nome = "Eletro');delete from categoria; INSERT INTO categoria(nome)values('otario";

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "123456");
            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO categoria(nome)values(?)",
                    Statement.RETURN_GENERATED_KEYS);

            prepStatement.setString(1, nome);

            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}