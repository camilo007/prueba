package com.empresa.rest.services;









import com.empresa.jpa.entities.Ciudades;
import com.empresa.jpa.sessions.CiudadesFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author leoandresm
 */
@Path("ciudades")
public class CiudadesRest {

    @EJB
    private CiudadesFacade ejbCiudadesFacade;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ciudades> findAll() {
        return ejbCiudadesFacade.findAll();
    }

    @GET
    @Path("nombre/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ciudades> findByNombreCiudad(@PathParam("nombreCiudad") String nombreCiudad) {
        return ejbCiudadesFacade.findByNombreCiudad(nombreCiudad);
    }

}
