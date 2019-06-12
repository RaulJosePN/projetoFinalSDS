package com.mycompany.projetofinalsds.rest;

import com.mycompany.projetofinalsds.dao.DAO;
import com.mycompany.projetofinalsds.model.HotelQuarto;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
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
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(HotelQuarto quarto) {
        dao.save(quarto);
    }

}
