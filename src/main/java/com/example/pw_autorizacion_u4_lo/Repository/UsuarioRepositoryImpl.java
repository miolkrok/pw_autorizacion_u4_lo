package com.example.pw_autorizacion_u4_lo.Repository;

import org.springframework.stereotype.Repository;

import com.example.pw_autorizacion_u4_lo.Repository.modelo.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

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
