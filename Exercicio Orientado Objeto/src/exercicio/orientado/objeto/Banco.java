package exercicio.orientado.objeto;

public class Banco {
    
    double banco_Corrente;

    public String numero_da_Cota;
    protected String tipo;
    private int numero_da_Conta;
    private double saldo;
    private boolean statos;

    public Banco(double banco_Corrente, String numero_da_Cota, String tipo, int numero_da_Conta, double saldo, boolean statos) {
        this.banco_Corrente = banco_Corrente;
        this.numero_da_Cota = numero_da_Cota;
        this.tipo = tipo;
        this.numero_da_Conta = numero_da_Conta;
        this.saldo = saldo;
        this.statos = statos;
    }

    public double getBanco_Corrente() {
        return banco_Corrente;
    }

    public void setBanco_Corrente(double banco_Corrente) {
        this.banco_Corrente = banco_Corrente;
    }

    public String getNumero_da_Cota() {
        return numero_da_Cota;
    }

    public void setNumero_da_Cota(String numero_da_Cota) {
        this.numero_da_Cota = numero_da_Cota;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero_da_Conta() {
        return numero_da_Conta;
    }

    public void setNumero_da_Conta(int numero_da_Conta) {
        this.numero_da_Conta = numero_da_Conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatos() {
        return statos;
    }

    public void setStatos(boolean statos) {
        this.statos = statos;
    }

    @Override
    public String toString() {
        return "Banco{" + "banco=" + banco_Corrente + ", Numero da Cota=" + numero_da_Cota + ", Saldo=" + saldo + ", Statos=" + statos + '}';
    }

   


    

    

    

    
    
    
    
    
    
}
