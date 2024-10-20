/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.nizam.banking.controller;

import com.nizam.banking.DAO.Account;
import com.nizam.banking.DAO.Admin;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author nizam
 */
public class usercontrol extends HttpServlet {

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
            out.println("<title>Servlet usercontrol</title>");
            out.println("</head>");
            out.println("<body>");
//            HttpSession s1 = request.getSession();String userName = (String) s1.getAttribute("an");
//            if (s1.getAttribute("an") == null) {
//                response.sendRedirect("index.html");
//            }
            Account acc = new Account();
            String a = request.getParameter("an");
            String p = request.getParameter("pin");
            int r = acc.userLogin(a, p);
            if (r > 0) {
                out.println("<div>");
                out.println("<h1>Name : " + acc.getName(a) + "</h1>");
                out.println("<ul style='list-style: none;'>");
                out.println("<li><a href='CheckBalanceControl?id=" + a + "'>Check Balance</a></li>");
                out.println("<li><a href='AccountTransfer?id=" + a + "'>Account Transfer</a></li>");
                out.println("<li><a href='Debit?id=" + a + "''>Debit</a></li>");
                out.println("<li><a href='Credit?id=" + a + "''>Credit</a></li>");
                out.println("<li><a href='PinChange?id=" + a + "''>Pin Change</a></li>");
                out.println("<li><a href='RecentTransaction?a1=" + a + "&c1=all&b1='>Transaction</a></li>");
                out.println("</ul>");
                out.println("</div>");
            } else {
                out.println("<h1>Login Failed</h1>");
            }
            String s = " ";
            out.println("<button><a href='index.html?an=" + s + "&pin=" + s + "'>logout</a></button>");
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
