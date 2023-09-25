<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Task Here</title>
</head>
<body>
   <form action="updatetask" method="put">
       Task Id        <input type="text" name="id" value="${task.id}">
       Task Name      <input type="text" name="name" value="${task.name}">
       Task Emp_Name  <input type="text" name="empname" value="${task.empname}">
       Task Details   <input type="text" name="details" value="${task.details}">
       <input type="submit" value="UPDATE">
   </form>
</body>
</html>