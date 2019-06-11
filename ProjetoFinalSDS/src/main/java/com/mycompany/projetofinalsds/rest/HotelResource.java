/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetofinalsds.rest;

import com.mycompany.projetofinalsds.dao.DAO;
import com.mycompany.projetofinalsds.model.Hotel;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author Thanyla
 */
@Path("/hotel")
public class HotelResource {

    @Inject
    private DAO<Hotel> dao;

}
