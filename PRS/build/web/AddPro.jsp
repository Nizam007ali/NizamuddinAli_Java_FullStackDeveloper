<%-- 
    Document   : AddPro
    Created on : 10 Nov 2024, 12:03:55 pm
    Author     : nizam
--%>

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
    <div class="box">
        <form action="AdminControl.jsp" class="f">
            <div class="a">Add Products</div>
            <input type="text" value="AddPro" name="val" hidden=""><br>
            <input type="text" placeholder="Enter product name" name="nm"><br>
            <span class="text">Product type</span><select name="ptype">
                <option value="Mobile">Mobile</option>
                <option value="Laptop">Laptop</option>
                <option value="Bikes">BIke</option>
                <option value="Books">Book</option>
            </select>
            <textarea name="desc" id="" placeholder="Enter Product description""></textarea>
            <input type="text" placeholder="Enter product price" name="pr"><br>
            <input class="sub" type="submit" value="Add">
        </form>
    </div>
</body>

</html>