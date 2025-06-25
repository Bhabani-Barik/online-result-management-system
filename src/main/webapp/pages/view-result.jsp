<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, model.Result" %>
<!DOCTYPE html>
<html>
<head>
    <title>View Results</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5 col-md-8">
    <h3 class="text-center mb-4">View Student Results</h3>
    <form method="post" action="../ViewResultServlet" class="mb-4">
        <div class="input-group">
            <input type="number" name="studentId" class="form-control" placeholder="Enter Student ID" required>
            <button class="btn btn-primary" type="submit">Search</button>
        </div>
    </form>

    <%
        List<Result> results = (List<Result>) request.getAttribute("results");
        if (results != null && !results.isEmpty()) {
    %>
    <table class="table table-bordered table-striped">
        <thead>
        <tr>
            <th>Subject</th>
            <th>Marks</th>
        </tr>
        </thead>
        <tbody>
        <% for (Result r : results) { %>
            <tr>
                <td><%= r.getSubject() %></td>
                <td><%= r.getMarks() %></td>
            </tr>
        <% } %>
        </tbody>
    </table>
    <% } else if (results != null) { %>
    <div class="alert alert-warning">No result found for this student ID.</div>
    <% } %>
</div>
</body>
</html>
