
package blibioteca;

import java.util.List;
import java.util.ArrayList;
import java.sql.SQLException;

public class Blibioteca {

    public static void main(String[] args) {
        Usuario usuario;
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        int idBuscado = 6;

        try {
            usuario = usuarioDAO.buscarUsuarioPorId(idBuscado);

            if (usuario != null) {
                System.out.println("Encontrei");
                System.out.println("ID: " + usuario.getId());
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("Email: " + usuario.getEmail());
                System.out.println("Telefone: " + usuario.getTelefone());
                System.out.println("Tipo: " + usuario.getTipo_usuario());
                System.out.println("----------------------------------");
            } else {
                System.out.println("Usuário com ID " + idBuscado + " não encontrado.");
            }

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
