package org.pedro;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.pedro.entities.Fruta;

import java.util.List;

@Path("/frutas")
public class FrutasResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruta> list() {
        return Fruta.listAll();
    }


    @POST @Transactional
    public void novaFruta(){
        Fruta fruta = new Fruta();
        fruta.name = "Elefante";
        fruta.quantity = 4;
        fruta.persist();
    }
}
