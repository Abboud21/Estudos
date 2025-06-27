
package exercicio.frutas;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FrutasDAO {
    
    private Connection connection;
    
    public FrutasDAO() {
        this.connection = new ConnectionFactory().conectaBD();
    }
    
    public void criaFruta(Frutas fruta) throws SQLException{
        String sql = "INSERT INTO frutasB (nome,maturacao,localColhido," //pode ou não ter corte de linha(opcional)
                + "quantidade) VALUES(?,?,?,?) ";
        
     PreparedStatement pstm = null;
     
     try{
            pstm = connection.prepareStatement(sql);
            pstm.setString(1,fruta.getNome());
            pstm.setString(2,fruta.getMaturacao());
            pstm.setString(3,fruta.getLocalColhido());
            pstm.setInt(4,fruta.getQuantidade());
            
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
    
    public List <Frutas> listarFruta() throws SQLException{
          List <Frutas> lista = new ArrayList<>();
          String sql = "SELECT * FROM frutasB";
          
          PreparedStatement pstm = null;
          ResultSet rs = null;
          
          try{
              pstm = connection.prepareStatement(sql);
              rs = pstm.executeQuery();
              while (rs.next()){
                  Frutas fruta = new Frutas();
                  fruta.setId(rs.getInt("id"));
                  fruta.setNome(rs.getString("nome"));
                  fruta.setMaturacao(rs.getString("maturacao"));
                  fruta.setLocalColhido(rs.getString("localColhido"));
                  fruta.setQuantidade(rs.getInt("quantidade"));
                  
                  lista.add(fruta);  
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
    
    public Frutas buscarFrutaPorId(int id)throws SQLException{
        
        String sql = "SELECT * FROM frutaB WHERE id=? ";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Frutas fruta =  null;
        
        try{
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            
            if(rs.next()){
                  fruta = new Frutas();
                  fruta.setId(rs.getInt("id"));
                  fruta.setNome(rs.getString("nome"));
                  fruta.setMaturacao(rs.getString("maturacao"));
                  fruta.setLocalColhido(rs.getString("localColhido"));
                  fruta.setQuantidade(rs.getInt("quantidade"));
            }
            
        }catch(SQLException e){
              System.out.println("Erro ao listar usuarios: "+ e.getMessage());
          }finally{
              if(rs != null) rs.close();
              if(pstm != null) pstm.close();
          }
          return fruta;
    }
    
}
