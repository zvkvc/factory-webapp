<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>City Repository</title>
<style>
header {
	text-align: center;
}
</style>
</head>


<body>

	<header>
		<h2>City Repository</h2>
	</header>


	<main>
		<div id="new-city">
			<h3>Add a new city</h3>
			<form name="form" method="post" action="city/add-city">
				<label for="name">City name</label> 
				
				<input type="text" id="name"
					name="name" placeholder="Enter city name" /> <label for="name">Postal
					code</label> 
					
				<input type="text" id="postalCode" name="postalCode"
					placeholder="Enter city postal code" /> 
					
				<input type="submit"
					value="Add" name="Add" />

			</form>

		</div>
		
		<br>

		<div id="show-cities">
			<a href="city/show-cities">
			Show all cities
				</a>
		</div>
		
		<br>
		
		<div id="modify-city">
			<h3>Change city name</h3>
			<form name="form" method="post" action="city/modify-city">
				<label for="oldName">Previous name</label> 
				
				<input type="text" id="oldName"
					name="oldName" placeholder="Enter previous name" /> 
				
				<label for="newName">New name</label> 
				
				<input type="text" id="newName"
					name="oldName" placeholder="Enter new name" /> 
				
					
				<input type="submit"
					value="Change" name="Change" />

			</form>
		</div>

		<div id="show-city">
			<a href="${pageContext.request.contextPath}/city?link=show-city">
			Show city
			</a>
		</div>
		
		<br>

		<div id="delete-city">
		Delete city
		</div>


	</main>

</body>
</html>