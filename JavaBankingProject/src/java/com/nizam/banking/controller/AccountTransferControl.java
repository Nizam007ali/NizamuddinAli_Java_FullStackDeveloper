/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.nizam.banking.controller;

import com.nizam.banking.DAO.Account;
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
public class AccountTransferControl extends HttpServlet {

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
            out.println("<title>Servlet AccountTransferControl</title>");
            out.println("</head>");
            out.println("<body>");
            Account acc = new Account();
            String a = request.getParameter("acc");
            String ta = request.getParameter("toacc");
            float b = Float.parseFloat(request.getParameter("amt"));
            if (a.equals(ta)) {
                out.println("<h1>Both account must be different</h1>");
            } else {
                if (acc.checkAccount(a) == 1) {
                    if (acc.checkAccount(ta) == 1) {
                        if (acc.checkAccountBalance(a, b) == 1) {
                            if (acc.transferBalance(a, ta, b) == 1) {
                                out.println("<h1>Money has been transfered.</h1>");
                            } else {
                                out.println("<h1>Server busy.</h1>");

                            }
                        } else {
                            out.println("<h1>Don't have enough balance.</h1>");
}
                    } else {
                        out.println("<h1>Invalid Reciever.</h1>");
                    }
                } else {
                    out.println("<h1>Invalid Payer.</h1>");
                }
            }
            out.println("<button><a href='usercontrol?an="+a+"&pin="+acc.getPin(a)+"'>Return</button>");
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
