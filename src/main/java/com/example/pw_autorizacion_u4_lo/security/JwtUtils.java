package com.example.pw_autorizacion_u4_lo.security;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtils {

    private static final Logger LOG = LoggerFactory.getLogger(JwtUtils.class);

    @Value("${app.jwt.secret}")

    private String jwtSecret;

    @Value("${app.jwt.expiration.ms}")

    private Integer jwtExpiration;

    public String generateJWTToken(String username) {

        LOG.info("Semilla: " + jwtSecret + " Tiempo: " + jwtExpiration);

        return Jwts.builder().setSubject(username).setIssuedAt(new Date())

                .setExpiration(new Date(System.currentTimeMillis() + this.jwtExpiration))

                .signWith(SignatureAlgorithm.HS512, this.jwtSecret).compact();

    }

}
