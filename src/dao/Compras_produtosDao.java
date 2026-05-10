package dao;

import bean.Compras_produtos; 
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistemapires.Conexao; 

public class Compras_produtosDao {

    public void salvar(Compras_produtos cp) {
        
        String sql = "INSERT INTO compras_produtos (fk_compra, fk_produto, quantidade, valor_unitario) VALUES (?, ?, ?, ?)";

        try {
            
            PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
            
            pst.setInt(1, cp.getFk_compra());
            pst.setInt(2, cp.getFk_produto());
            pst.setInt(3, cp.getQuantidade());
            pst.setDouble(4, cp.getValor_unitario());

            pst.executeUpdate();
            System.out.println("Item de compra salvo com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar item de compra: " + ex.getMessage());
        }
    }
}