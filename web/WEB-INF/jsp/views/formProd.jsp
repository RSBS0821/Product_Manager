<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
        <h1>Agregar Producto</h1>
        <div class="container" style="margin-top: 80px">
            <form:form cssClass="navbar-form " method="post" commandName="producto">
                <form:errors path="*" element="div" cssClass="alert alert-danger" />
                <div class="form-group">
                <form:label path="nombre" cssClass="input-group-addon">Nombre Usuario: </form:label>
                <form:input path="nombre" cssClass="form-control"></form:input>            
                </div>
                <form:errors path="nombre" />
                <form:button name="Enviar" class="btn btn-primary btn-lg">Enviar</form:button>
                <a class="btn btn-primary btn-lg" href="index.htm" role="button" >Regresar...</a>
             </form:form>
        </div>
        <div class="container-fluid text-center fixed-bottom bg-dark py-4">
            <h6 style="color: lightgrey">Todos los derechos reservados | 2021 </h6>
        </div>
    </body>
</html>
