package com.example.pw_autorizacion_u4_lo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pw_autorizacion_u4_lo.service.to.UsuarioTO;

@RestController
@RequestMapping("/tokens")
@CrossOrigin
public class TokenControllerRestful {

//    @Autowired
    // private IUsuarioRepository usuarioRepository;

    @GetMapping("/obtener")
    public String obtenerTokenPorUsuario(@RequestBody UsuarioTO username){
        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    }

    // private UsuarioTO convertir(Usuario usuario){
    //     UsuarioTO usuTO = new UsuarioTO();
    //     usuTO.setUsername(usuario.getUsername());
    //     usuTO.setPassword(usuario.getPassword());
    //     return usuTO;
    // }
    
}
