package utils;
import model.Categoria;
import java.sql.*;
import java.util.ArrayList;

public class CategoriaDAO {
    private Connection connection;
    public CategoriaDAO(Connection connection) {
        this.connection = connection;
    }

    public void create(Categoria model) throws SQLException {

            String sql = "INSERT INTO categoria(nome)VALUES(?)";

            PreparedStatement prepStatement = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, model.getNome());
            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();

            while (ids.next()) {
                int id = ids.getInt("id");
                System.out.printf("\nProduto com id nº: %s inserido com sucesso! ",id);
            }

    }  public ArrayList<Categoria> list(){
        ArrayList<Categoria>list = new ArrayList<Categoria>();
        return list;
    }
    public void update(Categoria model){


    }  public void delete(int id){

    }
}
