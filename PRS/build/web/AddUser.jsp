<%-- 
    Document   : AddUser
    Created on : 10 Nov 2024, 10:54:35 am
    Author     : nizam
--%>

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
                <div class="a">Add User</div>
                <input type="text" value="AddUser" name="val" hidden=""><br>
                <input type="text" placeholder="Enter user name" name="nm"><br>
                <input type="text" placeholder="Enter user e-mail" name="em"><br>
                <input type="text" placeholder="Enter user phone" name="pn"><br>
                <input type="text" placeholder="Enter user password" name="pw"><br>
                <input class="sub" type="submit" value="Add">
            </form>
        </div>
    </body>
</html>
