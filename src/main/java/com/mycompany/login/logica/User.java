package com.mycompany.login.logica;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String nameUser;
    private String password;
    
    @ManyToOne
    @JoinColumn(name = "fk_roll")
    private Rol oneRol;

    public User() {
    }

//    public User(int id, String nameUser, String password) {
//        this.id = id;
//        this.nameUser = nameUser;
//        this.password = password;
//    }

    public User(int id, String nameUser, String password, Rol oneRol) {
        this.id = id;
        this.nameUser = nameUser;
        this.password = password;
        this.oneRol = oneRol;
    }

    public Rol getOneRol() {
        return oneRol;
    }

    public void setOneRol(Rol oneRol) {
        this.oneRol = oneRol;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
