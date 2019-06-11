package com.mycompany.projetofinalsds.rest;

import com.mycompany.projetofinalsds.dao.DAO;
import com.mycompany.projetofinalsds.model.HotelQuarto;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author Thanyla
 */
@Path("/quarto")
public class HotelQuartoResource {

    @Inject
    private DAO<HotelQuarto> dao;

}
