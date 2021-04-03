<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio | Product Manager</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
            <a class="navbar-brand" href="#"><img style="width: 40px" src="data:image/svg+xml;base64,PHN2ZyBoZWlnaHQ9IjQ5NnB0IiB2aWV3Qm94PSIwIDAgNDk2IDQ5NiIgd2lkdGg9IjQ5NnB0IiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIj48bGluZWFyR3JhZGllbnQgaWQ9ImEiIGdyYWRpZW50VHJhbnNmb3JtPSJtYXRyaXgoOCAwIDAgLTggLTggNTA0KSIgZ3JhZGllbnRVbml0cz0idXNlclNwYWNlT25Vc2UiIHgxPSIzMiIgeDI9IjMyIiB5MT0iMSIgeTI9IjYzIj48c3RvcCBvZmZzZXQ9IjAiIHN0b3AtY29sb3I9IiM5ZjJmZmYiLz48c3RvcCBvZmZzZXQ9IjEiIHN0b3AtY29sb3I9IiMwYmIxZDMiLz48L2xpbmVhckdyYWRpZW50PjxwYXRoIGQ9Im0xMTIgMTQ0aDE2djQ4aC05NnYtMTA0aDQwdjE2aC0yNHY3Mmg2NHptLTMyLTExLjMxMjUtMTAuMzQzNzUtMTAuMzQzNzUtMTEuMzEyNSAxMS4zMTI1IDIxLjY1NjI1IDIxLjY1NjI1IDYxLjY1NjI1LTYxLjY1NjI1LTExLjMxMjUtMTEuMzEyNXptMjg4IDI5MS4zMTI1YzAgMjIuMDU0Njg4LTE3Ljk0NTMxMiA0MC00MCA0MHMtNDAtMTcuOTQ1MzEyLTQwLTQwIDE3Ljk0NTMxMi00MCA0MC00MCA0MCAxNy45NDUzMTIgNDAgNDB6bS0xNiAwYzAtMTMuMjMwNDY5LTEwLjc2OTUzMS0yNC0yNC0yNHMtMjQgMTAuNzY5NTMxLTI0IDI0IDEwLjc2OTUzMSAyNCAyNCAyNCAyNC0xMC43Njk1MzEgMjQtMjR6bTE0NC0zNDguMjIyNjU2YzAgMTUuNTU4NTk0LTEyLjY2NDA2MiAyOC4yMjI2NTYtMjguMjIyNjU2IDI4LjIyMjY1NmgtMS43NzczNDRjLTEuODQ3NjU2IDAtMy43MTA5MzgtLjE4MzU5NC01LjUzNTE1Ni0uNTUwNzgxbC0zOC4wNTA3ODItNy42MDkzNzUtMTUuNjA1NDY4IDY4LjI4MTI1IDI1LjYyNSA1MC44NDc2NTYtNDAuMTY3OTY5IDE3Ni43NWM0LjkwMjM0NCA5LjcyMjY1NiA3LjczNDM3NSAyMC42NjQwNjIgNy43MzQzNzUgMzIuMjgxMjUgMCAzOS43MDMxMjUtMzIuMzA0Njg4IDcyLTcyIDcyLTM3LjQzMzU5NCAwLTY4LjI1NzgxMi0yOC43MTg3NS03MS42NTYyNS02NS4yODEyNWwtMTk2LjA5NzY1Ni0zNi4zMTI1Yy0xMS43MzQzNzUtMi4xNzU3ODEtMjAuMjQ2MDk0LTEyLjQwNjI1LTIwLjI0NjA5NC0yNC4zNDM3NSAwLTIuMDIzNDM4LjI0NjA5NC00LjAzOTA2Mi43MzQzNzUtNmw0LjA1ODU5NC0xNi4yMjI2NTZjMi41MzUxNTYtMTAuMTEzMjgyIDEwLjcwMzEyNS0xNy41NTA3ODIgMjAuNjY0MDYyLTE5LjM4MjgxM2wyMi43MDMxMjUtMTA0LjQ1NzAzMWgtODguMTYwMTU2di0xNzEuMzEyNWw1Mi42ODc1LTUyLjY4NzVoMTIzLjMxMjV2MTU2LjY0MDYyNWwxNzMuNzM0Mzc1IDM0Ljc1IDM2LjE3NTc4MS0xNjAuNzY1NjI1IDg3LjQwMjM0NCAxNy40ODA0NjljMTMuMTQ0NTMxIDIuNjI4OTA2IDIyLjY4NzUgMTQuMjYxNzE5IDIyLjY4NzUgMjcuNjcxODc1em0tMjkzLjkyOTY4OCAxNDIuMDc4MTI1IDI0LjI2NTYyNiA0Ljg1NTQ2OSAxMC43MjY1NjItMzcuNTM1MTU3LTI0LjI2MTcxOS00Ljg1NTQ2OXptNDAgOCAyNC4yNjU2MjYgNC44NTU0NjkgMTAuNzI2NTYyLTM3LjUzNTE1Ny0yNC4yNjE3MTktNC44NTU0Njl6bS0yMTQuNzU3ODEyLTE3Ny44NTU0NjloMjAuNjg3NXYtMjAuNjg3NXptLTExLjMxMjUgMTYwaDE0NHYtMTkyaC05NnY0OGgtNDh6bTg4LjUzNTE1NiAxNi0yMi45ODQzNzUgMTA1Ljc1MzkwNiAxOTkuNDAyMzQ0IDM5Ljg3ODkwNmM5LjA4NTkzNy03Ljg3MTA5MyAyMC4xMTcxODctMTMuNTU0Njg3IDMyLjMxMjUtMTYuMDk3NjU2bDMyLjk2NDg0NC0xNDYuNTI3MzQ0LTUzLjQyOTY4OC0xMC42ODc1LTE1LjEzNjcxOSA1Mi45NzY1NjMtOTUuNzM0Mzc0LTE5LjE1MjM0NCAxNS4xMzI4MTItNTIuOTc2NTYyLTIxLjA2MjUtNC4yMDcwMzF2NTEuMDM5MDYyem0tNDEuMzc1IDE1NC42NzE4NzUgMTkzLjU0Mjk2OSAzNS44Mzk4NDRjMS41MTE3MTktMTEuMzkwNjI1IDUuNjMyODEzLTIxLjk2ODc1IDExLjgzOTg0NC0zMS4wNDY4NzVsLTE5Ni4zNDM3NS0zOS4yNzM0MzhjLTUuMTc1NzgxLTEuMDM5MDYyLTEwLjU3NDIxOSAyLjMyODEyNS0xMS44Nzg5MDcgNy41MTk1MzJsLTQuMDU0Njg3IDE2LjIxODc1Yy0uMTc1NzgxLjcwMzEyNC0uMjY1NjI1IDEuNDE0MDYyLS4yNjU2MjUgMi4xMzI4MTIgMCA0LjIxODc1IDMuMDA3ODEyIDcuODM5ODQ0IDcuMTYwMTU2IDguNjA5Mzc1em0zMjAuODM5ODQ0IDQ1LjMyODEyNWMwLTMwLjg3MTA5NC0yNS4xMjEwOTQtNTYtNTYtNTZzLTU2IDI1LjEyODkwNi01NiA1NiAyNS4xMjEwOTQgNTYgNTYgNTYgNTYtMjUuMTI4OTA2IDU2LTU2em0tNC4xNTIzNDQtNDkuODMyMDMxIDEyLjYxNzE4OC01NS41MTk1MzEtMjAuMDY2NDA2LTQuMDA3ODEzLTEwLjQ4ODI4MiA0NS44Nzg5MDZjNi42OTE0MDYgMy41OTM3NSAxMi43MjI2NTYgOC4yMjI2NTcgMTcuOTM3NSAxMy42NDg0Mzh6bS0zLjg3ODkwNi03NS4xMjg5MDcgMjAuMDM5MDYyIDQuMDA3ODEzIDEzLjE1MjM0NC01Ny44NTU0NjktMTkuOTY4NzUtMy45OTIxODd6bTI1LjI0NjA5NC0xMTAuNDY0ODQzLTguNDYwOTM4IDM3LjAxOTUzMSAxOS45NDkyMTkgMy45OTIxODggMi44NTU0NjktMTIuNTU0Njg4em01LjUwMzkwNi05NS44NzEwOTQtMTcuNTgyMDMxLTMuNTE5NTMxLTU5LjE1MjM0NCAyNjIuOTIxODc1YzUuODMyMDMxLjE2MDE1NiAxMS40NzI2NTYgMS4wMTU2MjUgMTYuODc4OTA2IDIuNDg4Mjgxem03My4yODEyNS0xNi45MjU3ODFjMC01LjgwODU5NC00LjEzNjcxOS0xMC44Mzk4NDQtOS44MzIwMzEtMTEuOTg0Mzc1bC03Mi4wNzgxMjUtMTQuNDE3OTY5LTUuNDQxNDA2IDI0LjE5MTQwNiA3MC45NjA5MzcgMTQuMTk1MzEzYy43ODkwNjMuMTYwMTU2IDEuNTg5ODQ0LjIzODI4MSAyLjM5ODQzNy4yMzgyODFoMS43NzczNDRjNi43MjY1NjMgMCAxMi4yMTQ4NDQtNS40ODgyODEgMTIuMjE0ODQ0LTEyLjIyMjY1NnptMCAwIiBmaWxsPSJ1cmwoI2EpIi8+PC9zdmc+"></a>
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="index.htm">Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="formProd.htm">Producto</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="formConsultarProd.htm">Busqueda Producto</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../../index.html">Ayuda</a>
                </li>
            </ul>
        </nav>
        <div class="container-fluid" style="margin-top: 80px; margin-bottom: 80px">
            <div class="mb-4">
                <img class="mx-auto d-block" style="width: 80%; height: 20%" src="https://blog.nubox.com/hubfs/estrategias-mejorar-control-inventarios.jpg?length=320&name=featured.jpg" alt="inventario">
            </div>
            <h5>Aplicativo Web especializado en la insercion, actualizacion, busqueda y eliminacion de los datos sobre productos</h5><br>
        </div>
        <div class="container-fluid text-center fixed-bottom bg-dark py-4">
            <h6 style="color: lightgrey">Todos los derechos reservados | 2021 </h6>
        </div>
    </body>
</html>
