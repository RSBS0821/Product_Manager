package controller;

import dao.ProductoDao;
import dao.ConectarDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import models.Producto;
import models.ProductoValidation;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @version 1.0.1
 * @author Sebastian Bermudez
 * @since Marzo 10 2021
 */
@Controller
public class homeController {
    private JdbcTemplate jdbcTemplate;
    ProductoValidation prodValidar;

    /**
     *
     */
    public homeController() {
        this.prodValidar = new ProductoValidation();
        ConectarDB con = new ConectarDB();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    /**
     *
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping(value="formProd.htm", method=RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        Producto producto = new Producto();        
        mav.addObject("producto",producto);
        mav.setViewName("views/formProd");
        return mav;
    }
    
    /**
     *
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping(value="formProd.htm", method=RequestMethod.POST)
    public ModelAndView mostrarProd(){
        ModelAndView mav = new ModelAndView();
        String sql = "select * from producto";
        List datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("producto",datos);
        mav.setViewName("views/mostrarProd");
        return mav;
    }
    
//------------------ Metodo Agregar Producto ------------------    

    /**
     *
     * @return Retorna una vista para enviarla al formulario
     */
        @RequestMapping(value="agregarProd.htm", method=RequestMethod.GET)
    public ModelAndView cargarProd(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("producto", new Producto());
        mav.setViewName("views/agregarProd");
        return mav;
    }

    /**
     *
     * @param prod Datos del Producto
     * @param result Resultado
     * @param status Estado de la sesion
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping(value="agregarProd.htm", method=RequestMethod.POST)
    public ModelAndView agregarProd(
        @ModelAttribute ("producto") Producto prod,
        BindingResult result,
        SessionStatus status
        )
    {
    this.prodValidar.validate(prod,result);
    if(result.hasErrors()){
            ModelAndView mov = new ModelAndView();
            mov.addObject("producto", new Producto());
            mov.setViewName("views/agregarProd");
            return mov;
        }
        else{
            ModelAndView mav = new ModelAndView();
            String sql = "insert into producto (nombre, descripcion, marca, disponibilidad, precio) values (?,?,?,?,?)";
            this.jdbcTemplate.update(
                    sql,prod.getNombre(), prod.getDescripcion(), prod.getMarca(), prod.getDisponibilidad(), prod.getPrecio()
            );
            mav.setViewName("redirect:/formProd.htm");
            return mav;
        }
    }   
 //------------------- Metodo Actualizar Producto --------------

    /**
     *
     * @param request Dato requerido de la DB
     * @return Retorna una vista para enviarla al formulario
     */
        @RequestMapping(value="actProd.htm", method=RequestMethod.GET)
    public ModelAndView actProd(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));
        Producto prod = this.cargarProductobyId(id);
        mav.addObject("producto", new Producto (id, prod.getNombre(), prod.getDescripcion(), prod.getMarca(), prod.getDisponibilidad(),
        prod.getPrecio()));
        mav.setViewName("views/actProd");
        return mav;
    }

    /**
     *
     * @param prod Datos del Producto
     * @param result Resultado
     * @param status Estado de la sesion
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping(value="actProd.htm", method=RequestMethod.POST)
    public ModelAndView actProd(
            @ModelAttribute ("producto") Producto prod,
            BindingResult result,
            SessionStatus status
    ){
        this.prodValidar.validate(prod,result);
        if(result.hasErrors()){
            ModelAndView mov = new ModelAndView();
            mov.addObject("producto", new Producto());
            mov.setViewName("views/actProd");
            return mov;
        }
        else{
            ModelAndView mav = new ModelAndView();
            String sql = "update producto set nombre = ?, descripcion = ?, marca = ?, disponibilidad = ?, precio = ?"
                    + "where id = ?";
            this.jdbcTemplate.update(
                    sql, prod.getNombre(), prod.getDescripcion(), prod.getMarca(), prod.getDisponibilidad(), prod.getPrecio(), prod.getId()
            );
            mav.setViewName("redirect:/formProd.htm");
            return mav;
        }
    }
//------------ Metodo Eliminar Producto ---------------------

    /**
     *
     * @param request Dato requerido de la DB
     * @return Retorna una vista para enviarla al formulario
     */
        @RequestMapping("borrarProd.htm")
    public ModelAndView borrarProd(HttpServletRequest request ){
     ModelAndView mav = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from producto where id = ? ";
        this.jdbcTemplate.update(sql,id);
        mav.setViewName("redirect:/formProd.htm");
        return mav;
    }
//------------ Metodo Consultar Datos y Cargarlos ----------

    /**
     *
     * @param id Dato tomado de la DB
     * @return Retorna una vista para enviarla al formulario
     */
        public Producto cargarProductobyId(int id){
        final Producto prod = new Producto();
        String sql = "select * from producto where id = " + id;
        return (Producto) jdbcTemplate.query(sql, new ResultSetExtractor<Producto>() {
            
            public Producto extractData(ResultSet rs) throws SQLException, DataAccessException {
                if(rs.next()){
                    prod.setId(rs.getInt("id"));
                    prod.setNombre(rs.getString("nombre"));
                    prod.setDescripcion(rs.getString("descripcion"));
                    prod.setMarca(rs.getString("marca"));
                    prod.setDisponibilidad(rs.getString("disponibilidad"));
                    prod.setPrecio(rs.getInt("precio"));
                }
                return prod;
            }
        });                
    }
//------------------------------------------------------------------------------

    /**
     *
     * @return Retorna una vista para enviarla al formulario
     */
        @RequestMapping(value = "formConsultarProd.htm", method = RequestMethod.GET)
    public ModelAndView listarProdxNombre(){
        ModelAndView mav = new ModelAndView();
        Producto producto = new Producto();
        mav.addObject("producto", producto);
        mav.setViewName("views/formConsultarProd");
        return mav;
    }

    /**
     *
     * @param prod Datos del Producto
     * @param result Resultado
     * @param status Estado de la sesion
     * @return Retorna una vista para enviarla al formulario
     */
    @RequestMapping(value = "formConsultarProd.htm", method = RequestMethod.POST)
    public ModelAndView listarProdxNombre(
        @ModelAttribute ("producto") Producto prod,
        BindingResult result,
        SessionStatus status){
        ModelAndView mav = new ModelAndView();
        ProductoDao prodDao = new ProductoDao();
        String nom = prod.getNombre();
        mav.addObject("producto", prodDao.consultarProdByNombre(nom));
        mav.setViewName("views/listarProd");
        return mav;
    }
}
