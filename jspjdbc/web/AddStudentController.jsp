<%-- 
    Document   : AddStudentController
    Created on : 11 Oct 2024, 6:13:30 pm
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
            StudentBean sb = new StudentBean();
            StudentDao sd = new StudentDao();
            sb.setId(Integer.parseInt(request.getParameter("id")));
            sb.setEnroll(request.getParameter("enroll"));
            sb.setName(request.getParameter("name"));
            sb.setPer(Float.parseFloat(request.getParameter("p")));
            int r = sd.addStudent(sb);
            if (r > 0) {
                System.out.println("Added Successfully");
                response.sendRedirect("ViewStudent.jsp");
            } else {
                out.println("Not Added Successfully");
                out.println("Go back to <a href='ViewStudent.jsp'>View</a> Page");
            }
        %>
    </body>
</html>
