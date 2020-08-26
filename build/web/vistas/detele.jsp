<%@page import="Modelo.Producto"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <h1>Eliminar Medicamento</h1>
                <form action="controlador">
                    Codigo:<br>
                    <input class="from-control" type="text" name="txtCod"><br>
                    <input class="bt btn-primary" type="submit" name="accion" value="Eliminar">
                    <a href="Controlador?accion=eliminar">Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
