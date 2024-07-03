<%--
  Created by IntelliJ IDEA.
  User: Ancort
  Date: 03-07-2024
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container mt-5">
    <h2>Lista de Proveedores</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>RUT</th>
            <th>Dirección</th>
            <th>Correo</th>
            <th>Teléfono</th>
            <th>Contacto</th>
            <th>Teléfono de Contacto</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="proveedor" items="${proveedores}">
            <tr>
                <td>${proveedor.id}</td>
                <td>${proveedor.nombre}</td>
                <td>${proveedor.rut}</td>
                <td>${proveedor.direccion}</td>
                <td>${proveedor.correo}</td>
                <td>${proveedor.telefono}</td>
                <td>${proveedor.contacto}</td>
                <td>${proveedor.telefonoContacto}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="form.jsp" class="btn btn-primary">Agregar Proveedor</a>
</div>
</body>
</html>
