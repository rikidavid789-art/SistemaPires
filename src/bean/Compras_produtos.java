package bean;

public class Compras_produtos {
    private int fk_compra;
    private int fk_produto;
    private int quantidade;
    private double valor_unitario;

    public Compras_produtos() {}

    public int getFk_compra() { return fk_compra; }
    public void setFk_compra(int fk_compra) { this.fk_compra = fk_compra; }

    public int getFk_produto() { return fk_produto; }
    public void setFk_produto(int fk_produto) { this.fk_produto = fk_produto; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getValor_unitario() { return valor_unitario; }
    public void setValor_unitario(double valor_unitario) { this.valor_unitario = valor_unitario; }
}