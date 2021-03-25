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
		<h2>Welcome to Factory Web App!</h2>
		<h4>Please login to continue.</h4>
	</header>
	

	<div>
		<form name="form" method="post" action="login">
			<label for="username">E-mail</label>
			<input type="text" id="email" name="email" placeholder="Enter E-mail" />
			
			<label for="password">Password:</label>
			<input type="password" id="password" name="password" placeholder="Enter Password" />
			
			<input type="submit" value="Login" name="Login" />
		</form>
	</div>

</body>
</html>