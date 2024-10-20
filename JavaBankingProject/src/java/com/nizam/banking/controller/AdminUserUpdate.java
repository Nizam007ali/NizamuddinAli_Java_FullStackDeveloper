/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.nizam.banking.controller;

import com.nizam.banking.Bean.AccountBean;
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
public class AdminUserUpdate extends HttpServlet {

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
            out.println("<title>Servlet AdminUserUpdate</title>");
            out.println("</head>");
            out.println("<body>");
            String acc = request.getParameter("acc");
            Admin a = new Admin();
            AccountBean ab = a.getAccount(acc);
            out.println("<div class='main'>");
            out.println("<form action='AdminUserUpdateControl'>");
            out.println("<table>");
            out.println("<tr><td>Account Number </td><td><input type='text' name='ano' value='"+ab.getAccno()+"' readonly></td></tr>");
            out.println("<tr><td>Customer Name </td><td><input type='text' name='cnm' value='"+ab.getCusnm()+"'></td></tr>");
            out.println("<tr><td>Balance </td><td><input type='text' name='bal' value='"+ab.getBal()+"'></td></tr>");
            out.println("<tr><td>Pin </td><td><input type='text' name='pin' value='"+ab.getPin()+"'></td></tr>");
            out.println("<tr><td></td><td><input type='Submit' name='submit'></td></tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</div>");
            out.println("<button><a href='userViewpage'>Back</a></button>");
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
