package com.mycompany.projetofinalsds.dao;

import com.mycompany.projetofinalsds.model.Cadastro;

/**
 *
 * @author raul
 * @param <T>
 */
public interface DAO< T extends Cadastro> {
    
    T findById(long id);
    
    T findByField(String fieldName, Object value);
    
    boolean remove(T entity);
    
    void save(T entity);

    public boolean remove(long id);
}
