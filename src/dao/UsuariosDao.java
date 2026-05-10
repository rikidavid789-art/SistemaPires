package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sistemapires.Conexao;

public class UsuariosDao {
    
    public boolean autenticar(String usuario, String senha) {
        try {
           
            Connection conn = new Conexao().getConexao();
            
           
            String sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, senha);
            
            ResultSet rs = ps.executeQuery();
            
          
            return rs.next();
            
        } catch (Exception e) {
            System.out.println("Erro ao autenticar: " + e.getMessage());
            return false;
        }
    }
}