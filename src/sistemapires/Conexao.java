package sistemapires;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static Connection conn = null;

    public static Connection getConexao() {
        try {
            if (conn == null || conn.isClosed()) {
            String url = "jdbc:mysql://localhost:3306/sistemapires";
            String user = "root";
            String password = ""; 
                conn = DriverManager.getConnection(url, user, password);
              }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar no banco: " + e.getMessage());
        }
        return conn;    
    }
}