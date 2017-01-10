/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.jpa.sessions;

import com.empresa.jpa.entities.Departamentos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson
 */
@Stateless
public class DepartamentosFacade extends AbstractFacade<Departamentos> {
    @PersistenceContext(unitName = "com.mycompany_empresa_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DepartamentosFacade() {
        super(Departamentos.class);
    }
    
     public List<Departamentos> findByNombreDepartamento(String nombreDepartamento) {
        return getEntityManager().createNamedQuery("Departamentos.findByNombreDepartamento")
                .setParameter("nombreDepartamento", nombreDepartamento + "%")
                .getResultList();
    }
    
}
