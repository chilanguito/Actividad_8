<%-- 
    Document   : index
    Created on : 3/11/2020, 01:05:16 PM
    Author     : diegonarvaez--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="js/functions.js"></script>
        <title>Calculadora</title>
    </head>
    <body>
    <center> <h1>JSP´s y Servlets</h1></center>
    <center>
        <img src="imagenes/diego.jpeg">

        <p>Alumno: Narváez Barete Diego</p>

        <fieldset style="border:2px solid green; width:400px">
            <legend> Configurar </legend>
            <form name='formulario' action="prueba_logica" method="post" id="form">

                <table border="1" width="100%">
                    <tr>
                        <td  width="100%">
                            Ingrese compra: 
                        </td>
                    </tr>

                    <tr>                
                        <td  width="100%">
                            <textarea id="texto" form="form" name="texto"></textarea>
                        </td>
                    </tr>
                    
                        <tr>
                        <td  width="100%">
                            Ingrese pago: 
                        </td>
                    </tr>

                    <tr>                
                        <td  width="100%">
                            <textarea id="texto2" form="form" name="texto2"></textarea>
                        </td>
                    </tr>

                    <tr>
                        <td width="30%">
                            <input type="submit" value="aceptar" name="btnAceptar" id="button">

                        </td>
                        <td>
                            <input type="reset" value="Nuevo" name="btnLimpiar" onclick="reset()" id="button">
                        </td>
                    </tr>
                </table>
                </center>
            </form>

        </fieldset>
    </body>
</html>
