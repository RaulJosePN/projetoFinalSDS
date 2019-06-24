package rest;

import dao.DAO;
import dao.VooDAO;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Voo;

/**
 *
 * @author raul
 */
@Path("/voo")
public class VooResource {


    @Inject
    private VooDAO dao;

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

    @GET
    @Path("{idCidadeO}/{idCidadeD}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Voo> findByCidadeOrigemDestino(@PathParam("idCidadeO") long idCidadeO, @PathParam("idCidadeD") long idCidadeD) {
        return dao.findByCidadeOrigemDestino(idCidadeO, idCidadeD);
    }

    @GET
    @Path("{idCidadeO}/{idCidadeD}/{data}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Voo> findByCidadeOrigemDestinoData(@PathParam("idCidadeO") long idCidadeO, @PathParam("idCidadeD") long idCidadeD, @PathParam("data") String data) {
        return dao.findByCidadeOrigemDestinoData(idCidadeO, idCidadeD, data);
    }

    @GET
    @Path("{idCidadeO}/{idCidadeD}/{data}/{preco}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Voo> findByCidadeOrigemDestinoDataPreco(@PathParam("idCidadeO") long idCidadeO, @PathParam("idCidadeD") long idCidadeD, @PathParam("data") String data, @PathParam("preco") double preco) {
        return dao.findByCidadeOrigemDestinoDataPreco(idCidadeO, idCidadeD, data, preco);
    }
}
