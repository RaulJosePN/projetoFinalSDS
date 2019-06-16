package com.mycompany.projetofinalsds.rest;

import com.mycompany.projetofinalsds.dao.DAO;
import com.mycompany.projetofinalsds.model.Bairro;
import com.mycompany.projetofinalsds.model.Cidade;
import com.mycompany.projetofinalsds.model.Hotel;
import com.mycompany.projetofinalsds.model.HotelQuarto;
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
    private DAO<Hotel> dao;

    @GET
    @Path("{cidade}")
    @Produces(MediaType.APPLICATION_JSON)
    public Hotel buscarHotelPorCidade(@PathParam("cidade") Cidade cidade){
        return dao.findByField(cidade);
    }
    
    
    @GET
    @Path("{cidade},{bairro}")
    @Produces(MediaType.APPLICATION_JSON)
    public Hotel buscarHotelPorBairroDeCidade(@PathParam("cidade") Cidade cidade, @PathParam("bairro") Bairro bairro){
        return dao.findByField(cidade, bairro);
    }
    
    
    @GET
    @Path("{cidade},{quarto}")
    public Hotel buscarHotelPorCidadePrecoCamas(@PathParam("cidade") Cidade cidade, @PathParam("quartoHotel") HotelQuarto quarto){
        return dao.findByField(cidade, quarto);
    }
    
}
