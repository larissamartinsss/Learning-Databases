package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class View {
    public static void main(String[] args) {
        // 1º step:
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            System.out.println("Banco de dados conectado! ");
        } catch (SQLException e) {
            System.out.println("Não é possível conectar ao Banco de Dados. ");
        }
    }
}
