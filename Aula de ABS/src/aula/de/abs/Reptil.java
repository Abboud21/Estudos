
package aula.de.abs;

public class Reptil extends Animal{
    
    private String corDaEscama;

    @Override
    public void emitirSom() {
        System.out.println("Soutar bolha");    
    }

    public Reptil(String corDaEscama, double peso, int idade, int menbros) {
        super(peso, idade, menbros);
        this.corDaEscama = corDaEscama;
    }

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

    @Override
    public String toString() {
        return super.toString() + "corDaEscama=" + corDaEscama + '}';
    }
    
}
