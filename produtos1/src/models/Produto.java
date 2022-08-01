package models;

import java.util.Date;

public class Produto {
    private int id;
    private String descricao;
    private double preco;
    private Date dataValidade;

    public Produto(int id, String descricao, double preco, Date dataValidade) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public int getId() {
        return id;
    }

    public String getDescriciao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public Date getDataValidade() {
        return dataValidade;
    }
}