
package com.empresa.rest.services;







import com.empresa.jpa.entities.Paises;
import com.empresa.jpa.sessions.PaisesFacade;
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
@Path("paises")
public class PaisesRest {
    
    
    @EJB
    private PaisesFacade ejbPaisesFacade;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Paises> findAll() {
        return ejbPaisesFacade.findAll();
    }

    @GET
    @Path("nombre/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Paises> findByNombrePais(@PathParam("nombrePais") String nombrePais) {
        return ejbPaisesFacade.findByNombrePais(nombrePais);
    }

}


