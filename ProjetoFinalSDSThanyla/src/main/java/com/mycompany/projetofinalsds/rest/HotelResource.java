package com.mycompany.projetofinalsds.rest;

import com.mycompany.projetofinalsds.dao.HotelDAO;
import com.mycompany.projetofinalsds.model.Hotel;
import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
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
@Transactional
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
    public List<Hotel> findByCidadeBairro(@PathParam("idCidade") long idCidade, @PathParam("idBairro") long idBairro){
        return dao.findByCidadeBairro(idCidade, idBairro);
    }
    
    
    @GET
    @Path("{idCidade}/{precoMinimo}/{precoMaximo}/{totalCamas}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Hotel> buscarHotelPorCidadePrecoCamas(@PathParam("idCidade") long idCidade, @PathParam("precoMinimo") double precoMinimo, @PathParam("precoMaximo") double precoMaximo, @PathParam("totalCamas") int totalCamas){
        return dao.buscarHotelPorCidadeFaixaCamas(idCidade, precoMinimo, precoMaximo,totalCamas);
    }
    
}
