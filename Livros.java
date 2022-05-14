import java.sql.PreparedStatement;
import java.util.Calendar;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Livros {
    private int cod_livro;
    private String nome_Livro;
    private String nome_Autor;
    private double preco;
    private int cod_Autor;
    private Calendar data_Publicacao;
    
    public Livros(int codigoLivro, String nomeLivro, String nomeAutor, double preco, int codigoAutor){
        this.cod_livro = codigoLivro;
        this.nome_Livro = nomeLivro;
        this.nome_Autor = nomeAutor;
        this.preco = preco;
        this.cod_Autor = codigoAutor;
    }
    public int getCodigoLivro(){
        return this.cod_livro;
    }
    public String getNomeLivro(){
        return this.nome_Livro;
    }
    public String getNomeAutor(){
        return this.nome_Autor;
    }
    public double getPreco(){
        return this.preco;
    }
    public int getCodigoAutor(){
        return this.cod_Autor;
    }
    public Calendar getDataPublicacao(){
        return this.data_Publicacao;
    }
}