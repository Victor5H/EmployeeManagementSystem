<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
</head>
<body class="container">
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Salary</th>
				<th>Date of Birth</th>
				<th>Address</th>
			</tr>
		</thead>
		<tr>
			<td>${emp.id}</td>
			<td>${emp.name}</td>
			<td>${emp.email}</td>
			<td>${emp.salary}</td>
			<td>${df.format(emp.date)}</td>
			<td>${emp.address.buildingName},${emp.address.street},
				${emp.address.city}</td>
		</tr>
	</table>

	<a class="btn btn-success" href="updateEmp/${emp.id}">Update</a>
	<a class="btn btn-danger" href="../deleteEmp/${emp.id}">Delete</a>

</body>
</html>