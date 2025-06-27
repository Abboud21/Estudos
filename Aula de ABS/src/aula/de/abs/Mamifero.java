
package aula.de.abs;

public class Mamifero extends Animal{
    
    private String corDoPelo;

    public Mamifero(String corDoPelo, double peso, int idade, int menbros) {
        super(peso, idade, menbros);
        this.corDoPelo = corDoPelo;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

   

    @Override
    public void emitirSom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return super.toString() + "corDoPelo=" + corDoPelo + '}';
    }
      
    
    
    
    
}
