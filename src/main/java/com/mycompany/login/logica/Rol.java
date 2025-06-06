package com.mycompany.login.logica;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class Rol implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Basic
    private String nameRol;
    private String description;
    
    @OneToMany (mappedBy = "oneRol")
    private List<User> manyUser;

    public Rol() {
    }

//    public Rol(int id, String nameRol, String description) {
//        this.id = id;
//        this.nameRol = nameRol;
//        this.description = description;
//    }

    public Rol(int id, String nameRol, String description, List<User> manyUser) {
        this.id = id;
        this.nameRol = nameRol;
        this.description = description;
        this.manyUser = manyUser;
    }

    public List<User> getManyUser() {
        return manyUser;
    }

    public void setManyUser(List<User> manyUser) {
        this.manyUser = manyUser;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameRol() {
        return nameRol;
    }

    public void setNameRol(String nameRol) {
        this.nameRol = nameRol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
