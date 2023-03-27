<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employees</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
</head>
<body class="p-3">
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
		<c:forEach items="${list}" var="item">
			<tr>
				<td><a href="emp/${item.id}">${item.id}</a></td>

				<td>${item.name}</td>
				<td>${item.email}</td>
				<td>${item.salary}</td>
				<td>${df.format(item.date)}</td>
				<td>${item.address.buildingName},${item.address.street},
					${item.address.city}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>