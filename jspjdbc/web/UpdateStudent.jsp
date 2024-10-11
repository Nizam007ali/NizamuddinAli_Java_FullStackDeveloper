<%-- 
    Document   : UpdateStudent
    Created on : 11 Oct 2024, 3:00:56 pm
    Author     : nizam
--%>

<%@page import="com.nizam.beans.StudentBean"%>
<%@page import="com.nizam.Dao.StudentDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <style>
        .main {
            background-color: aqua;
            height: 90vh
        }
        table {
            width: 60%;
            margin: 5vw 20%;
            position: absolute;
        }
        table,tr,th,td {
            border: 2px solid black;
            padding: 1vw;
            font-size: 1.5vw;
        }
        td{
            padding: 1vw 7%;
        }
        th {
            width: 20%;
        }
        button{
            font-size: 1vw;
            padding: 0.5vw;
            letter-spacing: 0.2vw;
            margin-left: 2vw;
        }
        input {
            padding: 10px;
            width: 90%;
        }
    </style>
    </head>
    <body>
        <%
        int id = Integer.parseInt(request.getParameter("id"));
        StudentDao sd = new StudentDao();
        StudentBean sb = sd.FindById(id);
        %>
        <div class="main">
            <form action="UpdateStudentController.jsp">
                <table>
                    <tr>
                        <th>Id</th><td><input type="text" name="id" value="<%=sb.getId()%>" readonly></td>
                    </tr>
                    <tr>
                        <th>Name</th><td><input type="text" name="name" value="<%=sb.getName()%>"></td>
                    </tr>
                    <tr>
                        <th>Enroll</th><td><input type="text" name="enroll" value="<%=sb.getEnroll()%>"></td>
                    </tr>
                    <tr>
                        <th>Percentage</th><td><input type="text" name="p" value="<%=sb.getPer()%>"></td>
                    </tr><tr>
                        <th style="border: none;"></th><td><input type="submit" name="Update"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
