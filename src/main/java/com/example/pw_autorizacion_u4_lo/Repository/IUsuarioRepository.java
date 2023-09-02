package com.example.pw_autorizacion_u4_lo.Repository;

import com.example.pw_autorizacion_u4_lo.Repository.modelo.Usuario;

public interface IUsuarioRepository {

    public void insertarUsuario(Usuario usuario);

    public Usuario consultarPorUserName(String username);
}
