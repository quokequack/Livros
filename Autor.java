import java.util.Calendar;

public class Autor {
    private int codigo_Autor;
    private String nome_Autor;
    private Calendar data_Nascimento;

    public Autor(int codigoAutor, String nome, Calendar dataNasci){
        this.codigo_Autor = codigoAutor;
        this.nome_Autor = nome;
        this.data_Nascimento = dataNasci;
    }
    
    public int getCodigoAutor(){
        return this.codigo_Autor;
    }
    public String getNomeAutor(){
        return this.nome_Autor;
    }
    public Calendar getDataNascimento(){
        return this.data_Nascimento;
    }

}

