/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.rest.services;





import com.empresa.jpa.entities.Ingresos;
import com.empresa.jpa.sessions.IngresosFacade;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javax.ws.rs.core.Response;

/**
 *
 * @author LuisaAldana
 */

@Path("ingresos")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class IngresosRest {
    
    @EJB
    private IngresosFacade ejbIngresosFacade;
 
    
    

    @POST  
    public void create(Ingresos ingresos){
         ejbIngresosFacade.create(ingresos);
  
       
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(@PathParam("id") Integer id, Ingresos ingresos) {
        ejbIngresosFacade.edit(ingresos);
    }
    
    @PUT
    @Path("inhabilit/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response inhabilit(@PathParam("id") Integer id) {
       Ingresos ingreso=ejbIngresosFacade.find(id);
       
       if(ingreso.getEstado()) {
           ingreso.setEstado(Boolean.FALSE); 
    }else{
          ingreso.setEstado(Boolean.TRUE);
        
    }
     GsonBuilder gsonBuilder = new GsonBuilder();
     Gson gson = gsonBuilder.create();
     try {
            ejbIngresosFacade.edit(ingreso);
            return Response.ok()
                    .entity(gson.toJson("El estado se ha cambiado"))
                    .build();
        } catch (Exception ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
            return Response.status(Response.Status.BAD_REQUEST).entity(gson.toJson("Error de persistencia")).build();
        }
    }
    
    
    
    
    

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        ejbIngresosFacade.remove(ejbIngresosFacade.find(id));
    }

    
    @GET
    public List<Ingresos> findAll() {
        return ejbIngresosFacade.findAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ingresos findById(@PathParam("id") Integer id) {
        return ejbIngresosFacade.find(id);
    }
    
    
   
}

    


    

