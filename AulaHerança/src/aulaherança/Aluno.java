
package aulaherança;

public class Aluno extends Pessoa{
        
        private String matricula;
        private String cuso;

    public void CancelarMatricula(){
        System.out.println("Cancelar Matricula");
    }

    public Aluno(String matricula, String cuso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.cuso = cuso;
    }

   

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCuso() {
        return cuso;
    }

    public void setCuso(String cuso) {
        this.cuso = cuso;
    }

    @Override
    public String toString() {
        return super.toString() + "matricula=" + matricula + ", cuso=" + cuso + '}';
    }
        
                                                                                                                        
        
    
}
