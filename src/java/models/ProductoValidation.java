
package models;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Sebastian Bermudez
 */
public class ProductoValidation implements Validator {

    /**
     *
     * @param type Parametro tipo
     * @return Tipo asignado
     */
    @Override
    public boolean supports(Class<?> type) {
        return Producto.class.isAssignableFrom(type);
    }

    /**
     *
     * @param o Objeto propuesto
     * @param errors Parametro de errores
     */
    @Override
    public void validate(Object o, Errors errors) {
        Producto producto = (Producto)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "nombre",
                "required.nombre",
                "El campo nombre es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "direccion",
                "required.descripcion",
                "El campo descripcion es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "correo",
                "required.marca",
                "El campo marca es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "telefono",
                "required.disponibilidad",
                "El campo disponibilidad es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,
                "salario",
                "required.precio",
                "El campo precio es obligatorio");
    }
}
