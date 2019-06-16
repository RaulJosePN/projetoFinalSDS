package dao;

import model.Cadastro;

/**
 *
 * @author raul
 * @param <T>
 */
public interface DAO<T extends Cadastro> {
    
    boolean remove(T entity);
    
    void save(T entity);
    
    T findById(long id);
    
    T findByField(String fieldName, Object value);
}
