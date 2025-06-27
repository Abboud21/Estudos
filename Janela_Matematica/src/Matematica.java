
public class Matematica {
    
     public double soma(double a, double b){
        return a+b;
    }
    
     public double media(double a,double b,double c){
        return((a+b+c)/3);
     }
     
   
    
    public String par(int a){
      String par;  
        par = (Math.floorMod(a,2)==0)? "Par":"Impar";
        return par;
    }
    
     public double delta(double a,double b,double c){
       double dl; 
       dl = Math.pow(b,2)-4*a*c;   
       return dl;     
    }
    
    public double bhascaraX1(double a,double b,double c){
      
        double x1;
        Matematica mat = new Matematica();
        
        double dl = mat.delta(a, b, c);
        
        x1 = (-b+Math.sqrt(dl))/(2*a);
        
        
        return x1;
        
    }
    public double bhascaraX2(double a,double b,double c){
      
        double x2;
        Matematica mat = new Matematica();
        
        double dl = mat.delta(a, b, c);
        x2 = (-b-Math.sqrt(dl))/(2*a);
        
        return x2;
        
    }
    
    
}
