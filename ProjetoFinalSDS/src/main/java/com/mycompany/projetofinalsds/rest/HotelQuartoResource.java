package com.mycompany.projetofinalsds.rest;

import com.mycompany.projetofinalsds.dao.DAO;
import com.mycompany.projetofinalsds.model.HotelQuarto;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.Entity;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author raul
 */
@Path("/quarto")
public class HotelQuartoResource {

    @Inject
    private DAO<HotelQuarto> dao;

    @PUT
    @Path("{hotelQuarto}")
    @Produces(MediaType.APPLICATION_JSON)
    public void save(@PathParam("{hotelQuarto}")Entity entity) {
        dao.save((HotelQuarto) entity);
    }

}
