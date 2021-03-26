<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show cities</title>
</head>
<body>
	<header>
		<h4>Show cities in the repository</h4>
	</header>
	<main>
		<div>
			<table>
				<thead>
					<tr>
						<td></td>
						<td>City Name</td>
						<td>Postal Code</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listAllCities}" var="city"
						varStatus="loop">
						<tr>
							<td>${loop.index}</td>
							<td>${city.name}</td>
							<td>${city.postalCode}</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</main>

</body>
</html>