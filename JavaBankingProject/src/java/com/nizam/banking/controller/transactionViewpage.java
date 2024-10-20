/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.nizam.banking.controller;

import com.nizam.banking.Bean.TransactionBean;
import com.nizam.banking.DAO.Account;
import com.nizam.banking.DAO.Admin;
import com.nizam.banking.utility.ConnectionPool;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nizam
 */
public class transactionViewpage extends HttpServlet {

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
            out.println("<title>Servlet transactionViewpage</title>");
            out.println("</head>");
            out.println("<body>");
            Admin a = new Admin();
            String a1 = request.getParameter("a1");
            String b1 = request.getParameter("b1");
            String c1 = request.getParameter("c1");
            ArrayList<TransactionBean> al = new ArrayList<>();
            Account ac = new Account();
            if ((a1.equals("acc") || a1.equals("")) && (b1.equals("bacc") || b1.equals("")) && c1.equals("all")) {
                al = a.recentTransaction();
            } else if ((a1.equals("acc") || a1.equals("")) && (b1.equals("bacc") || b1.equals("")) && c1.equals("cre")) {
                al = a.recentCreditTransaction();
            } else if ((a1.equals("acc") || a1.equals("")) && (b1.equals("bacc") || b1.equals("")) && c1.equals("deb")) {
                al = a.recentDebitTransaction();
            } else if ((a1.equals("acc") || a1.equals("")) && (b1.equals("bacc") || b1.equals("")) && c1.equals("tnf")) {
                al = a.recentTransferTransaction();
            } else if ((a1.equals("acc") || a1.equals("")) && (b1 != "bacc" || b1 != "") && (c1.equals("tnf") || c1.equals("all"))) {
                al = a.recentBaccTransferTransaction(b1);
            } else if ((b1.equals("bacc") || b1.equals("")) && (a1 != "acc" || a1 != "") && c1.equals("all")) {
                al = a.recentAccAllTransaction(a1);
            } else if ((b1 != "bacc" || b1 != "") && (a1 != "acc" || a1 != "") && (c1.equals("all"))) {
                al = a.recentAccBaccTnfTransaction(a1, b1);
            } else if ((b1.equals("bacc") || b1.equals("")) && (a1 != "acc" || a1 != "") && c1.equals("tnf")) {
                al = a.recentAccTnfTransaction(a1);
            } else if ((b1.equals("bacc") || b1.equals("")) && (a1 != "acc" || a1 != "") && c1.equals("cre")) {
                al = a.recentAccCreTransaction(a1);
            } else if ((b1.equals("bacc") || b1.equals("")) && (a1 != "acc" || a1 != "") && c1.equals("deb")) {
                al = a.recentAccDebTransaction(a1);
            } else {
                out.println("<h1>Not a valid choice</h1>");
            }
            out.println("<div class='tsn'>");
            out.println("<h1 id='x'>Transaction</h1>");
            out.println("<form action='transactionViewpage'><input type='text' name='a1' placeholder='Account number' value='" + a1 + "'><input type='text' name='b1' value='" + b1 + "' placeholder='Beneficiary Account number'><select id='c1' name='c1'><option value='all'>all</option><option value='tnf'>transfer</option><option value='cre'>credit</option><option value='deb'>debit</option></select><input type='submit' name='submit'></form>");
            out.println("<table style='border: 2px solid ;width:100%;'>");
            out.println("<tr style='height:7vh'><th style='border: 2px solid ;'>Transaction Id</th><th style='border: 2px solid ;'>Account Number</th><th style='border: 2px solid ;'>Benefeciary Account Number</th><th style='border: 2px solid ;'>Type</th><th style='border: 2px solid ;'>Amount</th><th style='border: 2px solid ;'>Date&Time</th></tr>");
            for (TransactionBean tb : al) {
                out.println("<tr style='height:7vh'><td style='border: 2px solid ;padding-left:1vw;'>" + tb.getTId() + "</td><td style='border: 2px solid ;padding-left:1vw;'>" + tb.getAccNO() + "</td><td style='border: 2px solid ;padding-left:1vw;'>" + tb.getBAccNO() + "</td><td style='border: 2px solid ;padding-left:1vw;'>" + tb.getType() + "</td><td style='border: 2px solid ;padding-left:1vw;'>" + tb.getTAmt() + "</td><td style='border: 2px solid ;padding-left:1vw;'>" + tb.getTD_T() + "</td></tr>");
            }
            out.println("</table>");
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
