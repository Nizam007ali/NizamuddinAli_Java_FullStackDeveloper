<%-- 
    Document   : UpdPro
    Created on : 10 Nov 2024, 2:51:01 pm
    Author     : nizam
--%>

<%@page import="com.nizam.Dao.Admin"%>
<%@page import="com.nizam.beans.ProductBeans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="AddPro.css">
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
    <%
    String id = request.getParameter("id");
    Admin a = new Admin();
    ProductBeans pb = a.Pro(id);
    %>
    <div class="box">
        <form action="AdminControl.jsp" class="f">
            <div class="a">Update Products</div>
            <input type="text" value="UpdPro" name="val" hidden=""><br>
            <input type="text" value="<%=pb.getPid()%>" name="id" hidden><br>
            <input type="text"  value="<%=pb.getPname()%>" name="nm"><br>
            <span class="text">Product type</span><select name="ptype">
                <option value="Mobile">Mobile</option>
                <option value="Laptop">Laptop</option>
                <option value="Bikes">BIke</option>
                <option value="Books">Book</option>
            </select>
            <input type="text" value="<%=pb.getPdes()%>" name="desc"><br>
            <input type="text" value="<%=pb.getPrice()%>" name="pr"><br>
            <input class="sub" type="submit" value="Add">
        </form>
    </div>
</body>

</html>