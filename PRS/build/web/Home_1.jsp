<%-- 
    Document   : Home
    Created on : 9 Nov 2024, 4:50:35 pm
    Author     : nizam
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.nizam.beans.ProductBeans"%>
<%@page import="com.nizam.Dao.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Home.css">
    </head>

    <body>
        <%
            String em = (String) session.getAttribute("em");
            if (session.getAttribute("em") != null) {
        %>

        <script>
            var cnt = localStorage.getItem('<%=em%>');
            if (cnt === null)
                cnt = 0;
            var cnt1 = localStorage.getItem('<%=em%>1');
            if (cnt1 === null)
                cnt1 = 0;
            function run() {
                document.getElementById("val").innerHTML = cnt;
                document.getElementById("val1").innerHTML = cnt1;
            }
            setInterval(run, 1);
            function all() {
                alert('all');
            }
            function fun() {
                alert('fun');
            }
        </script>
        <nav class="navbar">
            <div class="i1"><img src="image/index/logo.png" alt=""></div>
            <ul>
                <li><a href="Home.jsp">Home</a></li>
                <li>
                    <div class="p">
                        <li>All</li>
                        <li>Mobile</li>
                        <li>Laptop</li>
                        <li>Bikes</li>
                        <li>Books</li>
                    </div>
                </li>
                <li><a href="Order.jsp">Orders<span class="cval" id="val1">0</span></a></li>
                <li><a href="Cart.jsp">Cart<span class="cval" id="val">0</span></a></li>
                <li><a href="UserControl.jsp?val=logout">Logout</a></li>
                <li><a href="">Contact Us</a></li>
            </ul>
        </nav>
        <div class="box">
            <div class="par">
                <%
                    Admin a = new Admin();
                    ArrayList<ProductBeans> al = a.AllPro();
                    for (ProductBeans pb : al) {
                %>
                <div class="ch"><img class="i" src="image/Product/<%=pb.getPid()%>.jpg" ></div>
                <div class="ch"><%=pb.getPname()%></div>
                <div class="ch"><%=pb.getPdes()%></div>
                <div class="ch"><%=pb.getPrice()%></div>
                <!--<div class="ch" id="Pcnt"><input type="text" value="" placeholder="must be greater than 0"></div>-->
                <div class="ch"><a href="UserControl.jsp?val=AddCart&pid=<%=pb.getPid()%>&em=<%=em%>">Add to Cart</a></div>
                <%
                    }
                %>
            </div>
        </div>
        <%
        } else {
        %>
        <nav class="navbar">
            <div class="i1"><img src="image/index/logo.png" alt=""></div>
            <ul>
                <li><a href="Home.jsp">Home</a></li>
                <li>
                    <select name="pro" id="">
                        <option value="" selected>All</option>
                        <option value="">Mobile</option>
                        <option value="">Laptop</option>
                        <option value="">Books</option>
                        <option value="">Bikes</option>
                    </select>
                </li>
                <li><a href="UserLogin.jsp">Orders</a></li>
                <li><a href="UserLogin.jsp">Cart</a></li>
                <li><a href="UserLogin.jsp">Login</a></li>
                <li><a href="">Contact Us</a></li>
            </ul>
        </nav>
        <div class="box">
            <div class="par">
                <%
                    Admin a = new Admin();
                    ArrayList<ProductBeans> al = a.AllPro();
                    for (ProductBeans pb : al) {
                %>
                <div class="ch"><img class="i" src="image/Product/<%=pb.getPid()%>.jpg" ></div>
                <div class="ch"><%=pb.getPname()%></div>
                <div class="ch"><%=pb.getPdes()%></div>
                <div class="ch"><%=pb.getPrice()%></div>
                <div class="ch"><a href="UserLogin.jsp">Add to Cart</a></div>
                <%
                    }
                %>
            </div>
        </div>
        <%
            }
        %>
    </body>

</html>