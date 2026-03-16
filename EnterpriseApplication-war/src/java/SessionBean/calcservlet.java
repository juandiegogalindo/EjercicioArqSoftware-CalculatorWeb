/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jdgal
 */
public class calcservlet extends HttpServlet {

    @EJB
    private caculatorLocal calcbean;

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
            out.println("<title>Servlet calcservlet</title>");
            out.println("</head>");
            out.println("<body>");
            // SUMA
            String op1 = request.getParameter("t1");
            String op2 = request.getParameter("t2");
            if (op1 != null && op2 != null) {
                int a = Integer.parseInt(op1);
                int b = Integer.parseInt(op2);
                out.println("<h1>SUMA: " + calcbean.addition(a, b) + "</h1>");
            }
            // RESTA
            String op3 = request.getParameter("t3");
            String op4 = request.getParameter("t4");
            if (op3 != null && op4 != null) {
                int a = Integer.parseInt(op3);
                int b = Integer.parseInt(op4);
                out.println("<h1>RESTA: " + calcbean.resta(a, b) + "</h1>");
            }
            // MULTIPLICACION
            String op5 = request.getParameter("t5");
            String op6 = request.getParameter("t6");
            if (op5 != null && op6 != null) {
                int a = Integer.parseInt(op5);
                int b = Integer.parseInt(op6);
                out.println("<h1>MULTIPLICACION: " + calcbean.multiplicar(a, b) + "</h1>");
            }
            // DIVICION
            String op7 = request.getParameter("t7");
            String op8 = request.getParameter("t8");
            if (op7 != null && op8 != null) {
                int a = Integer.parseInt(op7);
                int b = Integer.parseInt(op8);
                out.println("<h1>DIVICION: " + calcbean.dividir(a, b) + "</h1>");
            }
            // MODULO
            String op9 = request.getParameter("t9");
            String op10 = request.getParameter("t10");
            if (op9 != null && op10 != null) {
                int a = Integer.parseInt(op9);
                int b = Integer.parseInt(op10);
                out.println("<h1>MODULO: " + calcbean.modulo(a, b) + "</h1>");
            }
            // ELEVADO
            String op11 = request.getParameter("t11");
            if (op11 != null) {
                int a = Integer.parseInt(op11);
                out.println("<h1>ELEVADO: " + calcbean.elevado(a) + "</h1>");
            }
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
