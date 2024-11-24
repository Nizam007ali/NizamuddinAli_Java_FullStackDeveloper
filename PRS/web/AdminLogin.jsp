<%-- 
    Document   : AdminLogin
    Created on : 9 Nov 2024, 4:51:21 pm
    Author     : nizam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login Page</title>
        <link rel="stylesheet" href="ALogin.css">
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
                <div class="a">Admin Login</div>
                <input type="text" value="login" name="val" hidden><br>
                <input type="text" placeholder="Enter your e-mail" name="em"><br>
                <input type="text" placeholder="Enter your password" name="pw"><br>
                <input class="sub" type="submit" value="Login">
            </form>
        </div>
    </body>

</html>