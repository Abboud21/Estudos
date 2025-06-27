
package aula4;

public class Pessoa {
    
    private String Nome;
    private int Idade;
    private double Altura;

    public Pessoa(String Nome, int Idade, double Altura) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Altura = Altura;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Nome=" + Nome + ", Idade=" + Idade + ", Altura=" + Altura + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
