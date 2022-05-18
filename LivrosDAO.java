import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivrosDAO{
    private Connection conexao;

    public LivrosDAO(){
        this.conexao = ConnectionFactory.getConnection();
    }

    public void adiciona(Livros livro){
        try{
            String sql = "insert into Livros"+"(cod_Livro, nome_Livro, nome_Autor, preco, cod_Autor)"+"values(?,?,?,?,?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(2, "1984");
            stmt.setString(3, "George Orwell");
            stmt.setDouble(4, 50.00);
            stmt.setInt(5, 5561);
            stmt.execute();
            System.out.println("Gravado!");
        }catch(SQLException e){
            System.out.println("Não foi possível adicionar!");
        }
    }
}