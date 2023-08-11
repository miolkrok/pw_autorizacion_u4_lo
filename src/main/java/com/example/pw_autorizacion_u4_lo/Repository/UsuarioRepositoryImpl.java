package com.example.pw_autorizacion_u4_lo.Repository;

import org.springframework.stereotype.Repository;

import com.example.pw_autorizacion_u4_lo.Repository.modelo.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuarioRepositoryImpl implements IUsuarioRepository{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Usuario consultarPorUserName(String username) {
        TypedQuery<Usuario> myQuery = this.entityManager
                .createQuery("SELECT u FROM Usuario u WHERE u.username = :datoUsername", Usuario.class);
        myQuery.setParameter("datoUsername", username);
        return myQuery.getSingleResult();
    }

    

    
}
