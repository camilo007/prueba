/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.rest.services;








import com.empresa.jpa.entities.Departamentos;
import com.empresa.jpa.sessions.DepartamentosFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Camilo
 */
@Path("departamentos")
public class DepartamentosRest {
    
    
    @EJB
    private DepartamentosFacade ejbDepartamentosFacade;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Departamentos> findAll() {
        return ejbDepartamentosFacade.findAll();
    }

    @GET
    @Path("nombre/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Departamentos> findByNombreDepartamento(@PathParam("nombreDepartamento") String nombreDepartamento) {
        return ejbDepartamentosFacade.findByNombreDepartamento(nombreDepartamento);
    }

}
