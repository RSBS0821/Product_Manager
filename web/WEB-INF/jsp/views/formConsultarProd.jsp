<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta Productos</title>
    </head>
    <body>
        <div class="container" style="margin-top: 80px">
            <form:form cssClass="navbar-form" method="post" commandName="producto">
                <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                    <div class="text-center p-3">
                        <h3>Consulta de producto</h3>
                    </div>
                    <div>
                        <div class="form-group">
                            <form:label path="nombre" cssClass="input-group-addon">Nombre Producto: </form:label>
                            <form:input path="nombre" cssClass="form-control"></form:input>
                        </div>
                        <form:button name="Enviar" class="btn btn-primary btn-lg">Enviar</form:button>
                        <a class="btn btn-primary btn-lg" href="index.htm" role="button">Regresar</a>
                    </div>
            </form:form>
        </div>
        <div class="container-fluid text-center fixed-bottom bg-dark py-4">
            <h6 style="color: lightgrey">Todos los derechos reservados | 2021 </h6>
        </div>
    </body>
</html>
