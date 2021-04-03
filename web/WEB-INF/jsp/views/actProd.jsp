<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>
        <div class="container">
            <div class="text-center py-4" style="margin-top: 80px">
                <h3>Modificar Producto</h3>
            </div>
            <div style="margin-bottom: 100px">
                <form:form commandName="producto" method="post">
                <form:errors path="*"></form:errors>
                <div class="form-group">
                    <form:label path="nombre" cssClass="input-group-addon">Digite el nombre del producto: </form:label>
                    <form:input path="nombre" cssClass="form-control"></form:input>
                </div>
                <div class="form-group">
                    <form:label path="descripcion" cssClass="input-group-addon">Digite la descripcion: </form:label>
                    <form:input path="descripcion" cssClass="form-control"></form:input>
                </div>
                <div class="form-group">
                    <form:label path="marca" cssClass="input-group-addon">Digite la marca: </form:label>
                    <form:input path="marca" cssClass="form-control"></form:input>
                </div>
                <div class="form-group">
                    <form:label path="disponibilidad" cssClass="input-group-addon">Digite la disponibilidad: </form:label>
                    <form:input path="disponibilidad" cssClass="form-control"></form:input>
                </div>
                <div class="form-group">
                    <form:label path="precio" cssClass="input-group-addon">Digite el precio: </form:label>
                    <form:input path="precio" cssClass="form-control"></form:input>
                </div><br>
                <form:button value="Enviar_datos" class="btn btn-primary btn-md">Enviar Datos</form:button>
                <input type="reset" value="Limpiar" class="btn btn-primary btn-md"/>
                <a href="formProd.htm" class="btn btn-primary btn-md">Regresar</a>
                </form:form>
            </div>
            <div class="container-fluid text-center fixed-bottom bg-dark py-4">
            <h6 style="color: lightgrey">Todos los derechos reservados | 2021 </h6>
            </div>
        </div>
    </body>
</html>
