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
		<h2>Dobrodosli ${request.getSession().getAttriute("user").firstName}!</h2>
	</header>
	

	<main>
		<a href="/factory-webapp/city">Go to City repository</a>
		<a href="${pageContext.request.contextPath}/manufacturer">Go to Manufacturer repository</a>
		<a href="${pageContext.request.contextPath}/product">Go to Product repository</a>
	</main>

</body>
</html>