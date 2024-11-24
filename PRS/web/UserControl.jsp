<%-- 
    Document   : UserControl
    Created on : 10 Nov 2024, 9:39:45 pm
    Author     : nizam
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.nizam.beans.OrderBeans"%>
<%@page import="com.nizam.beans.CartBeans"%>
<%@page import="com.nizam.beans.ProductBeans"%>
<%@page import="com.nizam.beans.UserBeans"%>
<%@page import="com.nizam.Dao.Admin"%>
<%@page import="com.nizam.Dao.User"%>
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
            if (val.equals("login")) {
                User u = new User();
                String em = request.getParameter("em");
                String pw = request.getParameter("pw");
                int r = u.login(em, pw);
                if (r > 0) {
                    response.sendRedirect("Home.jsp?value=al1");
                    session.setAttribute("em", em);
                } else {
                    out.println("Unable to login");
                }
            }
            if (val.equals("SignUp")) {
                User u = new User();
                Admin a = new Admin();
                UserBeans ub = new UserBeans();
                ub.setEmail(request.getParameter("em"));
                ub.setName(request.getParameter("nm"));
                ub.setPassword(request.getParameter("pw"));
                ub.setPhone(request.getParameter("pn"));
                int r = a.AddUser(ub);
                if (r > 0) {
                    response.sendRedirect("UserLogin.jsp");
                } else {
                    out.println("Unable to signup");
                }
            }
            if (val.equals("logout")) {
                session.removeAttribute("em");
                response.sendRedirect("Home.jsp");
            }
            if (val.equals("AddCart")) {
                String pid = request.getParameter("pid");
                String em = request.getParameter("em");
                Admin a = new Admin();
                User u = new User();
                UserBeans ub = a.UserByEm(em);
                ProductBeans pb = a.Pro(pid);
                CartBeans cb = new CartBeans();
                String cid = u.Cid(em, pid);
                if (cid != "") {
                    u.aNum(cid);
                    response.sendRedirect("Cart.jsp");
                } else {
                    cb.setEmail(em);
                    cb.setNum("1");
                    cb.setPdes(pb.getPdes());
                    cb.setPid(pid);
                    cb.setPname(pb.getPname());
                    cb.setPrice(pb.getPrice());
                    cb.setPtype(pb.getPtype());
                    int r = u.AddToCart(cb);
                    if (r > 0) {
                        response.sendRedirect("Cart.jsp");
                    } else {
                        out.println("Prduct not added to cart");
                    }
                }
            }
            if (val.equals("aNum")) {
                String cid = request.getParameter("cid");
                User u = new User();
                int r = u.aNum(cid);
                if (r > 0) {
                    response.sendRedirect("Cart.jsp");
                } else {
                    out.println("error");
                }
            }
            if (val.equals("sNum")) {
                String cid = request.getParameter("cid");
                User u = new User();
                int r = u.sNum(cid);
                if (r > 0) {
                    response.sendRedirect("Cart.jsp");
                } else {
                    out.println("error");
                }
            }
            if (val.equals("Order")) {
                String cid = request.getParameter("cid");
                out.println(cid);
                User u = new User();
                CartBeans cb = u.ACart(cid);
                OrderBeans ob = new OrderBeans();
                ob.setEmail(cb.getEmail());
                ob.setNum(cb.getNum());
                ob.setPdes(cb.getPdes());
                ob.setPid(cb.getPid());
                ob.setPname(cb.getPname());
                ob.setPrice(cb.getPrice());
                ob.setPtype(cb.getPtype());
                int r = u.AddOrder(ob, cid);
                if (r > 1) {
                    response.sendRedirect("Order.jsp");
                } else {
                    out.println("error");
                }
            }
            if (val.equals("UCancelOrder")) {
                User u = new User();
                Admin a = new Admin();
                String em = request.getParameter("em");
                String pid = request.getParameter("pid");
                String oid = u.Oid(em, pid);
                int r = a.UpdOrder(oid, "cancelled");
                if (r > 0) {
                    response.sendRedirect("Order.jsp");
                }
            }
            if (val.equals("UReturnOrder")) {
                User u = new User();
                Admin a = new Admin();
                String em = request.getParameter("em");
                String pid = request.getParameter("pid");
                String oid = u.Oid(em, pid);
                int r = a.UpdOrder(oid, "Returned");
                if (r > 0) {
                    response.sendRedirect("Order.jsp");
                }
            }
            if (val.equals("AllOrder")) {
                User u = new User();
                Admin a = new Admin();
                String em = request.getParameter("em");
                ArrayList<CartBeans> al = u.AllUserCart(em);
                for (CartBeans cb : al) {
                    String cid = u.Cid(em, cb.getPid());
                    OrderBeans ob = new OrderBeans();
                    ob.setEmail(cb.getEmail());
                    ob.setNum(cb.getNum());
                    ob.setPdes(cb.getPdes());
                    ob.setPid(cb.getPid());
                    ob.setPname(cb.getPname());
                    ob.setPrice(cb.getPrice());
                    ob.setPtype(cb.getPtype());
                    u.AddOrder(ob, cid);
                }
                response.sendRedirect("Order.jsp");
            }
        %>
    </body>
</html>
