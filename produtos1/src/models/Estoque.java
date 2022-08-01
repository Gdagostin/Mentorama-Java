package models;

public class Estoque {
    private String id;
    private Produto produto;
    private int quantidade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Estoque(String id, Produto produto, int quantidade) {
        this.id = String.valueOf(id);
        this.produto = produto;
        this.quantidade = quantidade;


    }
}
