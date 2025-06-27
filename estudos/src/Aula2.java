
import java.util.Scanner;


public class Aula2 {

  
    public static void main(String[] args) {
        
        Scanner tec =new Scanner(System.in);
        
         System.out.println("Escolha uma opçao: \n1:Bhaskara\n2:Contador\n3:contar(com para)\n4:piramide");
        
        int lista=tec.nextInt();
        System.out.println("\n");
        
        switch(lista){
            
        
        case 1:
        
        System.out.println("Escreva o valor de (a): ");
        double a=tec.nextDouble();
        
        
        if(a==0){
            System.out.println("Não e uma equaçao de 2 grau");  
        }
        else{
         System.out.println("Qual o valor de (b)");
        
         double b=tec.nextDouble();
        
         System.out.println("Qual o valor de (c)");
        
         double c=tec.nextDouble();
        
         double delta,x1,x2;
        
         delta=(b*b)-4*a*c;
                
            if(delta<0){
                System.out.println("Nao existe um raiz real");
            } 
            else{
            x1=(-b+Math.sqrt(delta))/(2*a);
            x2=(-b-Math.sqrt(delta))/(2*a);
            
            System.out.println("O resultado de delta= "+delta);
            System.out.printf("O resultado de x1= %.2f \n", x1);
            System.out.printf("O resultado de x2= %.2f ", x2);
            }
        break;    
            
        }
        
       case 2:
       
           int cont=0;
           System.out.println("escreva ate quanto quer contar: ");
           int ate=tec.nextInt();
           System.out.println("escreva de quanto em quanto quer contar: \n\n");
           int saltar=tec.nextInt();
           
           do{
               cont=cont+saltar;
               System.out.println(cont);
             }
             while(cont<ate);
        break; 
       case 3:
           System.out.println("escreva ate quanto quer contar: ");
           int num2=tec.nextInt();
           for(num2=0;num2<8;num2++){
               System.out.println(num2);}
         break;
         
       case 4:
           //crecente
           for(int as=1;as<=5;as++){
               for(int bs=1;bs<=as;bs++){
                   System.out.print("*");
               }
               System.out.println("");
           
           }
           System.out.println("\n");
           //decrecent
           for(int cs=5;cs>=1;cs--){
               for(int ds=1;ds<=cs;ds++){
                   System.out.print(" "); 
               }for(int es=4;es>=cs;es--){
                   System.out.print("*"); 
               }System.out.println("*");   
           }
           System.out.println("\n");
           
           //piramid com espasso
             for(int a1=5;a1>=1;a1--){
                for(int b1=1;b1<=a1;b1++){
                    System.out.print(" ");
                }for(int c1=5;c1>=a1;c1--){
                 System.out.print("*");
                 
                }System.out.print(" ");
                for(int d1=5;d1>=a1;d1--){
                    System.out.print("*");}
                 System.out.print("  ");
                System.out.println(" "); 
           }
             
             
             int linhas=5;
             
             for (int i = 0; i <= linhas; i++) {
                 String espacos=" ".repeat(linhas-i);
                 String estrelas="*".repeat(i);
                 
                 System.out.println(espacos+estrelas+estrelas);
               
           }
               
           
           
           
           
           break;
           
           
           }
           
         
         
        }  
        
        
    }
    

