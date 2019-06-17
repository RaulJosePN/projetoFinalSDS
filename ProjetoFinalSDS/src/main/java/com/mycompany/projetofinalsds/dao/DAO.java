package com.mycompany.projetofinalsds.dao;

import com.mycompany.projetofinalsds.model.Bairro;
import com.mycompany.projetofinalsds.model.Cadastro;
import com.mycompany.projetofinalsds.model.Cidade;
import com.mycompany.projetofinalsds.model.Hotel;
import com.mycompany.projetofinalsds.model.HotelQuarto;

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

    //Criado Automaticamente
    public Hotel findByField(long id);

    public Hotel findByField(long id, long id0);
}
