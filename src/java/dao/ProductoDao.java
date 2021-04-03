
package dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Sebastian Bermudez
 */
public class ProductoDao {
    JdbcTemplate jdbcTemplate;
    ConectarDB con = new ConectarDB();
    
    /**
     *
     * @param id Dato tomado de la DB
     * @return Retorna una vista para enviarla al formulario
     */
    public List consultarProdById (int id){
        List prod = new ArrayList();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "select * from producto where id = ?";
        prod = this.jdbcTemplate.queryForList(sql, id);
        return prod;
    }

    /**
     *
     * @param nombre Dato tomado de la DB
     * @return Retorna una vista para enviarla al formulario
     */
    public List consultarProdByNombre (String nombre){
        List prod = new ArrayList();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "select * from producto where nombre like '%" + nombre + "%' ";
        prod = this.jdbcTemplate.queryForList(sql);
        return prod;
    }
}
