/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.rest.services;





import com.empresa.jpa.entities.IngresosAu;
import com.empresa.jpa.sessions.IngresosAuFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author LuisaAldana
 */

@Path("trigger")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class IngresosAuRest {
    
    @EJB
    private IngresosAuFacade ejbIngresosAuFacade;
 
    
    

    @POST  
    public void create(IngresosAu audiIngresos){
         ejbIngresosAuFacade.create(audiIngresos);
  
       
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, IngresosAu audiIngresos) {
        ejbIngresosAuFacade.edit(audiIngresos);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        ejbIngresosAuFacade.remove(ejbIngresosAuFacade.find(id));
    }

    
    @GET
    public List<IngresosAu> findAll() {
        return ejbIngresosAuFacade.findAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public IngresosAu findById(@PathParam("id") Integer id) {
        return ejbIngresosAuFacade.find(id);
    }
}

    


    

