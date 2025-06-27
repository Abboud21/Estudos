
package aula.pkg5;

public class matematica {
    
    
    public String calculo(int a){
        return(Math.floorMod(a,2)==0)?"Par":"Impar";
    }
   
    
    public void calculo(double a,double b,double c){
        
        System.out.println("A media e: "+(a+b+c)/2);
        
        double x1,x2,dl;
        
        dl=Math.pow(b,2)-4*a*c;
        System.out.println("O valor de delta e: "+dl);
        
        if(dl<0){
            System.out.println("Nao tem uma raiz real");
        }else{
            x1=(-b+Math.sqrt(dl)/(2*a));
            x2=(-b-Math.sqrt(dl)/(2*a));
            System.out.println("O resultado de x1= "+x1);   
            System.out.println("O resultado de x2= "+x2);
        }
        
    }
  
    
    
}
