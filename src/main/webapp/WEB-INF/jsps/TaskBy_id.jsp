<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task By_Id</title>
</head>
<body>
      <table>
           <tr>
             <th>Task Id      </th>
             <th>Task Name    </th>
             <th>Task Emp_name</th>
             <th>Task Details </th>
           </tr>
           <tr>
                <td>${task.id}</td>
                <td>${task.name}</td>
                <td>${task.empname}</td>
                <td>${task.details}</td>
           </tr>
      </table>
</body>
</html>