<%-- 
    Document   : UserLogin
    Created on : 10 Nov 2024, 8:27:39 am
    Author     : nizam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login Page</title>
        <link rel="stylesheet" href="ALogin.css">
    </head>

    <script>

        var cnt = localStorage.getItem("cnt");
        if (cnt === null)
            cnt = 0;
        function run() {
            document.getElementById("val").innerHTML = cnt;
        }
        function add() {
            cnt++;
            document.getElementById("val").innerHTML = cnt;
            localStorage.setItem("cnt", cnt);
        }
        setInterval(run, 1);
    </script>

    <body>
        <nav class="navbar">
            <div class="image"><img src="image/index/logo.png" alt=""></div>
            <ul>
                <li><a href="Home.jsp">Home</a></li>
                <li>
                    <select name="" id="">
                        <a href=""><option value="" selected>Product</option></a>
                        <a href=""><option value="">Mobile</a></option></a>
                        <a href=""><option value="">Laptop</a></option></a>
                        <a href=""><option value="">Books</a></option></a>
                        <a href=""><option value="">Bikes</a></option></a>
                    </select>
                </li>
                <li><a href="">Orders</a></li>
                <li><a href="">Cart<span class="cval" id="val">0</span></a></li>
                <li><a href="UserSignup.jsp">Signup</a></li>
                <li><a href="">Contact Us</a></li>
            </ul>
        </nav>
        <div class="box">
            <form action="UserControl.jsp" class="f">
                <div class="a">User Login</div>
                <input type="text" value="login" name="val" hidden=""><br>
                <input class="i1" type="text" placeholder="Enter your e-mail" name="em"><br>
                <input class="i1" type="password" placeholder="Enter your password" name="pw"><br>
                <input class="sub" type="submit" value="Login">
                <div class="a1">Don't have an account, Please <a href="">Signup here</a>.</div>
            </form>
        </div>
    </body>

</html>