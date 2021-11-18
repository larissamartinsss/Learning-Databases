package dao;
import model.Categoria;
import java.sql.*;
import java.util.ArrayList;

public class CategoriaDAO {
    // Parei aqui: https://youtu.be/6X0KWhNM3-0?t=2210
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

    }  public ArrayList<Categoria> list() throws SQLException{
        ArrayList<Categoria>list = new ArrayList<Categoria>();

        PreparedStatement prepStatement = connection.prepareStatement("SELECT * FROM CATEGORIA");
        //Buscar Retorno do statement:
        prepStatement.execute();
        ResultSet result = prepStatement.getResultSet();
        while (result.next()) {
            Categoria cat = new Categoria(result.getInt("id"), result.getString("nome"));
            list.add(cat);
        }
        return list;
    }

    public int update(Categoria model) throws SQLException{
        Categoria cat = new Categoria(5, "Atualizando...");

        String sql = "UPDATE categoria SET nome=? where id = ?";
        PreparedStatement prepStatement = connection.prepareStatement(sql);
        prepStatement.setInt(1, model.getId());
        prepStatement.setString(2, model.getNome());
        prepStatement.execute();
        return prepStatement.getUpdateCount();
        }

    public int delete(int id){
        int linhasAfetadas = 0;
        String sql = "DELETE FROM categoria WHERE id = ?";

        try(PreparedStatement prepStatement = connection.prepareStatement(sql)){
            prepStatement.setInt(1, id);
            prepStatement.execute();
            linhasAfetadas = prepStatement.getUpdateCount();
            System.out.printf("\nForam deletadas %d linhas.", linhasAfetadas);
        }catch (Exception e) {
            System.out.println("Não foi possível deletar");
        }
        return linhasAfetadas;
    }
}
