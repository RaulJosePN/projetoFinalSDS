package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Voo;

/**
 *
 * @author raul
 */
public class VooDAO extends JpaDAO<Voo> {

    public VooDAO(EntityManager em) {
        super(em, Voo.class);
    }

    public List<Voo> findByCidadeOrigemDestino(long idCidadeO, long idCidadeD) {
        final String jpql = "select o from Voo o where o.cidadeOrigem.id = :idCidadeO and o.cidadeDestino.id = :idCidadeD";
        TypedQuery<Voo> query = getEm().createQuery(jpql, Voo.class);
        query.setParameter("idCidadeO", idCidadeO);
        query.setParameter("idCidadeD", idCidadeD);
        return query.getResultList();
    }

    public List<Voo> findByCidadeOrigemDestinoData(long idCidadeO, long idCidadeD, String data) {
        final String jpql = "select o from Voo o where o.cidadeOrigem.id = :idCidadeO and o.cidadeDestino.id = :idCidadeD and o.dataPartida = :data";
        TypedQuery<Voo> query = getEm().createQuery(jpql, Voo.class);
        query.setParameter("idCidadeO", idCidadeO);
        query.setParameter("idCidadeD", idCidadeD);
        query.setParameter("data", data);
        return query.getResultList();
    }

    public List<Voo> findByCidadeOrigemDestinoDataPreco(long idCidadeO, long idCidadeD, String data, double precoMin, double precoMax) {
        final String jpql = "select o from Voo o where o.cidadeOrigem.id = :idCidadeO and o.cidadeDestino.id = :idCidadeD and o.dataPartida = :data and o.preco >= :precoMin and o.preco <= :precoMax";
        TypedQuery<Voo> query = getEm().createQuery(jpql, Voo.class);
        query.setParameter("idCidadeO", idCidadeO);
        query.setParameter("idCidadeD", idCidadeD);
        query.setParameter("data", data);
        query.setParameter("precoMin", precoMin);
        query.setParameter("precoMax", precoMax);
        return query.getResultList();
    }

}
