/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.nizam.banking.controller;

import com.nizam.banking.DAO.Admin;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author nizam
 */
public class admincontroller extends HttpServlet {

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
            out.println("<title>Servlet admincontroller</title>");
            out.println("</head>");
            out.println("<body>");
            Admin a = new Admin();
            String an = request.getParameter("an");
            String ap = request.getParameter("ap");
            int r = a.adminLogin(an, ap);
            if (r > 0) {
                out.println("<div class='traAcc'>");
                out.println("<form action='AccountTransferControl'>");
                out.println("<table style='background-color: aqua;width: 30%;padding: 20px; margin-left: 35%;'>");
                out.println("<tr><td><label>Account Number</label></td><td><input type='text' name='acc'></td></tr>");
                out.println("<tr><td><label>To Account Number</label></td><td><input type='text' name='toacc'></td></tr>");
                out.println("<tr><td><label>Amount</label></td><td><input type='text' name='amt'></td></tr>");
                out.println("<tr><td></td><td><input type='Submit' name='Transfer'></td></tr>");
                out.println("</table>");
                out.println("</form>");
                out.println("</div>");
            } else {
                out.println("<h1>Login Failed</h1>");
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
