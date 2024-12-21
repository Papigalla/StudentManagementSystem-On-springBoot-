<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.example.Student_Management_System.entity.Student"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Details of Students</h1>
 <%  List<Student> students =(List<Student>)request.getAttribute("display"); %>
 <table>
 <thead>
 <tr>
 <td>Student Id</td>
  <td>Student Name</td>
   <td>Student Degree</td>
    <td>Student Department</td>
     <td>Student Percentage</td>
 </tr>
 </thead>
 <% for(Student student:students){ %>
 <tr>
 <td><%=student.getStudentId() %></td>
 <td><%=student.getName() %></td>
 <td><%=student.getDegree() %></td>
 <td><%=student.getDepartment() %></td>
 <td><%=student.getPercentage() %></td>
 <td><a href="delete-student?student_id=<%=student.getStudentId() %>">Delete</a>
 <td><a href="update-student?student_id=<%=student.getStudentId() %>">Edit</a>
 </tr>
 <%}%>
 </table>
</body>
</html>