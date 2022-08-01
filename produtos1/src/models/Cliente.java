package models;

public class Cliente extends Usuario{
    public Cliente(String nome) {
        super(nome, TipoUsuario.CLIENTE);
    }
}
