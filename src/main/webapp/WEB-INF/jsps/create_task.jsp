<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Task</title>
</head>
<body>
    <h2>Create Task Here</h2>
    <form action="savetask" method="post">
           <pre>
               TaskName    -><input type="text" name="name" >
               Task Assign
               to Employee -><input type="text" name="empname" >
               Task Details-><input type="text" name="details" >
               <input type="submit" value="SAVE">
           </pre>
             <a href="getalltask">GetAllTask</a>
    </form>
     ${msg}
     
   
</body>
</html> 