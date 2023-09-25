<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All Tasks</title>
</head>
<body>
    <table>
         <tr>
             <th>Task Id      </th>
             <th>Task Name    </th>
             <th>Task Emp_name</th>
             <th>Task Details </th>
             <th>Action       </th>
         </tr>
         <c:forEach var="task" items="${alltask}">
             <tr>
                <td>${task.id}</td>
                <td>${task.name}</td>
                <td>${task.empname}</td>
                <td>${task.details}</td>
                <td><a href="delete?id=${task.id}">delete</a></td>
                <td><a href="update?id=${task.id}">update</a></td>
             </tr>
         </c:forEach>
         
    </table>
</body>
</html>