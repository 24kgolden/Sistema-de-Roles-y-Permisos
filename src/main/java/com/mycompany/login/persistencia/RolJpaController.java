/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Rol;
import java.io.Serializable;
import jakarta.persistence.Query;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import com.mycompany.login.logica.User;
import com.mycompany.login.persistencia.exceptions.NonexistentEntityException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edwar
 */
public class RolJpaController implements Serializable {

    public RolJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public  RolJpaController(){
        emf = Persistence.createEntityManagerFactory("loginPU");
    }

    public void create(Rol rol) {
        if (rol.getManyUser() == null) {
            rol.setManyUser(new ArrayList<User>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<User> attachedManyUser = new ArrayList<User>();
            for (User manyUserUserToAttach : rol.getManyUser()) {
                manyUserUserToAttach = em.getReference(manyUserUserToAttach.getClass(), manyUserUserToAttach.getId());
                attachedManyUser.add(manyUserUserToAttach);
            }
            rol.setManyUser(attachedManyUser);
            em.persist(rol);
            for (User manyUserUser : rol.getManyUser()) {
                Rol oldOneRolOfManyUserUser = manyUserUser.getOneRol();
                manyUserUser.setOneRol(rol);
                manyUserUser = em.merge(manyUserUser);
                if (oldOneRolOfManyUserUser != null) {
                    oldOneRolOfManyUserUser.getManyUser().remove(manyUserUser);
                    oldOneRolOfManyUserUser = em.merge(oldOneRolOfManyUserUser);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Rol rol) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Rol persistentRol = em.find(Rol.class, rol.getId());
            List<User> manyUserOld = persistentRol.getManyUser();
            List<User> manyUserNew = rol.getManyUser();
            List<User> attachedManyUserNew = new ArrayList<User>();
            for (User manyUserNewUserToAttach : manyUserNew) {
                manyUserNewUserToAttach = em.getReference(manyUserNewUserToAttach.getClass(), manyUserNewUserToAttach.getId());
                attachedManyUserNew.add(manyUserNewUserToAttach);
            }
            manyUserNew = attachedManyUserNew;
            rol.setManyUser(manyUserNew);
            rol = em.merge(rol);
            for (User manyUserOldUser : manyUserOld) {
                if (!manyUserNew.contains(manyUserOldUser)) {
                    manyUserOldUser.setOneRol(null);
                    manyUserOldUser = em.merge(manyUserOldUser);
                }
            }
            for (User manyUserNewUser : manyUserNew) {
                if (!manyUserOld.contains(manyUserNewUser)) {
                    Rol oldOneRolOfManyUserNewUser = manyUserNewUser.getOneRol();
                    manyUserNewUser.setOneRol(rol);
                    manyUserNewUser = em.merge(manyUserNewUser);
                    if (oldOneRolOfManyUserNewUser != null && !oldOneRolOfManyUserNewUser.equals(rol)) {
                        oldOneRolOfManyUserNewUser.getManyUser().remove(manyUserNewUser);
                        oldOneRolOfManyUserNewUser = em.merge(oldOneRolOfManyUserNewUser);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = rol.getId();
                if (findRol(id) == null) {
                    throw new NonexistentEntityException("The rol with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Rol rol;
            try {
                rol = em.getReference(Rol.class, id);
                rol.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The rol with id " + id + " no longer exists.", enfe);
            }
            List<User> manyUser = rol.getManyUser();
            for (User manyUserUser : manyUser) {
                manyUserUser.setOneRol(null);
                manyUserUser = em.merge(manyUserUser);
            }
            em.remove(rol);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Rol> findRolEntities() {
        return findRolEntities(true, -1, -1);
    }

    public List<Rol> findRolEntities(int maxResults, int firstResult) {
        return findRolEntities(false, maxResults, firstResult);
    }

    private List<Rol> findRolEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Rol.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Rol findRol(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Rol.class, id);
        } finally {
            em.close();
        }
    }

    public int getRolCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Rol> rt = cq.from(Rol.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
