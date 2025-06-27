
package aulaherança;

public class AulaHerança {

    public static void main(String[] args) {
        
       Aluno al1=new Aluno("55555","TI","Jubileu",22,"Masculino");
       Funcionario fu1=new Funcionario("Caixa",true,"Paulo",33,"Masculino"); 
       Professor  pr1=new Professor("Matematica",1600,"Luiz",44,"Masculino");
        
       
     al1.fazerAniversario();
       System.out.println(fu1.toString()); 
       System.out.println(pr1.toString());
       System.out.println(al1.toString());
        
    }
    
}
