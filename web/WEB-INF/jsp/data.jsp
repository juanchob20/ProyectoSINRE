<%-- 
    Document   : data
    Created on : 5/12/2017, 08:28:28 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="#">Agregar</a>
        <table style="border-collapse: collapse" cellpadding="7px" border="1">
            <tr>
                <td><strong>ID</strong></td>
                <td><strong>Categoria</strong></td>
                <td><strong>Persona</strong></td>
                <td><strong>Codigo</strong></td>
                <td><strong>Serial</strong></td>
                <td><strong>Marca</strong></td>
                <td><strong>Fecha Registro</strong></td>
                 <td><strong>Categoria</strong></td>
                <td><strong>Numero Documento</strong></td>
            </tr>

            
                
                <c:forEach items="$(lst)" var="e">
            <tr>
                <td>${e.idelemento}</td>
                <td>${e.cat_id_categoria}</td>
                <td>${e.idpersona}</td>
                <td>${e.codigo}</td>
                <td>${e.serial}</td>
                <td>${e.marca}</td>
                <td>${e.fecha_registro}</td>
                <td>${e.idcategoria}</td>
                <td>${e.numdocumento}</td>
                <td>
                    <a href="#">
                        Edit</a>
                    <a href="#" onclick="return confirm('Are you sure?')">Remove</a>
                </td>

            </tr>
                </c:forEach>
        </table>
    
    </body>
</html>
