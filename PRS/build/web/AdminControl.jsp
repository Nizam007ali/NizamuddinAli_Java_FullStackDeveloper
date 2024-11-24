<%-- 
    Document   : AdminControl
    Created on : 10 Nov 2024, 11:13:17 am
    Author     : nizam
--%>

<%@page import="com.nizam.beans.ProductBeans"%>
<%@page import="com.nizam.Dao.Admin"%>
<%@page import="com.nizam.beans.UserBeans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String val = request.getParameter("val");
            String em = request.getParameter("em");
            String pw = request.getParameter("pw");
            if (val.equals("login")) {
                Admin a = new Admin();
                if (a.login(em, pw) > 0) {
                    response.sendRedirect("ViewPro.jsp");
                    session.setAttribute("em", em);
                } else {
                    out.println("Login failed");
                }
            }
            if (val.equals("AddUser")) {
                UserBeans ub = new UserBeans();
                ub.setEmail(request.getParameter("em"));
                ub.setName(request.getParameter("nm"));
                ub.setPassword(request.getParameter("pw"));
                ub.setPhone(request.getParameter("pn"));
                Admin a = new Admin();
                int r = a.AddUser(ub);
                if (r > 0) {
                    response.sendRedirect("AdminUser.jsp");
                } else {
                    out.println("User not Added");
                }
            }
            if (val.equals("UpdUser")) {
                UserBeans ub = new UserBeans();
                ub.setEmail(request.getParameter("em"));
                ub.setName(request.getParameter("nm"));
                ub.setPassword(request.getParameter("pw"));
                ub.setPhone(request.getParameter("pn"));
                ub.setId(request.getParameter("id"));
                Admin a = new Admin();
                int r = a.UpdUser(ub);
                if (r > 0) {
                    response.sendRedirect("AdminUser.jsp");
                } else {
                    out.println("User not Updated");
                }
            }
            if (val.equals("del")) {
                String id = request.getParameter("id");
                Admin a = new Admin();
                int r = a.DeleteUser(id);
                if (r > 0) {
                    response.sendRedirect("AdminUser.jsp");
                } else {
                    out.println("User not Deleted");
                }
            }
            if (val.equals("AddPro")) {
                String id = request.getParameter("id");
                ProductBeans pb = new ProductBeans();
                pb.setPdes(request.getParameter("desc"));
                pb.setPname(request.getParameter("nm"));
                pb.setPrice(request.getParameter("pr"));
                pb.setPtype(request.getParameter("ptype"));
                Admin a = new Admin();
                int r = a.AddPro(pb);
                if (r > 0) {
                    response.sendRedirect("ViewPro.jsp");
                } else {
                    out.println("Product not Added");
                }
            }
            if (val.equals("UpdPro")) {
                String id = request.getParameter("id");
                ProductBeans pb = new ProductBeans();
                pb.setPid(request.getParameter("id"));
                pb.setPdes(request.getParameter("desc"));
                pb.setPname(request.getParameter("nm"));
                pb.setPrice(request.getParameter("pr"));
                pb.setPtype(request.getParameter("ptype"));
                Admin a = new Admin();
                int r = a.UpdPro(pb);
                if (r > 0) {
                    response.sendRedirect("ViewPro.jsp");
                } else {
                    out.println("Product not Updated");
                }
            }
            if (val.equals("DelPro")) {
                String id = request.getParameter("id");
                Admin a = new Admin();
                int r = a.DelPro(id);
                if (r > 0) {
                    response.sendRedirect("ViewPro.jsp");
                } else {
                    out.println("Product not Added");
                }
            }
            if (val.equals("AEditOrder")) {
                String oid = request.getParameter("oid");
                String status = request.getParameter("status");
                Admin a = new Admin();
                int r = a.UpdOrder(oid, status);
                if(r>0) response.sendRedirect("AdminOrder.jsp");
                else out.println("Error");
            }
        %>
    </body>
</html>
