package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraJPA {

    ControladoraPersistencia controlPersis;

    public ControladoraJPA() {

        controlPersis = new ControladoraPersistencia();
    }

    public User validarUser(String user, String password) {

        //String mesanje = "";
        //boolean verif = false;
        User usr = null;
        List<User> listUser = controlPersis.traerUser();

        for (User user1 : listUser) {

            if (user1.getNameUser().equals(user)) {

                if (user1.getPassword().equals(password)) {

                    //mesanje = "Usuario y contraseña correctos. Bienvenido/a!";
                    //return mesanje;
                    //verif = true;
                    //return verif;
                    usr = user1;
                    return usr;

                } else {

                    //mesanje = "Contraseña incorrecta";
                    //return mesanje;
                    //verif = false;
                    //return verif;
                    usr = null;
                    return usr;
                }
            } else {

                //mesanje = "Usuario no encontrado";
                //return mesanje;
                //verif = false;
                //return verif;
                usr = null;
                return usr;
            }
        }

        //return mesanje;
        //return verif;
        return usr;
    }

    public List<User> traerUser() {
        return controlPersis.traerUser();
    }

    public List<Rol> traerRoles() {

        return controlPersis.traerRoles();

    }

    public void crearUser(String user, String password, String rol) {
        User usu = new User();
        usu.setNameUser(user);
        usu.setPassword(password);

        Rol roll = new Rol();
        roll = this.traerRol(rol);

        if (roll != null) {
            usu.setOneRol(roll);
        }

        int id = this.buscarUltimaId();
        usu.setId(id + 1);

        controlPersis.crearUser(usu);
    }

    private Rol traerRol(String rol) {
        List<Rol> listaRoles = controlPersis.traerRoles();
        for (Rol listaRole : listaRoles) {
            if (listaRole.getNameRol().equals(rol)) {
                return listaRole;
            }
        }

        return null;
    }

    private int buscarUltimaId() {
        List<User> listaUsuarios = this.traerUser();

        User usu = listaUsuarios.get(listaUsuarios.size() - 1);
        return usu.getId();
    }

    public void borrarUser(int id_user) {
        controlPersis.borrarUser(id_user);
    }

    public User traerUser(int id_user) {
        return controlPersis.traerUser(id_user);
    }

    public void editarUser(User usu, String user, String password, String rol) {
        usu.setNameUser(user);
        usu.setPassword(password);

        Rol roll = new Rol();
        roll = this.traerRol(rol);

        if (roll != null) {
            usu.setOneRol(roll);
        }
    }

}
