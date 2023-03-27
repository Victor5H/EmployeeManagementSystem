<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body style="background: #e2e2e2">
	<div class=" container card mt-3">
		<h3 class="text-center mt-3">Update Employee</h3>
		<div class="card-body">
			<form class="container" action="postEmpUpdate" method="post">

				<input class="form-control" type="hidden" id="id" name="id"
					value="${emp.id}">


				<div class="row">
					<div class="form-group mt-3 col-sm-6">
						<label for="inputName">Enter Name</label> <input type="text"
							class="form-control" id="inputName" placeholder="Name"
							name="name" value="${emp.name}">
						<!--     <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small> -->
					</div>
					<div class="form-group mt-3 col-sm-6">
						<label for="inputEmail">Enter Email</label> <input type="email"
							class="form-control" id="inputEmail" placeholder="Email"
							name="email" value="${emp.email}">
					</div>

					<div class="form-group mt-3 col-sm-6">
						<label for="inputSalary">Enter Salary</label> <input type="text"
							class="form-control" id="inputSalary" placeholder="Salary"
							name="salary" value="${emp.salary}">
					</div>

					<div class="form-group mt-3 col-sm-6">
						<label for="inputdob">Enter Date of Birth</label> <input
							type="text" class="form-control" id="inputdob"
							placeholder="dd/MM/yyyy" name="date"
							value="${df.format(emp.date)}">
					</div>


				</div>
				<div class="card mt-3">
					<div class="card-body">
						<h5>Enter Address</h5>
						<div class="row">
							<div class="form-group mt-3 col">
								<label for="inputStreet">Enter Street</label> <input type="text"
									class="form-control" id="inputStreet" placeholder="Street"
									name="address.street" value="${emp.address.street}">
							</div>

							<div class="form-group mt-3 col">
								<label for="inputCity">Enter City</label> <input type="text"
									class="form-control" id="inputCity" placeholder="City"
									name="address.city" value="${emp.address.city}">
							</div>
						</div>
						<div class="row">
							<div class="form-group mt-3 col">
								<label for="inputBuidingName">Enter Building name</label> <input
									type="text" class="form-control" id="inputBuildingName"
									placeholder="Building name" name="address.buildingName"
									value="${emp.address.buildingName}">
							</div>


							<input class="form-control" id="id" placeholder="Building name"
								type="hidden" name="address.id" value="${emp.address.id}">


						</div>
					</div>
				</div>

				<button type="Update" class="btn btn-primary mt-3">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>