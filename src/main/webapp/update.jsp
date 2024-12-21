<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@page import="com.example.Student_Management_System.entity.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Student students=(Student)request.getAttribute("student"); %>
<h1>Edit the student details</h1>
<form action="update" method="post">
<input type="text" name="studentId" readonly="readonly" value="<%= students.getStudentId()%>"><br>
<input type="text" name="name" value="<%= students.getName()%>"><br>
<input type="text" name="degree" value="<%= students.getDegree()%>"><br>
<input type="text" name="department" value="<%= students.getDepartment()%>"><br>
<input type="text" name="percentage" value="<%= students.getPercentage()%>"><br>
<input type="submit" value="Update">
</form>
</body>
</html>