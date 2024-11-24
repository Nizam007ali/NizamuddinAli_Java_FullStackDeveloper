<%-- 
    Document   : Cart
    Created on : 11 Nov 2024, 9:37:03 am
    Author     : nizam
--%>

<%@page import="com.nizam.beans.CartBeans"%>
<%@page import="com.nizam.Dao.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.nizam.beans.ProductBeans"%>
<%@page import="com.nizam.Dao.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Cart.css">
    </head>
    <body>
        <%
            String em = (String) session.getAttribute("em");
            if (session.getAttribute("em") != null) {
        %>
        <nav class="navbar">
            <div class="i1"><img src="image/index/logo.png" alt=""></div>
            <ul>
                <li><a href="Home.jsp?value=al1">Home</a></li>
                <li><a href="Order.jsp">Orders<span class="cval" id="val1">0</span></a></li>
                <li><a href="">Cart<span class="cval" id="val">0</span></a></li>
                <li><a href="UserControl.jsp?val=logout">Logout</a></li>
                <li><a href="">Contact Us</a></li>
            </ul>
        </nav>
        <div class="box">
            <div class="par">
                <%
                    Admin a = new Admin();
                    User u = new User();
                    int tPrice = 0;
                    int Ccnt = 0;
                    ArrayList<CartBeans> al = u.AllUserCart(em);
                    for (CartBeans cb : al) {
                        System.out.println(cb);
                        String cid = u.Cid(cb.getEmail(), cb.getPid());
                        int total = Integer.parseInt(cb.getPrice()) * Integer.parseInt(cb.getNum());
                        tPrice += total;
                        Ccnt += Integer.parseInt(cb.getNum());
                %>
                <div class="ch"><img class="i" src="image/Product/<%=cb.getPid()%>.jpg" ></div>
                <div class="ch"><%=cb.getPname()%></div>
                <!--<div class="ch"><%=cb.getPdes()%></div>-->
                <div class="ch"><%=cb.getPrice()%></div>
                <div class="ch"><a class="a2" href="UserControl.jsp?val=sNum&cid=<%=cid%>" style="padding: 0.5vw;">-</a></div>
                <div class="ch"><%=cb.getNum()%></div>
                <div class="ch"><a class="a2" href="UserControl.jsp?val=aNum&cid=<%=cid%>" style="padding: 0.5vw;">+</a></div>
                <div class="ch"><%=total%></div>
                <div class="ch"><a class="a2" href="UserControl.jsp?val=Order&cid=<%=cid%>">Order</a></div>
                <%
                    }
                %>
                <div class="ch ch4" style="">Total Order</div>
                <div class="ch ch5" style="border: 2px solid black;"><%=tPrice%></div>
                <div class="ch ch6"><a class="a1" href="UserControl.jsp?val=AllOrder&em=<%=em%>">Order All</a></div>
                <script>
                    localStorage.setItem('<%=em%>',<%=Ccnt%>);
                    var cnt = localStorage.getItem('<%=em%>');
                    var cnt1 = localStorage.getItem('<%=em%>1');
                    if (cnt === null)
                        cnt = 0;
                    if (cnt1 === null)
                        cnt1 = 0;
                    function run() {
                        document.getElementById("val").innerHTML = cnt;
                        document.getElementById("val1").innerHTML = cnt1;
                    }
                    setInterval(run, 1);

                </script>
            </div>
        </div>
        <%
        } else {
        %>
        <nav class="navbar">
            <div class="image"><img src="image/index/logo.png" alt=""></div>
            <ul>
                <li><a href="Home.jsp?value=al1">Home</a></li>
                <li><a href="UserLogin.jsp">Orders</a></li>
                <li><a href="UserLogin.jsp">Cart<span class="cval" id="val">0</span></a></li>
                <li><a href="UserLogin.jsp">Login</a></li>
                <li><a href="">Contact Us</a></li>
            </ul>
        </nav>
        <div class="box">
            <h1>You Must Login.</h1>
        </div>
        <%
            }
        %>
    </body>

</html>