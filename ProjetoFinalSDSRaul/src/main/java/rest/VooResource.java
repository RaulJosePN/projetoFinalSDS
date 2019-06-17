package rest;

import dao.DAO;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import model.Voo;

/**
 *
 * @author raul
 */
@Path("/voo")
public class VooResource {

    @Inject
    private DAO<Voo> dao;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(Voo voo) {
        dao.save(voo);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(Voo voo) {
        Voo vooBuscado = dao.findById(voo.getId());
        dao.save(vooBuscado);
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean delete(Voo voo) {
        return dao.remove(voo);
    }

}
