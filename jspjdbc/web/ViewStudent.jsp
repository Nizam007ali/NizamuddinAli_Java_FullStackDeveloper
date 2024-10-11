<%-- 
    Document   : ViewStudent
    Created on : 11 Oct 2024, 2:14:29 pm
    Author     : nizam
--%>

<%@page import="com.nizam.Dao.StudentDao"%>
<%@page import="com.nizam.beans.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .main {
                width: 100%;
                background-color: aqua;
                height: 90vh
            }
            table {
                width: 60%;
                margin: 5vw 20%;
                position: absolute;
            }
            button {
            }
            table,tr,th,td {
                border: 2px solid black;
                padding: 1vw;
                font-size: 1.5vw;
            }
            button{
                font-size: 1vw;
                padding: 0.5vw;
                letter-spacing: 0.2vw;
                margin-left: 2.4vw;
            }
        </style>
    </head>
    <body>
        <div class="main">
            <form action="">
                <table>
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>enrollment</th>
                        <th>per</th>
                        <th>update</th>
                        <th>delete</th>
                    </tr>
                    <%
                        StudentDao sd = new StudentDao();
                        ArrayList<StudentBean> al = sd.Selectall();
                        for (StudentBean sb : al) {

                    %>
                    <tr>
                        <td><%=sb.getId()%></td>
                        <td><%=sb.getName()%></td>
                        <td><%=sb.getEnroll()%></td>
                        <td><%=sb.getPer()%></td>
                        <td><button><a href="UpdateStudent.jsp?id=<%=sb.getId()%>">update</button></a></td>
                        <td><button><a href="DeleteStudent.jsp?id=<%=sb.getId()%>">delete</button></a></button></td>
                    </tr>

                    <%
                        }
                    %>
                    <tr>
                        <td colspan="6"><button  style="margin-left: 7.8%"><a href="AddStudent.jsp">Add Student</a></button></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
