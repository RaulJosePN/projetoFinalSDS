package com.mycompany.projetofinalsds.config;

import com.mycompany.projetofinalsds.dao.DAO;
import com.mycompany.projetofinalsds.dao.HotelDAO;
import com.mycompany.projetofinalsds.dao.JpaDAO;
import com.mycompany.projetofinalsds.model.Cadastro;
import java.lang.reflect.ParameterizedType;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author raul
 */
public class Producers {

    @Produces
    @PersistenceContext
    private EntityManager em;
    
    @Produces
    public <T extends Cadastro> DAO<T> getDao(InjectionPoint ip){
        ParameterizedType t = (ParameterizedType) ip.getType();
        Class classe = (Class) t.getActualTypeArguments()[0];
        return new JpaDAO(em, classe);
    }

    @Produces
    public HotelDAO getHotelDao(InjectionPoint ip){
        return new HotelDAO(em);
    }
    
}
