package com.example.pw_autorizacion_u4_lo.Repository;

import com.example.pw_autorizacion_u4_lo.Repository.modelo.Usuario;

public interface IUsuarioRepository {
    
    public Usuario consultarPorUserName(String username);
}
