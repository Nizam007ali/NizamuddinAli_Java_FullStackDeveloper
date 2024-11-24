<%-- 
    Document   : AdminEditOrder
    Created on : 11 Nov 2024, 10:51:43 pm
    Author     : nizam
--%>

<%@page import="com.nizam.beans.OrderBeans"%>
<%@page import="com.nizam.Dao.User"%>
<%@page import="com.nizam.Dao.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="AEOrder.css">
    </head>
    <body>
        <nav class="navbar">
            <div class="image"><img src="image/index/logo.png" alt=""></div>
            <ul>
                <li><a href="AdminUser.jsp">Users</a></li>
                <li><a href="ViewPro.jsp">Products</a></li>
                <li><a href="AdminOrder.jsp">Orders</a></li>
            </ul>
        </nav>
        <div class="box">
            <form action="AdminControl.jsp" class="f">
                <div class="a">Update Order Status</div>
                <%
                    String pid = request.getParameter("pid");
                    String em = request.getParameter("em");
                    Admin a = new Admin();
                    User u = new User();
                    String oid = u.Oid(em, pid);
                    OrderBeans ob = u.AOrder(oid);

                %>
                <input type="text" value="AEditOrder" name="val" hidden=""><br>
                <input type="text" value="<%=ob.getOid()%>" name="oid"><br>
                <input type="text" value="<%=ob.getEmail()%>" name="em"><br>
                <input type="text" value="<%=ob.getPname()%>" name="Pname"><br>

                <select name="status" id="">
                    <option value="Initiated" selected>Initiated</option>
                    <option value="Dispatched">Dispatched</option>
                    <option value="Recieved">Recieved</option>
                    <option value="Returned">Returned</option>
                    <option value="Cancelled">Cancelled</option>
                    <option value="Rejected">Rejected</option>
                </select> <br>
                <input class="sub" type="submit" value="Update">
            </form>
        </div>
    </body>
</html>
