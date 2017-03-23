/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guilherme
 */
@WebServlet(name = "Questao012", urlPatterns = {"/questao012"})
public class Questao012 extends HttpServlet {

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
        //Nome
        String n1 = String.valueOf(request.getParameter("nome1"));
        String n2 = String.valueOf(request.getParameter("nome2"));
        String n3 = String.valueOf(request.getParameter("nome3"));
        String n4 = String.valueOf(request.getParameter("nome4"));
        String n5 = String.valueOf(request.getParameter("nome5"));
        
        //Idade
        int i1 = Integer.valueOf(request.getParameter("idade1"));
        int i2 = Integer.valueOf(request.getParameter("idade2"));
        int i3 = Integer.valueOf(request.getParameter("idade3"));
        int i4 = Integer.valueOf(request.getParameter("idade4"));
        int i5 = Integer.valueOf(request.getParameter("idade5"));
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Questao011</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado</h1>");
         
          int soma;
        
          soma = i1+i2+i3+i4+i5;
          out.println("A soma das idades é:" +soma);
          
          if (i1>i2 && i1>i3 && i1>i4 && i1>i5)
            out.println("<br>A pessoa com maior idade é :"+n1 +" e sua idade é " +i1);
          else if
          (i2>i1 && i2>i3 && i2>i4 && i2>i5)
            out.println("<br>A pessoa com maior idade é :"+n2 +" e sua idade é " +i2); 
           else if
          (i3>i1 && i3>i2 && i3>i4 && i4>i5)
            out.println("<br>A pessoa com maior idade é :"+n3 +" e sua idade é " +i3); 
          else if
          (i4>i1 && i4>i2 && i4>i4 && i4>i5)
            out.println("<br>A pessoa com maior idade é :"+n4 +" e sua idade é " +i4);
	  else if
          (i5>i1 && i5>i2 && i5>i4 && i5>i3)
            out.println("<br>A pessoa com maior idade é :"+n5 +" e sua idade é " +i5);
            
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
