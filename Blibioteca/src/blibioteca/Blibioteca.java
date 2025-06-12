
package blibioteca;

import java.util.List;
import java.util.ArrayList;
import java.sql.SQLException;

public class Blibioteca {

    public static void main(String[] args) throws SQLException {
       
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        /*Usuario usuario1 = new Usuario(0,"klaudia","klaudia.com","61-8888","mentira");
        Usuario usuario2 = new Usuario(0,"Irinel","Irinel.com","61-8888","verdade");
        Usuario usuario3 = new Usuario(0,"Carlos","Carlos.com","61-8888","verdade");
        Usuario usuario4 = new Usuario(0,"julha","julha.com","61-8888","mentira");
        Usuario usuario5 = new Usuario(0,"Paulo","Paulo.com","61-8888","mentira");
        
        
        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
        listaUsuarios.add(usuario3);
        listaUsuarios.add(usuario4);
        listaUsuarios.add(usuario5);
        
        
        
        for (Usuario l : listaUsuarios) {
             usuarioDAO.criaUsuario(l);
             }*/
        
       
        
    }
    
}
