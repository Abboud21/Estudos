package aula_objeto;

public class Caneta {
    
   private String marca;
   private String modelo;
   private float ponta;
   private String cor;
   private int carga;

    public Caneta(String marca, String modelo, float ponta, String cor, int carga) {
        this.marca = marca;
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.carga = carga;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Caneta{" + "marca=" + marca + ", modepo=" + modelo + ", ponta=" + ponta + ", cor=" + cor + ", carga=" + carga + '}';
    }
    
    
    
    
}
