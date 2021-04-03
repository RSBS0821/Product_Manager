
package models;

/**
 *
 * @author Sebastian Bermudez
 */
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private String marca;
    private String disponibilidad;
    private double precio;

    /**
     *
     * @return Retorna el dato Salario
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param id Dato recibido del formulario
     * @param nombre Dato recibido del formulario
     * @param descripcion Dato recibido del formulario
     * @param marca Dato recibido del formulario
     * @param disponibilidad Dato recibido del formulario
     * @param precio Dato recibido del formulario
     */
    public Producto(int id, String nombre, String descripcion, String marca, String disponibilidad, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
    }
     
    /**
     *
     * @param precio Dato digitado por el usuario
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     *
     */
    public Producto() {
    }

    /**
     *
     * @return Dato recibido del formulario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre Dato digitado por el usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return Dato recibido del formulario
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion Dato digitado por el usuario
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return Dato recibido del formulario
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca Dato digitado por el usuario
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return Dato recibido del formulario
     */
    public String getDisponibilidad() {
        return disponibilidad;
    }

    /**
     *
     * @param disponibilidad Dato digitado por el usuario
     */
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     *
     * @return Dato recibido del formulario
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id Dato digitado automaticamente
     */
    public void setId(int id) {
        this.id = id;
    }  
}
