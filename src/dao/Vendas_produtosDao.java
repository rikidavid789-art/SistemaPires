package dao;

import bean.Vendas_produtos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistemapires.Conexao;

public class Vendas_produtosDao {

    public void salvar(Vendas_produtos vp) {
        String sql = "INSERT INTO vendas_produtos (fk_venda, fk_produto, quantidade, valor_unitario) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
            
            pst.setInt(1, vp.getFk_venda());
            pst.setInt(2, vp.getFk_produto());
            pst.setInt(3, vp.getQuantidade());
            pst.setDouble(4, vp.getValor_unitario());

            pst.executeUpdate();
            System.out.println("Item da venda inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir item da venda: " + ex.getMessage());
        }
    }
}