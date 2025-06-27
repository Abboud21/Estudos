
package blibioteca;

import java.util.List;
import java.util.ArrayList;
import java.sql.SQLException;

public class Blibioteca {

    public static void main(String[] args) throws SQLException {
       
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        Usuario novo = new Usuario(0,"","","","");
        
        usuarioDAO.criaUsuario(novo);
       
        try {
        int idBuscado = 7;
        Usuario usuario = usuarioDAO.buscarUsuarioPorId(idBuscado);
        
        if(usuario != null){
            System.out.println("Encontrei");
            System.out.println("ID "+ usuario.getId());
            System.out.println("Nome "+ usuario.getNome());
            System.out.println("Email "+ usuario.getEmail());
            System.out.println("Telefone "+ usuario.getTelefone());
            System.out.println("Tipo  "+ usuario.getTipo_usuario());
            System.out.println("----------------------------------");
        
        }
        else{
            System.out.println("Usuario com ID "+idBuscado+" nao encontrado");
        }     
        }
          catch (SQLException e){
              System.out.println("Erro "+ e.getMessage());
          }
        
                                           
       
        
        
        
    }
    
}
