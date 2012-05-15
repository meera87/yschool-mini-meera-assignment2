<%-- 
    Document   : Response
    Created on : May 15, 2012, 11:05:57 AM
    Author     : Meer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>
        <h1>Successfully added Student Marks</h1>
        <jsp:useBean id="myBean" scope="session" class="Student.StudentDetails" />
        <table border="0">           
                <tr>
                    <th>Student Name:</th>
                    <th><jsp:getProperty name="myBean" property="sname" /></th>                  
                </tr>           
                <tr>
                    <td>Grade:</td>
                    <td><jsp:getProperty name="myBean" property="grade" /></td>                   
                </tr>
                <tr>
                    <td>Subject:</td>
                    <td><jsp:getProperty name="myBean" property="subject" /></td>                   
                </tr>
                <tr>
                    <td>Marks:</td>
                    <td><jsp:getProperty name="myBean" property="marks" /></td>              
                </tr>    
        </table>
    </body>
</html>
