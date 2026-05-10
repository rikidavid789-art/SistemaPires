package bean;

public class Vendas_produtos {
    private int fk_venda;
    private int fk_produto;
    private int quantidade;
    private double valor_unitario;

    // Métodos que o DAO precisa para funcionar:
    public int getFk_venda() { return fk_venda; }
    public void setFk_venda(int fk_venda) { this.fk_venda = fk_venda; }

    public int getFk_produto() { return fk_produto; }
    public void setFk_produto(int fk_produto) { this.fk_produto = fk_produto; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getValor_unitario() { return valor_unitario; }
    public void setValor_unitario(double valor_unitario) { this.valor_unitario = valor_unitario; }
}