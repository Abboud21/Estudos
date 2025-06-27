
package blibioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactury {

    public Connection conectaBD() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/cadastro?useSSL=false";
            String user = "root";
            String password = ""; 

            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }

        return conn;
    }
}
