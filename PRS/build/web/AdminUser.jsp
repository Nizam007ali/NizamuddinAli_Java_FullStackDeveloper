<%-- 
    Document   : AdminUser
    Created on : 10 Nov 2024, 10:02:37 am
    Author     : nizam
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.nizam.beans.UserBeans"%>
<%@page import="com.nizam.Dao.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User VIewpage</title>
        <link rel="stylesheet" href="Auser.css">
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
            <div class="image"><img src="image/index/logo.png" alt=""></div>
            <ul>
                <li><a href="AdminUser.jsp">Users</a></li>
                <li><a href="ViewPro.jsp">Products</a></li>
                <li><a href="AdminOrder.jsp">Orders<span class="cval" id="val2">0</span></a></li>
            </ul>
        </nav>
        <div class="box">
            <div class="par">
                <div class="ch ch1">Users</div>
                <div class="ch ch2"><a href="AddUser.jsp">Add user</a></div>
                <div class="ch">Id</div>
                <div class="ch">Name</div>
                <div class="ch">Email</div>
                <div class="ch">Phone</div>
                <div class="ch">Password</div>
                <div class="ch">Image</div>
                <div class="ch">Update</div>
                <div class="ch">Delete</div>
                <%
                    Admin a = new Admin();
                    ArrayList<UserBeans> al = a.AllUser();
                    for (UserBeans ub : al) {
                %>
                <div class="ch"><%=ub.getId()%></div>
                <div class="ch"><%=ub.getName()%></div>
                <div class="ch"><%=ub.getEmail()%></div>
                <div class="ch"><%=ub.getPhone()%></div>
                <div class="ch"><%=ub.getPassword()%></div>
                <div class="ch"><%=ub.getImage()%></div>
                <div class="ch"><a href="UpdUser.jsp?id=<%=ub.getId()%>">Update</a></div>
                <div class="ch"><a href="AdminControl.jsp?val=del&id=<%=ub.getId()%>">Delete</a></div>
                <%
                    }
                } else {
                %>

                <nav class="navbar">
                    <div class="image"><img src="image/index/logo.png" alt=""></div>
                    <ul>
                        <li><a href="AdminUser.jsp">Users</a></li>
                        <li><a href="ViewPro.jsp">Products</a></li>
                        <li><a href="AdminOrder.jsp">Orders<span class="cval" id="val2">0</span></a></li>
                    </ul>
                </nav>
                <div class="box"><h1>You must login</h1></div>
                        <%
                            }
                        %>
            </div>
        </div>
    </body>

</html>
