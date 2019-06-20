package com.mycompany.projetofinalsds.dao;

import com.mycompany.projetofinalsds.model.Cadastro;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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
    public T findById(long id) {
        return em.find(classe, id);
    }

    @Override
    public void save(T entity) {
        em.persist(entity);
    }

    @Override
    public T findByField(String fieldName, Object value) {
        final String jpql = "select o from " + classe.getSimpleName() + " o "
                + "where o." + fieldName + " =: " + fieldName;
        TypedQuery<T> query = em.createQuery(jpql, classe);
        query.setParameter(fieldName, value);
        return query.getSingleResult();
    }


    @Override
    public boolean remove(long id) {
        T entity = findById(id);
        return remove(entity);
    }

    @Override
    public boolean remove(T entity) {
        em.remove(entity);
        return true;
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

}
