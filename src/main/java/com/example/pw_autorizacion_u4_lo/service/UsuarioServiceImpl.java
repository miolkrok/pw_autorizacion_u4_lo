package com.example.pw_autorizacion_u4_lo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.pw_autorizacion_u4_lo.Repository.IUsuarioRepository;
import com.example.pw_autorizacion_u4_lo.Repository.modelo.Usuario;

import static java.util.Collections.emptyList;
@Service
public class UsuarioServiceImpl implements UserDetailsService {

    @Autowired
    private IUsuarioRepository usuarioRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = this.usuarioRepo.consultarPorUserName(username);

        return new User(usuario.getUsername(), usuario.getPassword(), emptyList());
    }

}
