package com.mycompany.projetofinalsds.rest;

import com.mycompany.projetofinalsds.dao.HotelDAO;
import com.mycompany.projetofinalsds.model.Hotel;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author raul
 */
@Path("/hotel")
public class HotelResource {

    @Inject
    private HotelDAO dao;

    @GET
    @Path("{idCidade}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Hotel> findByCidade(@PathParam("idCidade") long idCidade){
        return dao.findByCidade(idCidade);
    }
    
    
    @GET
    @Path("{idCidade}/{idBairro}")
    @Produces(MediaType.APPLICATION_JSON)
    public Hotel findByCidadeBairro(@PathParam("idCidade") long idCidade, @PathParam("idBairro") long idBairro){
        return dao.findByCidadeBairro(idCidade, idBairro);
    }
    
    /*
    @GET
    @Path("{cidade}/{quarto}")
    public Hotel buscarHotelPorCidadePrecoCamas(@PathParam("cidade") Cidade cidade, @PathParam("quartoHotel") HotelQuarto quarto){
        return dao.(cidade.getId(), quarto.getId());
    }*/
    
}
