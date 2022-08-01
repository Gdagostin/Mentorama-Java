package models;

public class PedidoVenda {
    private int id;
    private Cliente cliente;
    private Estoque estoque;
    private int quantidade;

    public PedidoVenda(Cliente cliente, Estoque estoque, int quantidade) {
        this.cliente = cliente;
        this.estoque = estoque;
        this.quantidade = quantidade;
    }
    //public double getValorTotal() {
        //return quantidade * estoque.getPreco();
    //}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
