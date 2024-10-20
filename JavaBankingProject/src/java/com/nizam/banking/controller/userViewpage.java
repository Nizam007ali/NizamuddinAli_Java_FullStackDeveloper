/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.nizam.banking.controller;

import com.nizam.banking.Bean.AccountBean;
import com.nizam.banking.DAO.Account;
import com.nizam.banking.DAO.Admin;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author nizam
 */
public class userViewpage extends HttpServlet {

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
            out.println("<title>Servlet userViewpage</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='main>");
            out.println("<form action=''>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>Account Number</th><th>Name</th><th>Balance</th><th>Pin</th><th>Credit</th><th>Debit</th><th>Update</th><th>Delete</th>");
            out.println("</tr>");
            Admin a = new Admin();
            ArrayList<AccountBean> al = a.AllAccount();
            for(AccountBean ab:al){
            out.println("<tr>");
            out.println("<th>"+ab.getAccno()+"</th><th>"+ab.getCusnm()+"</th><th>"+ab.getBal()+"</th><th>"+ab.getPin()+"</th><th><button><a href='AdminUserCredit?acc="+ab.getAccno()+"'>CREDIT</a></button></th><th><button><a href='AdminUserDebit?acc="+ab.getAccno()+"'>DEBIT</a></button></th><th><button><a href='AdminUserUpdate?acc="+ab.getAccno()+"'>UPDATE</a></button></th><th><button><a href='AdminUserDeleteControl?acc="+ab.getAccno()+"'>DELETE</a></button></th>");
            out.println("</tr>");    
            }
            out.println("</table>");
            out.println("</form>");
            out.println("<button><a href='UserAdd'>Add User</button>");
            out.println("<button><a href='AdminControl?an=root&pin=1234'>Return</button>");
            out.println("</div>");
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
