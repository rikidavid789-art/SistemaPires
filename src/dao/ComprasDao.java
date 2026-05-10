package dao;

import bean.Compras;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistemapires.Conexao;

public class ComprasDao {
    public void salvar(Compras c) {
        String sql = "INSERT INTO compras (data, valor) VALUES (?, ?)";
        try {
            PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
            pst.setString(1, c.getData());
            pst.setDouble(2, c.getValor());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Compra gravada!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}