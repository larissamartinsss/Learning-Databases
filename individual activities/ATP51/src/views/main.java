package views;

import model.Categoria;
import utils.CategoriaDAO;
import utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) {
        try(Connection connection = new ConnectionFactory().getConnection()) {
            CategoriaDAO dao = new CategoriaDAO(connection);
            Categoria cat1 = new Categoria("Video games");
            Categoria cat2 = new Categoria("Informática");
            dao.create(cat1);
            dao.create(cat2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

