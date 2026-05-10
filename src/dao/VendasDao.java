package dao;

import bean.Vendas;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sistemapires.Conexao; 

public class VendasDao {
    public void salvar(Vendas venda) {
        String sql = "INSERT INTO vendas (data, valorTotal) VALUES (?, ?)";
        try {
            PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
            pst.setString(1, venda.getData());
            pst.setDouble(2, venda.getValorTotal());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }
}