<%-- 
    Document   : Home
    Created on : 9 Nov 2024, 4:50:35 pm
    Author     : nizam
--%>

<%@page import="java.awt.event.AWTEventListenerProxy"%>
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
        <script>
            function show() {
                document.getElementById('p20').style.display = 'flex';
            }
            function out() {
                document.getElementById('p20').style.display = 'none';
            }
            function al() {
                window.location.href = "http://localhost:8080/PRS/index.html/Home.jsp?value=al1";
            }
            function mob() {
                window.location.href = "http://localhost:8080/PRS/index.html/Home.jsp?value=mob";
            }
            function lap() {
                window.location.href = "http://localhost:8080/PRS/index.html/Home.jsp?value=lap";
            }
            function bik() {
                window.location.href = "http://localhost:8080/PRS/index.html/Home.jsp?value=bik";
            }
            function boo() {
                window.location.href = "http://localhost:8080/PRS/index.html/Home.jsp?value=boo";
            }
        </script>
        <%
            String em = (String) session.getAttribute("em");
            String val = request.getParameter("value");
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
                <li><a href="Home.jsp?value=al1">Home</a></li>
                <li><a href="" class="p100" onmouseover="show()" id="a100">All</a></li>
                <li><a href="Order.jsp">Orders<span class="cval" id="val1">0</span></a></li>
                <li><a href="Cart.jsp">Cart<span class="cval" id="val">0</span></a></li>
                <li><a href="UserControl.jsp?val=logout">Logout</a></li>
                <li><a href="">Contact Us</a></li>
            </ul>
            <ul class="p20" id="p20" onmouseleave="out()">
                <li class="p30"><button class="b10" onclick="al()">All</button></li>
                <li class="p30"><button class="b10" onclick="mob()">Mobile</button></li>
                <li class="p30"><button class="b10" onclick="lap()">Laptop</button></li>
                <li class="p30"><button class="b10" onclick="bik()">Bikes</button></li>
                <li class="p30"><button class="b10" onclick="boo()">Books</button></li>
            </ul>
        </nav>
        <div class="box">
            <div class="par">
                <%
                    Admin a = new Admin();
                    ArrayList<ProductBeans> al = new ArrayList<ProductBeans>();
                    if (val.equals("mob")) {
                        al = a.MobPro();
                %>
                <script>
                    document.getElementById('a100').innerHTML = 'Mobile';
                </script>
                <%
                    } else if (val.equals("lap")) {
                        al = a.LapPro();
                %>
                <script>
                    document.getElementById('a100').innerHTML = 'Laptop';
                </script>
                <%
                    } else if (val.equals("bik")) {
                        al = a.BikPro();
                %>
                <script>
                    document.getElementById('a100').innerHTML = 'Bikes';
                </script>
                <%
                    } else if (val.equals("boo")) {
                        al = a.BooPro();
                %>
                <script>
                    document.getElementById('a100').innerHTML = 'Books';
                </script>
                <%
                    } else {
                        al = a.AllPro();
                %>
                <script>
                    document.getElementById('a100').innerHTML = 'All';
                </script>
                <%
                    }
                    for (ProductBeans pb : al) {
                %>
                <div class="ch"><img class="i" src="image/Product/<%=pb.getPid()%>.jpg" ></div>
                <div class="ch"><%=pb.getPname()%></div>
                <div class="ch ch10"><%=pb.getPdes()%></div>
                <!--<div class="ch"><%=val%></div>-->
                <div class="ch"><%=pb.getPrice()%></div>
                <!--<div class="ch" id="Pcnt"><input type="text" value="" placeholder="must be greater than 0"></div>-->
                <div class="ch"><a href="UserControl.jsp?val=AddCart&pid=<%=pb.getPid()%>&em=<%=em%>">Add to Cart</a></div>
                <%
                    }

                %>
            </div>
        </div>
        <%        } else {
        %>
        <nav class="navbar">
            <div class="i1"><img src="image/index/logo.png" alt=""></div>
            <ul>
                <li><a href="Home.jsp?value=al1">Home</a></li>
                <li><a href="" class="p100" onmouseover="show()" id="a100">All</a></li>
                <li><a href="UserLogin.jsp">Orders</a></li>
                <li><a href="UserLogin.jsp">Cart</a></li>
                <li><a href="UserLogin.jsp">Login</a></li>
                <li><a href="">Contact Us</a></li>
            </ul>
            <ul class="p20" id="p20" onmouseleave="out()">
                <li class="p30"><button class="b10" onclick="al()">All</button></li>
                <li class="p30"><button class="b10" onclick="mob()">Mobile</button></li>
                <li class="p30"><button class="b10" onclick="lap()">Laptop</button></li>
                <li class="p30"><button class="b10" onclick="bik()">Bikes</button></li>
                <li class="p30"><button class="b10" onclick="boo()">Books</button></li>
            </ul>
        </nav>
        <div class="box">
            <div class="par">
                <%
                    Admin a = new Admin();
                    ArrayList<ProductBeans> al = new ArrayList<ProductBeans>();
                    if (val.equals("mob")) {
                        al = a.MobPro();
                %>
                <script>
                    document.getElementById('a100').innerHTML = 'Mobile';
                </script>
                <%
                    } else if (val.equals("lap")) {
                        al = a.LapPro();
                %>
                <script>
                    document.getElementById('a100').innerHTML = 'Laptop';
                </script>
                <%
                    } else if (val.equals("bik")) {
                        al = a.BikPro();
                %>
                <script>
                    document.getElementById('a100').innerHTML = 'Bikes';
                </script>
                <%
                    } else if (val.equals("boo")) {
                        al = a.BooPro();
                %>
                <script>
                    document.getElementById('a100').innerHTML = 'Books';
                </script>
                <%
                    } else {
                        al = a.AllPro();
                %>
                <script>
                    document.getElementById('a100').innerHTML = 'All';
                </script>
                <%
                    }
                    for (ProductBeans pb : al) {
                %>
                <div class="ch"><img class="i" src="image/Product/<%=pb.getPid()%>.jpg" ></div>
                <div class="ch"><%=pb.getPname()%></div>
                <div class="ch"><%=pb.getPdes()%></div>
                <!--<div class="ch"><%=val%></div>-->
                <div class="ch"><%=pb.getPrice()%></div>
                <!--<div class="ch" id="Pcnt"><input type="text" value="" placeholder="must be greater than 0"></div>-->
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