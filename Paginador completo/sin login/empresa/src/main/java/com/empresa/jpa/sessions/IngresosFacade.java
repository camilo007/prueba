/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.jpa.sessions;

import com.empresa.jpa.entities.Ciudades;
import com.empresa.jpa.entities.Ingresos;
import static com.empresa.jpa.entities.Ingresos_.idCiudad;
import static com.empresa.jpa.entities.Ingresos_.idIngreso;
import java.util.Date;


import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson
 */
@Stateless
public class IngresosFacade extends AbstractFacade<Ingresos> {
    @PersistenceContext(unitName = "com.mycompany_empresa_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public IngresosFacade() {
        super(Ingresos.class);
    }
    
      public List<Ciudades> findByOrden(String nombreCiudad) {
        return getEntityManager().createNativeQuery("SELECT * FROM ciudades ORDER BY nombre_ciudad ASC ="+idCiudad,Ciudades.class).getResultList();
        
    }
      
     
      
    
    
}
