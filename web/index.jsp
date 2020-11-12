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
            <legend> Elige una opción </legend>
            <form name='formulario' action="prueba_logica" method="post" id="form">

                <table border="1" width="100%">
                    <tr>
                        <td  width="100%">
                            Selecciona el ejercicio
                        </td>
                    </tr>

                    <tr>                
                        <td  width="100%">
                            <input type="radio" id="other" name="other" value="cronometro">
                            <label for="other">Cronometro</label>
                        </td>
                    </tr>

                    <tr>
                        <td  width="100%">
                                 <input type="radio" id="other" name="other" value="cinta_metrica">
                            <label for="other">Cinta metrica</label>
                        </td>
                    </tr>

                    <tr>                
                        <td  width="100%">
                                 <input type="radio" id="other" name="other" value="termometro">
                            <label for="other">Termometro</label>
                        </td>
                    </tr>

                    <tr>
                       <td  width="100%">
                                 <input type="radio" id="other" name="other" value="cobranza">
                            <label for="other">Cobranza</label>
                        </td>
                    </tr>
                    
                    
                    <tr>
                       <td width="30%">
                            <input type="submit" value="aceptar" name="btnAceptar">

                        </td>
                        <td>
                            <input type="reset" value="Nuevo" name="btnLimpiar" onclick="reset()">
                        </td>
                        
                        
                    </tr>
                    
                    
                </table>
                </center>
            </form>

        </fieldset>
    </body>
</html>
