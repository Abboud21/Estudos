
package blibioteca;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private Connection connection;

    public UsuarioDAO() {
        this.connection = new ConectionFactury().conectaBD();
    }
   
    public void criaUsuario(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO usuarios (nome,email,telefone," //pode ou não ter corte de linha(opcional)
                + "tipo_usuario) VALUES(?,?,?,?) ";
        
        PreparedStatement pstm = null;
        try{
            pstm = connection.prepareStatement(sql);
            pstm.setString(1,usuario.getNome());
            pstm.setString(2,usuario.getEmail());
            pstm.setString(3,usuario.getTelefone());
            pstm.setString(4,usuario.getTipo_usuario());
            
            pstm.executeUpdate();
            System.out.println("Deu Certo");    
        }
        catch(SQLException e){
            System.out.println("Deu Ruim"+ e.getMessage());
        }
        finally{
            if(pstm != null)pstm.close();
        }
    }
    
    public List <Usuario> listarUsuario() throws SQLException{
          List <Usuario> lista = new ArrayList<>();
          String sql = "SELECT * FROM usuarios";
          
          PreparedStatement pstm = null;
          ResultSet rs = null;
          
          try{
              pstm = connection.prepareStatement(sql);
              rs = pstm.executeQuery();
              while (rs.next()){
                  Usuario usuario = new Usuario();
                  usuario.setId(rs.getInt("id"));
                  usuario.setNome(rs.getString("nome"));
                  usuario.setEmail(rs.getString("email"));
                  usuario.setTelefone(rs.getString("telefone"));
                  usuario.setTipo_usuario(rs.getString("tipo_usuario"));
                  
                  lista.add(usuario);  
              }
          }
          catch(SQLException e){
              System.out.println("Erro ao listar usuarios: "+ e.getMessage());
          }finally{
              if(rs != null) rs.close();
              if(pstm != null) pstm.close();
          }
          return lista;
          
      }
    
    public Usuario buscarUsuarioPorId(int id)throws SQLException{
        
        String sql = "SELECT * FROM usuarios WHERE id=? ";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Usuario usuario =  null;
        
        try{
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            
            if(rs.next()){
                  usuario = new Usuario();
                  usuario.setId(rs.getInt("id"));
                  usuario.setNome(rs.getString("nome"));
                  usuario.setEmail(rs.getString("email"));
                  usuario.setTelefone(rs.getString("telefone"));
                  usuario.setTipo_usuario(rs.getString("tipo_usuario"));
            }
            
        }catch(SQLException e){
              System.out.println("Erro ao listar usuarios: "+ e.getMessage());
          }finally{
              if(rs != null) rs.close();
              if(pstm != null) pstm.close();
          }
          return usuario;
    }
    
    
    
    
    
    
    
    
}
