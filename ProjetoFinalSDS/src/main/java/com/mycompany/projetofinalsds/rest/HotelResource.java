package com.mycompany.projetofinalsds.rest;

import com.mycompany.projetofinalsds.dao.DAO;
import com.mycompany.projetofinalsds.model.Hotel;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author raul
 */
@Path("/hotel")
public class HotelResource {

    @Inject
    private DAO<Hotel> dao;

}
