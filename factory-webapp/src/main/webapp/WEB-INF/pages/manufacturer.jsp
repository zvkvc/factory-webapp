<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ManufacturerRepository</title>
<style>
header {
	text-align: center;
}
</style>
</head>


<body>

	<header>
		<h2>Manufacturer Repository</h2>
	</header>


	<main>
		<div id="new-city">
			<h3>Add a new manufacturer</h3>
			<form name="form" method="post" action="${pageContext.request.contextPath}/add-manufacturer">
				
				<label for="name">Manufacturer name</label> 
				
				<input type="text" id="name"
					name="name" placeholder="Enter manufacturer name" /> 
				<br>
				
				<label for="pib">PIB number</label> 
				
				<input type="text" id="pib"
					name="pib" placeholder="Enter manufacturer's PIB number" /> 
				<br>
				
				<label for="id">ID number</label> 
				
				<input type="text" id="id"
					name="id" placeholder="Enter ID number" /> 
				<br>
				
				<label for="address">Adress</label> 
				
				<input type="text" id="address"
					name="address" placeholder="Enter address" /> 
				<br>
				
				<label for="city">City HQ</label> 
				
				<input type="text" id="cityName"
					name="cityName" placeholder="Enter city name" /> 
				<br>
			
					
				<input type="submit"
					value="Add" name="Add" />

			</form>
			<br>
			<c:if test="${message-manufacturer-added!=0}">
  		 		<c:out value="${message-manufacturer-added}" />
			</c:if>
			

		</div>
		
		<br>

		<div id="show-manufacturers">
			<a href="${pageContext.request.contextPath}/show-manufacturers">
			Show all manufacturers
			</a>
		</div>
		
		<br>
		
		<div id="modify-manufacturer">
			<h3>Change city name</h3>
			<form name="form" method="post" action="${pageContext.request.contextPath}/modify-manufacturer">
				<label for="oldName">Previous name</label> 
				
				<input type="text" id="oldName"
					name="oldName" placeholder="Enter previous name" /> 
				
				<label for="newName">New name</label> 
				
				<input type="text" id="newName"
					name="newName" placeholder="Enter new name" /> 
				
					
				<input type="submit"
					value="Change" name="Change" />

			</form>
		</div>
		
		<br>

		<div id="show-manufacturer">
			<a href="${pageContext.request.contextPath}/show-manufacturer">
			Show city
			</a>
		</div>
		
		<br>

		<div id="delete-manufacturer">
		Delete manufacturer
		</div>


	</main>

</body>
</html>