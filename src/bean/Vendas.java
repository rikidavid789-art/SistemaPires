package bean;

/**
 * Bean para a tabela vendas 
 */
public class Vendas {
    private int idVendas;
    private String data;
    private double valorTotal;

    // Construtor vazio
    public Vendas() {
    }

    // Getters e Setters
    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}