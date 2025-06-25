<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5 col-md-6">
    <h3 class="text-center mb-4">Add Result</h3>
    <form action="../AddResultServlet" method="post">
        <div class="form-group mb-3">
            <label>Student ID</label>
            <input type="number" name="studentId" class="form-control" required>
        </div>
        <div class="form-group mb-3">
            <label>Subject</label>
            <input type="text" name="subject" class="form-control" required>
        </div>
        <div class="form-group mb-3">
            <label>Marks</label>
            <input type="number" name="marks" class="form-control" required>
        </div>
        <button type="submit" class="btn btn-info w-100">Add Result</button>
    </form>
</div>
</body>
</html>
