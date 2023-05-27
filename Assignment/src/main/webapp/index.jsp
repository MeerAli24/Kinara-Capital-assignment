<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List" 
    import="Org.Assignment.Student"
    %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome to the Student Management System</title>
    
        <h1>Welcome to the Student Management System</h1>

    <title>Student Management System</title>
</head>

<body>
    <h1>Student Management System</h1>
    <form action="add-student" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required><br><br>
        <input type="submit" value="Add Student">
    </form>
    <br>
    <a href="get-all-students">Get All Students</a>
    
    <p>This is the default landing page for the application.</p>
    <p>You can navigate to the student list by clicking <a href="student-list.jsp">here</a>.</p>
</body>
</html>