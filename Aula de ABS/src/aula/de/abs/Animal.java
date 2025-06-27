
package aula.de.abs;

abstract class Animal {
    
    private double peso;
    private int idade;
    private int menbros;
    
    
    public abstract void emitirSom();

    public Animal(double peso, int idade, int menbros) {
        this.peso = peso;
        this.idade = idade;
        this.menbros = menbros;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMenbros() {
        return menbros;
    }

    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }

   

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", idade=" + idade + ", menbros=" + menbros + '}';
    }
    
    
    
    
}
