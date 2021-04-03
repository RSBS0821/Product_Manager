<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.24/css/jquery.dataTables.css">
    <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.js"></script>
    <script>
    $(document).ready( function () {
        $('#listadoTabla').DataTable({
            "paging":true,
            "buttons":true,
            "lenghtMenu": [[5,10,25,50,-1], [5,10,25,50,"All"]],
            "language": {
                "url":"https://cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json"
            },
            "paginate":true
        });
    } );
    </script>
            <div class="container-fluid bg-info text-center p-3 mb-2" style="margin-top: 80px">
                <h3>Consulta de Producto por Nombre</h3>
            </div>
            <div class="container-fluid">
                <table id="listadoTabla" class="table table-bordered table-striped table-hover">
                    <thead>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Descripcion</th>
                        <th>Marca</th>
                        <th>Disponibilidad</th>
                        <th>Precio</th>
                    </thead>
                    <tbody>
                        <c:forEach items="${producto}" var="dato">
                        <tr>
                            <td><c:out value="${dato.id}"></c:out></td>
                            <td><c:out value="${dato.nombre}"></c:out></td>
                            <td><c:out value="${dato.descripcion}"></c:out></td>
                            <td><c:out value="${dato.marca}"></c:out></td>
                            <td><c:out value="${dato.disponibilidad}"></c:out></td>
                            <td><c:out value="${dato.precio}"></c:out></td>
                        </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="container-fluid text-center fixed-bottom bg-dark py-4">
                    <h6 style="color: lightgrey">Todos los derechos reservados | 2021 </h6>
                </div>
    </body>
</html>
