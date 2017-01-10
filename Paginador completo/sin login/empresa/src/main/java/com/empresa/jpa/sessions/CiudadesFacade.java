/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.jpa.sessions;

import com.empresa.jpa.entities.Ciudades;
import static com.empresa.jpa.entities.Ingresos_.idCiudad;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jefferson
 */
@Stateless
public class CiudadesFacade extends AbstractFacade<Ciudades> {
    @PersistenceContext(unitName = "com.mycompany_empresa_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CiudadesFacade() {
        super(Ciudades.class);
    }
        public List<Ciudades> findByNombreCiudad(String nombreCiudad) {
        return getEntityManager().createNamedQuery("Ciudades.findByNombreCiudad")
                .setParameter("nombreCiudad", nombreCiudad + "%")
                .getResultList();
        
    }
        
         public List<Ciudades> findByOrden(Integer idCiudad) {
        return getEntityManager().createNativeQuery("SELECT * FROM ciudades ORDER BY nombre_ciudad ASC ="+idCiudad,Ciudades.class).getResultList();
       
        
    }
    
         
    
    
}
