package com.example.pw_autorizacion_u4_lo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pw_autorizacion_u4_lo.security.JwtUtils;
import com.example.pw_autorizacion_u4_lo.service.to.UsuarioTO;

@RestController
@RequestMapping("/tokens")
@CrossOrigin
public class TokenControllerRestful {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtils;

    @GetMapping("/obtener")
    public String obtenerTokenPorUsuario(@RequestBody UsuarioTO username) {
        this.authenticated(username.getUsername(), username.getPassword());
        return jwtUtils.generateJWTToken(username.getUsername());
    }

    private void authenticated(String usuario, String password) {
        Authentication authentication = this.authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(usuario, password));
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }


}
