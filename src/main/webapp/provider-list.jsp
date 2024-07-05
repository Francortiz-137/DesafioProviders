<%--
  Created by IntelliJ IDEA.
  User: Ancort
  Date: 03-07-2024
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Proveedores</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
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
        <c:forEach var="proveedor" items="${listProviders}">
            <tr>
                <td>${proveedor.id}</td>
                <td>${proveedor.name}</td>
                <td>${proveedor.rut}</td>
                <td>${proveedor.address}</td>
                <td>${proveedor.email}</td>
                <td>${proveedor.phone}</td>
                <td>${proveedor.contact}</td>
                <td>${proveedor.contactPhone}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="form.jsp" class="btn btn-primary">Agregar Proveedor</a>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>
