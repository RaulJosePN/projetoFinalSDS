package com.mycompany.projetofinalsds.dao;

import com.mycompany.projetofinalsds.model.Hotel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author aluno
 */
public class HotelDAO extends JpaDAO<Hotel>{

    public HotelDAO(EntityManager em) {
        super(em, Hotel.class);
    }
    
    public List<Hotel> findByCidade(long idCidade){
        final String jpql = 
                " select o from Hotel o INNER JOIN FETCH o.bairro b where b.cidade.id = :idCidade";
        TypedQuery<Hotel> query = getEm().createQuery(jpql, Hotel.class);
        query.setParameter("idCidade", idCidade);
        return query.getResultList();
    }

    public Hotel findByCidadeBairro(long idCidade, long idBairro){
        return null;
    }
}
