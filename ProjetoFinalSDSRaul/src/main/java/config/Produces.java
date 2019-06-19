package config;

import dao.DAO;
import dao.JpaDAO;
import dao.VooDAO;
import java.lang.reflect.ParameterizedType;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Cadastro;

/**
 *
 * @author raul
 */
public class Produces {

    @javax.enterprise.inject.Produces
    @PersistenceContext
    private EntityManager em;

    @javax.enterprise.inject.Produces
    public <T extends Cadastro> DAO<T> getDao(InjectionPoint ip) {
        ParameterizedType t = (ParameterizedType) ip.getType();
        Class classe = (Class) t.getActualTypeArguments()[0];
        return new JpaDAO(em, classe);
    }

    @javax.enterprise.inject.Produces
    public VooDAO getVooDAO(InjectionPoint ip){
        return new VooDAO(em);
    }
    
}
