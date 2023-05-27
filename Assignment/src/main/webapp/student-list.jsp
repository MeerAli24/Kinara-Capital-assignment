<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.List" import="Org.Assignment.Student" %>

<%
    int pageSize = 5; // Number of students to display per page
    int currentPage = 1; // Current page number

    // Get the requested page number from the request parameters
    String pageParam = request.getParameter("page");
    if (pageParam != null) {
        currentPage = Integer.parseInt(pageParam);
    }

    List<Student> students = (List<Student>) request.getAttribute("students");
    int totalStudents = students.size();
    int totalPages = (int) Math.ceil((double) totalStudents / pageSize);

    // Calculate the start and end index of students to display on the current page
    int startIndex = (currentPage - 1) * pageSize;
    int endIndex = Math.min(startIndex + pageSize, totalStudents);

    List<Student> studentsOnPage = students.subList(startIndex, endIndex);
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student List</title>
</head>
<body>
    <h1>Student List</h1>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Total Marks</th>
        </tr>

        <% for (Student student : studentsOnPage) { %>
        <tr>
            <td><%= student.getId() %></td>
            <td><%= student.getName() %></td>
            <td><%= student.getTotalMarks() %></td>
        </tr>
        <% } %>
    </table>

    <%-- Display pagination links --%>
    <div>
        <% if (currentPage > 1) { %>
            <a href="student-list.jsp?page=<%= currentPage - 1 %>">Previous</a>
        <% } %>

        <% if (currentPage < totalPages) { %>
            <a href="student-list.jsp?page=<%= currentPage + 1 %>">Next</a>
        <% } %>
    </div>
</body>
</html>
