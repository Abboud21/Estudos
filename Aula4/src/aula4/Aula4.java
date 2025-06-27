
package aula4;
import java.util.Scanner;

public class Aula4 {

    public static void main(String[] args) {
       
       /* Pessoa p1=new Pessoa("Irineu",22,1.55);
       
        p1.setNome("Leila");
        
        //System.out.println(p1.getIdade());
        System.out.println(p1.toString());     
        
       
       
       Matematica mat1 =new Matematica();
       mat1.soma(5,9);
       
       int c=mat1.soma(6,8);
       
        System.out.println(mat1.soma(8,8));
       */
      
      
       Scanner tec =new Scanner(System.in);
         Matematica mat1 =new Matematica();
         
         double a,b,c;
         System.out.println("Ecreva o valor de (a)");
         a=tec.nextDouble();
         System.out.println("Ecreva o valor de (b)");
         b=tec.nextDouble();
         System.out.println("Ecreva o valor de (c)");
         c=tec.nextDouble();
         
         
        double dl=mat1.delta(a,b,c);
         
        
        
        if(dl<0){
            System.out.println("Não tem uma raiz real");
        }else{
        double x1=mat1.bhaskara1(a,b,c,dl);
        double x2=mat1.bhaskara2(a,b,c,dl);
                
        System.out.println("O valor de delta= "+dl);
        System.out.println("O valor de x1= "+x1);
        System.out.println("O valor de x2= "+x2);
        }
    }
    
}
