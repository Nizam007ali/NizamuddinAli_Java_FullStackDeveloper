<%-- 
    Document   : Order
    Created on : 11 Nov 2024, 12:01:28 pm
    Author     : nizam
--%>

<%@page import="com.nizam.beans.OrderBeans"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.nizam.beans.CartBeans"%>
<%@page import="com.nizam.Dao.User"%>
<%@page import="com.nizam.Dao.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Order.css">
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
                <li><a href="Cart.jsp">Cart<span class="cval" id="val">0</span></a></li>
                <li><a href="UserControl.jsp?val=logout">Logout</a></li>
                <li><a href="">Contact Us</a></li>
            </ul>
        </nav>
        <div class="box">
            <div class="par">
                <%
                    Admin a = new Admin();
                    User u = new User();
                    int Ocnt = 0;
                    int Ccnt = 0;
                    ArrayList<CartBeans> al1 = u.AllUserCart(em);
                    for (CartBeans cb : al1) {
                        System.out.println(cb);
                        String cid = u.Cid(cb.getEmail(), cb.getPid());
                        int total = Integer.parseInt(cb.getPrice()) * Integer.parseInt(cb.getNum());
                        Ccnt += Integer.parseInt(cb.getNum());
                    }
                    ArrayList<OrderBeans> al = u.AllUserOrder(em);
                    for (OrderBeans ob : al) {
                        String cid = u.Cid(ob.getEmail(), ob.getPid());
                        int total = Integer.parseInt(ob.getPrice()) * Integer.parseInt(ob.getNum());
                        String status = ob.getStatus();
                        if (status.equals("Cancelled") || status.equals("rejected") || status.equals("Recieved")) {

                        } else {
                            Ocnt += Integer.parseInt(ob.getNum());
                        }
                %>
                <div class="ch"><img class="i" src="image/Product/<%=ob.getPid()%>.jpg" ></div>
                <div class="ch"><%=ob.getPname()%></div>
                <div class="ch"><%=ob.getPrice()%></div>
                <div class="ch"><%=ob.getNum()%></div>
                <div class="ch"><%=total%></div>
                <div class="ch"><%=ob.getStatus()%></div>
                <%
                    if (status.equals("Recieved")) {
                %>
                <div class="ch"><a class="a4" href="UserControl.jsp?val=UReturnOrder&pid=<%=ob.getPid()%>&em=<%=ob.getEmail()%>">Return</a></div>
                <%
                } else if (status.equals("Cancelled") || status.equals("rejected") || status.equals("Recieved")) {
                %>
                <div class="ch"></div>
                <%
                } else {
                %>
                <div class="ch"><a class="a4" href="UserControl.jsp?val=UCancelOrder&pid=<%=ob.getPid()%>&em=<%=ob.getEmail()%>">Cancel</a></div>
                <%
                    }}
                %>
                <script>
                    localStorage.setItem('<%=em%>1',<%=Ocnt%>);
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

                </script>
            </div>
        </div>
        <%
            }else {
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