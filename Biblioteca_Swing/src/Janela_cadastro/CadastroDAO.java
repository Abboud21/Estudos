package Janela_cadastro;



import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CadastroDAO {
    
     private Connection connection;
    
    public CadastroDAO() {
        this.connection = new ConnectionFactory().conectaBD();
    }
    
    public void criaPessoa(Cadastro pessoa) throws SQLException{
        String sql = "INSERT INTO cadastro (nome,email,telefone," //pode ou não ter corte de linha(opcional)
                + "tipo) VALUES(?,?,?,?) ";
        
     PreparedStatement pstm = null;
     
     try{
            pstm = connection.prepareStatement(sql);
            pstm.setString(1,pessoa.getNome());
            pstm.setString(2,pessoa.getEmail());
            pstm.setString(3,pessoa.getTelefone());
            pstm.setString(4,pessoa.getTipo());
            
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
    
    public List <Cadastro> listarPessoa() throws SQLException{
          List <Cadastro> lista = new ArrayList<>();
          String sql = "SELECT * FROM cadastro";
          
          PreparedStatement pstm = null;
          ResultSet rs = null;
          
          try{
              pstm = connection.prepareStatement(sql);
              rs = pstm.executeQuery();
              while (rs.next()){
                  Cadastro pessoa = new Cadastro();
                  pessoa.setId(rs.getInt("id"));
                  pessoa.setNome(rs.getString("nome"));
                  pessoa.setEmail(rs.getString("email"));
                  pessoa.setTelefone(rs.getString("telefone"));
                  pessoa.setTipo(rs.getString("tipo"));
                  
                  lista.add(pessoa);  
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
    
    public Cadastro buscarPessoaPorId(int id)throws SQLException{
        
        String sql = "SELECT * FROM cadastro WHERE id=? ";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Cadastro pessoa =  null;
        
        try{
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            
            if(rs.next()){
                  pessoa = new Cadastro();
                  pessoa.setId(rs.getInt("id"));
                  pessoa.setNome(rs.getString("nome"));
                  pessoa.setEmail(rs.getString("email"));
                  pessoa.setTelefone(rs.getString("telefone"));
                  pessoa.setTipo(rs.getString("tipo"));
            }
            
        }catch(SQLException e){
              System.out.println("Erro ao listar usuarios: "+ e.getMessage());
          }finally{
              if(rs != null) rs.close();
              if(pstm != null) pstm.close();
          }
          return pessoa;
    }
    public void alterarPessoa(Cadastro pessoa) throws SQLException {
    String sql = "UPDATE cadastro SET nome=?, email=?, telefone=?, tipo=? WHERE id=?";
    PreparedStatement pstm = null;

    try {
        pstm = connection.prepareStatement(sql);
        pstm.setString(1, pessoa.getNome());
        pstm.setString(2, pessoa.getEmail());
        pstm.setString(3, pessoa.getTelefone());
        pstm.setString(4, pessoa.getTipo());
        pstm.setInt(5, pessoa.getId());

        pstm.executeUpdate();
        System.out.println("Registro alterado com sucesso!");
    } catch (SQLException e) {
        System.out.println("Erro ao alterar registro: " + e.getMessage());
        throw e;
    } finally {
        if (pstm != null) pstm.close();
    }
}

public void deletarPessoa(int id) throws SQLException {
    String sql = "DELETE FROM cadastro WHERE id=?";
    PreparedStatement pstm = null;

    try {
        pstm = connection.prepareStatement(sql);
        pstm.setInt(1, id);

        pstm.executeUpdate();
        System.out.println("Registro deletado com sucesso!");
    } catch (SQLException e) {
        System.out.println("Erro ao deletar registro: " + e.getMessage());
        throw e;
    } finally {
        if (pstm != null) pstm.close();
    }
}
    
}
