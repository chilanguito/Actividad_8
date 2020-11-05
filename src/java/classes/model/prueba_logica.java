/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.model;

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
@WebServlet(name = "prueba_logica", urlPatterns = {"/prueba_logica"})
public class prueba_logica extends HttpServlet {

    private int v1, v2, res;
    private String opcion, op;

    private String textArea, radiobutton;

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

        textArea = request.getParameter("texto");
        v1 = Integer.parseInt(request.getParameter("fondo"));
        v2 = Integer.parseInt(request.getParameter("textcolor"));
        radiobutton = request.getParameter("radio1");

        System.out.println("VAlor de Text area " + textArea);
        System.out.println("VAlor de v1 " + v1);
        System.out.println("VAlor de v2 " + v2);
        System.out.println("VAlor de radiobutton " + radiobutton);

        Logica obj = new Logica();

        String colorFondo = obj.getBackground(v1);
        String colorTexto = obj.getColor(v2);

        String style = obj.getStyle(radiobutton);
        System.out.println("VAlor de Style " + style);

        System.out.println("VAlor de coloFondo:  " + colorFondo);
        System.out.println("VAlor ColorTexto " + colorTexto);

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet prueba_logica</title>");
            out.println("</head>");
            out.println(colorFondo);
            out.println("<center><img src='imagenes/diego.jpeg' width='200px'> <p>Alumno: Narváez Barete Diego</p></center>");

            out.println("<center><table border='1' width='400px'>");
            out.println("<tr><td><p>Detalles</p></td></tr>");
            out.println("<tr><td><marquee>" + colorTexto + "  <"+style+">" + textArea + " </"+style+"></p></marquee></td></tr>");

            out.println("<tr><td><p>Para realizar una nueva operacion <br> da click en el siguiente hipervinculo</p></td></tr>");

            out.println("<tr><td><center><a href='index.jsp'> Nuevo </a></center></td></tr> </table></center>");

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
