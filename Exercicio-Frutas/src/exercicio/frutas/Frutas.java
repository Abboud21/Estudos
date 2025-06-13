
package exercicio.frutas;

public class Frutas {
    
    private int id;
    private int quantidade;
    private String nome;
    private String maturacao;
    private String localColhido;

    public Frutas(int id, int quantidade, String nome, String maturacao, String localColhido) {
        this.id = id;
        this.quantidade = quantidade;
        this.nome = nome;
        this.maturacao = maturacao;
        this.localColhido = localColhido;
    }

        

    public Frutas() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMaturacao() {
        return maturacao;
    }

    public void setMaturacao(String maturacao) {
        this.maturacao = maturacao;
    }

    public String getLocalColhido() {
        return localColhido;
    }

    public void setLocalColhido(String localColhido) {
        this.localColhido = localColhido;
    } 
    
    
}
