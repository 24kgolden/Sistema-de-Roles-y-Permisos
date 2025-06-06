package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Rol;
import com.mycompany.login.logica.User;
import com.mycompany.login.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    UserJpaController userJPA = new UserJpaController();
    RolJpaController rollJPA = new RolJpaController();

    public List<User> traerUser() {
        List<User> listaUser = userJPA.findUserEntities();
        return listaUser;
    }

    public List<Rol> traerRoles() {
       /*List<Rol> listaRol = rollJPA.findRolEntities();
       return listaRol;*/
       
       return  rollJPA.findRolEntities();
    }

    public void crearUser(User usu) {
        userJPA.create(usu);
    }

    public void borrarUser(int id_user) {
        try {
            userJPA.destroy(id_user);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User traerUser(int id_user) {
        return userJPA.findUser(id_user);
    }
}
