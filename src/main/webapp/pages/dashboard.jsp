<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.*, jakarta.servlet.*" %>
<%
    if (session == null || session.getAttribute("admin") == null) {
        response.sendRedirect("../index.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Admin Dashboard</h2>
    <div class="d-grid gap-3 col-6 mx-auto">
        <a href="add-student.jsp" class="btn btn-success">Add Student</a>
        <a href="add-result.jsp" class="btn btn-info">Add Result</a>
        <a href="view-result.jsp" class="btn btn-primary">View Result</a>
        <a href="../index.jsp" class="btn btn-danger">Logout</a>
    </div>
</div>
</body>
</html>

