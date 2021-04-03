
package dao;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Sebastian Bermudez
 */
public class ConectarDB {

    /**
     *
     * @return Retorna la informacion de la conexion de la DB
     */
    public DriverManagerDataSource conectar (){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/producto");
        datasource.setUsername("root");
        datasource.setPassword("");
        
        return datasource;
    }
}
