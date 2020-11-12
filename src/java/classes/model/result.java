/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.model;

import classes.model.funtions.Cinta_metrica;
import classes.model.funtions.Cobranzas;
import classes.model.funtions.Cronómetro;
import classes.model.funtions.Data;
import classes.model.funtions.Termometro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author diegonarvaez
 */
@WebServlet(name = "result", urlPatterns = {"/result"})
public class result extends HttpServlet {

    private double valor2;
    private double valor;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        int result = Integer.parseInt(request.getParameter("OS"));

        System.out.println("Si entro: " + result);

        try {

            valor = Double.parseDouble(request.getParameter("texto"));
            System.out.println(valor);

          //  valor2 = Double.parseDouble(request.getParameter("numero"));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        String llave = request.getParameter("opcion");

        System.out.println("Este valor es que opcion va"+result +  "Este valor es"+llave);

        double resultado = 0.0;
        double[] array = new double[2];

        switch (llave) {
            case "cronometro": {
                Cronómetro cronometro = new Cronómetro();

                switch (result) {
                    case 0: {
                        resultado = cronometro.convertSecondToMinutes(valor);
                        break;
                    }
                    case 1: {
                        resultado = cronometro.convertSecondToHours(valor);
                        break;
                    }
                    case 2: {
                        resultado = cronometro.convertMinutesToSeconds(valor);
                        break;
                    }
                    case 3: {
                        resultado = cronometro.convertMinutesToHours(valor);
                        break;
                    }
                    case 4: {
                        resultado = cronometro.convertHoursToSeconds(valor);
                        break;
                    }
                    case 5: {
                        resultado = cronometro.convertHoursToMinutes(valor);
                        break;
                    }
                }

                break;
            }

            case "cinta_metrica": {
                Cinta_metrica cinta = new Cinta_metrica();
                switch (result) {
                    case 0: {
                        resultado = cinta.convertCmToM(valor);
                        break;
                    }
                    case 1: {
                        resultado = cinta.convertCmToKm(valor);
                        break;
                    }
                    case 2: {
                        resultado = cinta.convertMToCm(valor);
                        break;
                    }
                    case 3: {
                        resultado = cinta.convertMToKm(valor);
                        break;
                    }
                    case 4: {
                        resultado = cinta.convertKmToCm(valor);
                        break;
                    }
                    case 5: {
                        resultado = cinta.convertKmToM(valor);
                        break;
                    }
                }
                break;
            }

            case "termometro": {
                Termometro term = new Termometro();
                switch (result) {
                    case 0: {
                        resultado = term.convertFahrenheitToCelsius(valor);
                        break;
                    }
                    case 1: {
                        resultado = term.convertCelsiusToFahrenheit(valor);
                        break;
                    }
                    case 2: {
                        resultado = term.convertFahrenheitToKelvin(valor);
                        break;
                    }
                    case 3: {
                        resultado = term.convertKelvinToFahrenheit(valor);
                        break;
                    }
                }
                break;
            }

            case "cobranza": {
                Cobranzas cobra = new Cobranzas();
                switch (result) {
                    case 0: {
                        resultado = cobra.cajaRegistradora(valor, valor2);
                        break;
                    }
                    case 1: {
                        array = cobra.descuento(valor);  
                        break;
                    }
                    case 2: {
                        array =   cobra.comision(valor);
                        break;
                    }
                }

                break;
            }
        }

        String resultado2 = "Descuento ";

      
            
            for (double item : array) {
                resultado2 += "valor: " + item+ "\n" ;
            }

     

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet result</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El resultado es: " + resultado2 + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
