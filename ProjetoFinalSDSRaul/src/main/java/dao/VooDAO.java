package dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Voo;

/**
 *
 * @author raul
 */
public class VooDAO extends JpaDAO<Voo>{

    public VooDAO(EntityManager em) {
        super(em, Voo.class);
    }

    public List<Voo> findByCidadeOrigemDestino(long idCidadeO, long idCidadeD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Voo> findByCidadeOrigemDestinoData(long idCidadeO, long idCidadeD, String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Voo> findByCidadeOrigemDestinoDataPreco(long idCidadeO, long idCidadeD, String data, double preco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
