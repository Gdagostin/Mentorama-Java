package db;

import models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuariosDB {
    private List<Usuario> usuarioList =  new ArrayList<>();

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public Usuario getUsuarioPorID(int id) {
        return usuarioList.stream()
                .filter((usuario -> usuario.getId() == id))
                .findFirst()
                .get();
    }

    public void addNovoUsuario(Usuario usuario) {
        int id = usuarioList.size() + 1;
        usuario.setId(id);
        usuarioList.add(usuario);
    }
}
