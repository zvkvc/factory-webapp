<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
	header {
		text-align:center;
	}
</style>
</head>


<body>

	<header>
		<h2>Dobrodosli ${requestScope.user.getFirstName()}!</h2>
	</header>
	

	<main>
		<a href="/factory-webapp/city">Go to City repository</a> <br>
		<a href="/factory-webapp/manufacturer">Go to Manufacturer repository</a> <br>
		<a href="/factory-webapp/product">Go to Product repository</a> <br>
	</main>

</body>
</html>