package com.example.pw_autorizacion_u4_lo.Repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @Column(name = "usua_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "name_generator")
    @SequenceGenerator(name = "name_generator", sequenceName = "usua_id_seq", allocationSize = 1)
    private Integer id;
    @Column(name = "usua_username")
    public String username;
    @Column(name = "usua_password")
    public String password;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
