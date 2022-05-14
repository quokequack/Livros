import java.sql.*;
import java.sql.Connection;
import java.util.Calendar;

public class Main {
    public static void main(String[] args){
        try{
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "");
            System.out.println("Conexão estabelecida!!");

            String sql1 = "insert into Autor"+"(cod_Autor, nome_Autor, data_Nascimento)"+"values(?,?,?)";
            PreparedStatement stmt1 = conexao.prepareStatement(sql1);
            Date dataNasc = new Date(Calendar.getInstance().getTimeInMillis());
            stmt1.setInt(1, 5561);
            stmt1.setString(2, "George Orwell");
            stmt1.setDate(3, dataNasc);
            stmt1.execute();
            String sql = "insert into Livros"+"(cod_Livro, nome_Livro, nome_Autor, preco, cod_Autor, data_Publicacao)"+"values(?,?,?,?,?,?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            Date dataPublic = new Date(Calendar.getInstance().getTimeInMillis());
            stmt.setInt(1, 2250);
            stmt.setString(2, "1984");
            stmt.setString(3, "George Orwell");
            stmt.setDouble(4, 50.00);
            stmt.setInt(5, 5561);
            stmt.setDate(6, dataPublic);
            stmt.execute();

        }
        catch(Exception e){
            System.out.println("Conexão não foi bem sucedida. Erro: "+e);
        }
    }
}


