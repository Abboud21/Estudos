
package exercicio.frutas;

import java.util.List;
import java.util.ArrayList;
import java.sql.SQLException;

public class ExercicioFrutas {

    public static void main(String[] args) {
        
        FrutasDAO frutasDAO = new FrutasDAO();
        ArrayList<Frutas> listaFrutas = new ArrayList<>();
        
       
        
        
        
        
        
        
        
        
        
        
        
        try {
         
        List<Frutas> frutas = frutasDAO.listarFruta();
        if(frutas.isEmpty()){
            System.out.println("Ninguem Cadastrado");
        }else{
           for(Frutas fruta:frutas){
            System.out.println("ID "+ fruta.getId());
            System.out.println("Nome "+ fruta.getNome());
            System.out.println("Email "+ fruta.getMaturacao());
            System.out.println("Telefone "+ fruta.getLocalColhido());
            System.out.println("Tipo  "+ fruta.getQuantidade());
            System.out.println("----------------------------------");
        }
        }
            
        }
          catch (SQLException e){
              System.out.println("Erro "+ e.getMessage());
          }
        
    }
    
}
