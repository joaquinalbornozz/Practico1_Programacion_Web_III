/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author users
 */
public class Ejercicio4 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio4</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ejercicio4 at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>\n" + "<meta charset=\"UTF-8\">\n"
                + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "<link rel=\"stylesheet\" href=\"css/styles.css\">\n"
                + "</head>\n"
        );
        out.println("<body bgcolor=\"#ffffff\">"
                + "<img src=\"duke.png\" alt=\"Duke no esta....\">"
                + "<h2>Hola, mi nombre is Duke. Cual es tu nombre?</h2>"
                + "<form method=\"get\">"
                + "<input type=\"text\" name=\"nombre\" size=\"25\">" + "<p></p>"
                + "<h2 >¿Cual es tu hobby?</h2>" + "<p></p>"
                + "<input type=\"text\" name=\"hobby\" size=\"25\">" + "<p></p>"
                + "<input type=\"submit\" value=\"Enviar\">"
                + "<input type=\"reset\" value=\"ReIniciar\">" + "</form>");
        String nombre = request.getParameter("nombre");
        String hobby = request.getParameter("hobby");

        if (((nombre != null) && (nombre.length() > 0) &&(hobby != null) && (nombre.length() > 0))) {
            //out.println(nombre);
            RequestDispatcher dispatcher
                    = getServletContext()
                            .getRequestDispatcher("/respuesta");
            if (dispatcher != null) {
                dispatcher.include(request, response);
            }
        }
        out.println("</body></html>");
        out.close();
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
