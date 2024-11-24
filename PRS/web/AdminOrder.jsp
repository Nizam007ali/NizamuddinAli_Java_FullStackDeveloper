<%-- 
    Document   : AdminOrder
    Created on : 10 Nov 2024, 6:38:39 pm
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
        <link rel="stylesheet" href="AOrder.css">
    </head>
    <body>
        <%
            String em = (String) session.getAttribute("em");
            if (session.getAttribute("em") != null) {
        %>
        <nav class="navbar">
            <div class="image"><img class="i1" src="image/index/logo.png" alt=""></div>
            <ul>
                <li><a href="AdminUser.jsp">Users</a></li>
                <li><a href="ViewPro.jsp">Products</a></li>
                <li><a href="AdminOrder.jsp">Orders<span class="cval" id="val2">0</span></a></li>
            </ul>
        </nav>
        <div class="box">
            <div class="par">
                <%
                    Admin a = new Admin();
                    User u = new User();
                    int AOcnt = 0;
                    int Ccnt = 0;
                    ArrayList<CartBeans> al1 = u.AllUserCart(em);
                    for (CartBeans cb : al1) {
                        System.out.println(cb);
                        String cid = u.Cid(cb.getEmail(), cb.getPid());
                        int total = Integer.parseInt(cb.getPrice()) * Integer.parseInt(cb.getNum());
                        Ccnt += Integer.parseInt(cb.getNum());
                    }
                    ArrayList<OrderBeans> al = u.AllOrder();
                    for (OrderBeans ob : al) {
                        String cid = u.Cid(ob.getEmail(), ob.getPid());
                        int total = Integer.parseInt(ob.getPrice()) * Integer.parseInt(ob.getNum());
                        String s = ob.getStatus();
                        if (s.equals("Initiated"))
                            AOcnt += Integer.parseInt(ob.getNum());
                %>
                <div class="ch"><img class="i" src="image/Product/<%=ob.getPid()%>.jpg" ></div>
                <div class="ch"><%=ob.getPname()%></div>
                <div class="ch"><%=ob.getPrice()%></div>
                <div class="ch"><%=ob.getNum()%></div>
                <div class="ch"><%=total%></div>
                <div class="ch"><%=ob.getEmail()%></div>
                <div class="ch"><div class="ch10"><%=ob.getStatus()%></div><span class="s1" id="s" style="position: absolute;display: none; width: auto;padding: 0.2vw; background-color: red;font-size: 0.8vw; margin: -2.5vw 5.75%;">new</span></div>
                <div class="ch"><a class="a4" href="AdminEditOrder.jsp?pid=<%=ob.getPid()%>&em=<%=ob.getEmail()%>">Edit</a></div>
                <script>
                    function run1() {
                        var s = document.getElementsByClassName("ch10");
                        var s1 = document.getElementsByClassName("s1");
                        for (let i = 0; i < s.length; i++) {
                            var c = s[i].innerHTML;
                            if (c === "Initiated" || c === "Returned")
                                s1[i].style.display = "block";
                            if (s1[i].style.backgroundColor === "red") {
                                s1[i].style.backgroundColor = "blue";
                            } else {
                                s1[i].style.backgroundColor = "red";
                            }
                        }
                    }
                    setInterval(run1, 1);
                </script>
                <%
                    }
                %>
                <script>
                    localStorage.setItem('<%=em%>2',<%=AOcnt%>);
                    var cnt = localStorage.getItem('<%=em%>');
                    if (cnt === null)
                        cnt = 0;
                    var cnt1 = localStorage.getItem('<%=em%>1');
                    if (cnt1 === null)
                        cnt1 = 0;
                    var cnt2 = localStorage.getItem('<%=em%>2');
                    if (cnt2 === null)
                        cnt2 = 0;
                    function run() {
                        document.getElementById("val2").innerHTML = cnt2;
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
                <li><a href="Home.jsp">Home</a></li>
                <li>
                    <select name="" id="">
                        <a href=""><option value="" selected>All</option></a>
                        <a href=""><option value="">Mobile</a></option></a>
                        <a href=""><option value="">Laptop</a></option></a>
                        <a href=""><option value="">Books</a></option></a>
                        <a href=""><option value="">Bikes</a></option></a>
                    </select>
                </li>
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