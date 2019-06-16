package dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Cadastro;

/**
 *
 * @author raul
 * @param <T>
 */
public class JpaDAO<T extends Cadastro> implements DAO<T> {

    private final EntityManager em;
    private final Class<T> classe;

    public JpaDAO(EntityManager em, Class<T> classe) {
        this.em = em;
        this.classe = classe;
    }

    @Override
    public boolean remove(T entity) {
        em.remove(entity);
        return true;
    }

    @Override
    public void save(T entity) {
        em.persist(entity);
    }

    @Override
    public T findById(long id) {
        return em.find(classe, id);
    }

    @Override
    public T findByField(String fieldName, Object value) {
        final String jpql = "select o from " + classe.getSimpleName() + " o "
                + "where o." + fieldName + " =: " + fieldName;
        TypedQuery<T> query = em.createQuery(jpql, classe);
        query.setParameter(fieldName, value);
        return query.getSingleResult();
    }

}
