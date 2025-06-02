
package aula.pkg1;

//import java.util.Locale;
import java.util.Scanner;

public class Aula1 {

    public static void main(String[] args) {
  
        Scanner tec =new Scanner(System.in);
        System.out.println("Escolha uma opçao \n1:calculadora\n2:Impar ou par\n3:bhaskara");
        
        int lista=tec.nextInt();
        
        switch(lista){
            case 1:
                
                System.out.println("Escolha o primeiro numero");
                double n1=tec.nextInt();
                System.out.println("Escolha o segundo numero");
                double n2=tec.nextInt();
                
                System.out.println("Escolha a operaçao entre \n(+) Adiçao,\n(-) Subitraçao,\n(*) Multiplicaçao,\n(/) Divisao");
                char operador=tec.next().charAt(0);
                
                if(operador=='+'){
                    System.out.println(n1+n2);
                }else if(operador=='-'){
                        System.out.println(n1-n2);
                        }else if(operador=='*'){
                            System.out.println(n1*n2);
                        }else if(operador=='/'){
                            System.out.println(n1/n2);
                        }
            break;
            case 2:   
              
                System.out.println("Escolha o primeiro numero");
                int num1=tec.nextInt();
                
                if(num1!=0){
                    System.out.println("Par");
        }else{
                    System.out.println("Impar"); 
                }
                break;
                
            case 3:  
         
       
        System.out.println("Qual o valor de (a)");
        
        double a=tec.nextDouble();
       
      System.out.println("Qual o valor de (b)");
        
        double b=tec.nextDouble();
        
       System.out.println("Qual o valor de (c)");
        
        double c=tec.nextDouble();
       
        double q;
                
                q=b*b-4*a*c;
       
        double x1,x2;
        
        x1=(-b+q)/2;
        x2=(-b-q)/2;
        
        System.out.println(x1);
        System.out.println(x2);     
        }
        
       
       
       
       
       
       
      
        
        
    }    
        
        
        
    
}
