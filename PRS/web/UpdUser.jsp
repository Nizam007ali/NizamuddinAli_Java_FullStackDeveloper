<%-- 
    Document   : UpdUser
    Created on : 10 Nov 2024, 11:30:47 am
    Author     : nizam
--%>

<%@page import="com.nizam.beans.UserBeans"%>
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
        <%
        Admin a = new Admin();
        UserBeans ub = a.User(request.getParameter("id"));
        %>
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
                <div class="a">Update User</div>
                <input type="text" value="UpdUser" name="val" hidden=""><br>
                <input type="text" value="<%=ub.getId()%>" name="id" hidden><br>
                <input type="text" value="<%=ub.getName()%>" name="nm"><br>
                <input type="text" value="<%=ub.getEmail()%>" name="em"><br>
                <input type="text" value="<%=ub.getPhone()%>" name="pn"><br>
                <input type="text" value="<%=ub.getPassword()%>" name="pw"><br>
                <input class="sub" type="submit" value="Update">
            </form>
        </div>
    </body>
</html>
