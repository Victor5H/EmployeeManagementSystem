<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body class="container">
	<h1 class="text-center">Employee Management System</h1>
	<a class="btn btn-primary" href="empRegister">Register Employee</a>
	<br>
	<a class="btn btn-primary mt-3" href="showAll">Display all
		Employees</a>
	<form class="form-inline" action="empSearch">
	<div class=" mt-3">
		<label for="inputId">Enter Id</label> 
		<input type="number" class="form-control mb-2 mr-sm-2" name="id" placeholder="Id" ></input>
		<button type="submit" class="btn btn-primary my-2 my-sm-0">Search Employee</button>
		</div>
	</form>
</body>
</html>