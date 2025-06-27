
package aula4;
import java.util.Scanner;
public class Matematica {
    
    /*double a,b;
    
    public void soma(double a,double b){
        
        System.out.println("A soma e:"+(a+b));
        
        
    } 
    
    public int soma(int a,int b){
        
        return a+b;
        
    }*/
    
    
    public  double delta(double a,double b,double c){
        
        return (b*b)-(4*a*c);
        
    }
    
    public  double bhaskara1(double a1,double b1,double c1,double d1){
        
        return (-b1+Math.sqrt(d1))/(2*a1);    
    
}
public  double bhaskara2(double a,double b,double c,double d){
        
        return (-b-Math.sqrt(d))/(2*a); 
}

//public String parImpar(int a){
    //return Math.froorMod(a,2)==0?"Par":"Ipar";
//}
}