<%-- 
    Document   : UpdateStudentController
    Created on : 11 Oct 2024, 5:45:19 pm
    Author     : nizam
--%>

<%@page import="com.nizam.Dao.StudentDao"%>
<%@page import="com.nizam.beans.StudentBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        StudentDao sd = new StudentDao();
        StudentBean sb = new StudentBean();
        sb.setId(Integer.parseInt(request.getParameter("id")));
        sb.setName(request.getParameter("name"));
        sb.setEnroll(request.getParameter("enroll"));
        sb.setPer(Float.parseFloat(request.getParameter("p")));
        int r = sd.updateStudent(sb);
        if(r>0) {
        System.out.println("Updated successfully");
        response.sendRedirect("ViewStudent.jsp");
            }
        else {
        System.out.println("Update failed");
            }
        %>
        <h1>Hello World!</h1>
    </body>
</html>
