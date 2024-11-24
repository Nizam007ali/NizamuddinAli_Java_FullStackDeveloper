<%-- 
    Document   : ViewPro
    Created on : 10 Nov 2024, 12:15:01 pm
    Author     : nizam
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.nizam.Dao.Admin"%>
<%@page import="com.nizam.beans.ProductBeans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Vpro.css">
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
                    var cnt2 = localStorage.getItem('<%=em%>2');
                    if (cnt2 === null)
                        cnt2 = 0;
                    function run() {
                        document.getElementById("val2").innerHTML = cnt2;
                    }
                    setInterval(run, 1);
                </script>
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
                <div class="ch ch1">Products</div>
                <div class="ch ch2"><a href="AddPro.jsp">Add product</a></div>
                <div class="ch">PId</div>
                <div class="ch">Image</div>
                <div class="ch">PName</div>
                <div class="ch">Description</div>
                <div class="ch">Type</div>
                <div class="ch">Price</div>
                <div class="ch">Update</div>
                <div class="ch">Delete</div>
                <%
                    Admin a = new Admin();
                    ArrayList<ProductBeans> al = a.AllPro();
                    for (ProductBeans pb : al) {
                %>
                <div class="ch"><%=pb.getPid()%></div>
                <div class="ch"><img class="i" src="image/Product/<%=pb.getPid()%>.jpg" ></div>
                <div class="ch"><%=pb.getPname()%></div>
                <div class="ch ch10"><%=pb.getPdes()%></div>
                <div class="ch"><%=pb.getPtype()%></div>
                <div class="ch"><%=pb.getPrice()%></div>
                <div class="ch"><a href="UpdPro.jsp?id=<%=pb.getPid()%>">Update</a></div>
                <div class="ch"><a href="AdminControl.jsp?val=DelPro&id=<%=pb.getPid()%>">Delete</a></div>
                <%
                    }
                %>
            </div>
        </div>
        <%
            } else {
        %>
        <nav class="navbar">
            <div class="image"><img class="i1" src="image/index/logo.png" alt=""></div>
            <ul>
                <li><a href="AdminLogin.jsp">Users</a></li>
                <li><a href="AdminLogin.jsp">Products</a></li>
                <li><a href="AdminLogin.jsp">Orders</a></li>
            </ul>
        </nav>
        <div class="box">
            <h1>You must login</h1>
        </div>
        <%
            }
        %>
    </body>

</html>
