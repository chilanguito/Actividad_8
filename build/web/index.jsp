<%-- 
    Document   : index
    Created on : 3/11/2020, 01:05:16 PM
    Author     : diegonarvaez
--%>

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
                            Texto: 
                        </td>
                    </tr>

                    <tr>
                         <td  width="100%">
                             <textarea id="texto" form="form" name="texto"></textarea>
                        </td>
                    </tr>

                    <tr>
                        <td width="30%">
                            Color de fondo: 
                        </td>

                        <td>
                            <select name="fondo">
                                <option value="0">Blanco</option>
                                <option value="1">Negro</option>
                                <option value="2">Azul</option>
                                <option value="3">Verde</option>
                                <option value="4">Amarillo</option>
                            </select>
                        </td>
                    </tr>

                    <tr>
                        <td width="30%">
                            Color de texto: 
                        </td>

                        <td>
                            <select name="textcolor">
                                <option value="0">Blanco</option>
                                <option value="1">Negro</option>
                                <option value="2">Azul</option>
                                <option value="3">Verde</option>
                                <option value="4">Amarillo</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Efecto:
                        </td>
                    </tr>
                </table>
                    
                <table>
                    <tr>
                        <td width="100%">
                            <br>
                               
                                <input type="radio" name="radio1" placeholder="negrita" value="negrita">
                                Negrita
                                <br>
                                <input type="radio" name="radio1" placeholder="subrayado" value="subrayado">
                                Subrayado
                                <br>
                                <input type="radio" name="radio1" placeholder="negrita" value="cursiva">
                                Cursiva
                                <br>
                                <input type="radio" name="radio1" placeholder="negrita" value="tachado">
                                Tachado
                          
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
