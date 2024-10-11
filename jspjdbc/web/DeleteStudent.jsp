<%-- 
    Document   : DeleteStudent
    Created on : 11 Oct 2024, 2:28:36 pm
    Author     : nizam
--%>

<%@page import="com.nizam.Dao.StudentDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        int id = Integer.parseInt(request.getParameter("id"));
        StudentDao sd = new StudentDao();
        int r = sd.deleteStudent(id);
        if(r>0){
        %>
        <h1>student deleted</h1>
        <%
           response.sendRedirect("ViewStudent.jsp");
        } else {
        %>
        <h1>student not deleted</h1>
        <%
        }
        %>
    </body>
</html>
