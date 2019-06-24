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

    public List<Hotel> findByCidadeBairro(long idCidade, long idBairro){
        final String jpql = 
                " select o from Hotel o INNER JOIN FETCH o.bairro b where b.id = :idBairro and b.cidade.id = :idCidade";
        TypedQuery<Hotel> query = getEm().createQuery(jpql, Hotel.class);
        query.setParameter("idBairro", idBairro);
        query.setParameter("idCidade", idCidade);
        return query.getResultList();
    }

//    public List<Hotel> buscarHotelPorCidadePrecoCamas(long idCidade, long idQuarto) {
//        final String jpql = 
//                " select o from Hotel o INNER JOIN FETCH o.bairro b INNER JOIN FETCH o.quartosDeHotel q where b.cidade.id = :idCidade and q.";
//        TypedQuery<Hotel> query = getEm().createQuery(jpql, Hotel.class);
//        query.setParameter("idBairro", idBairro);
//        query.setParameter("idCidade", idCidade);
//        return query.getResultList();
//    }

    public List<Hotel> buscarHotelPorCidadeFaixaCamas(long idCidade, double precoMinimo, double precoMaximo, int totalCamas) {
        final String jpql = 
                " select o from Hotel o INNER JOIN FETCH o.bairro b INNER JOIN FETCH o.quartosDeHotel q where b.cidade.id = :idCidade and q.preco >= :precoMinimo and q.preco <= :precoMaximo and q.totalCamas = :totalCamas";
        TypedQuery<Hotel> query = getEm().createQuery(jpql, Hotel.class);
        query.setParameter("idCidade", idCidade);
        query.setParameter("precoMinimo", precoMinimo);
        query.setParameter("precoMaximo", precoMaximo);
        query.setParameter("totalCamas", totalCamas);
        return query.getResultList();
    }
}
