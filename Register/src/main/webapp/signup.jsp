<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP PAGE</title>
</head>

<body>				
					<h2>Register Here!!</h2>
					
					<form action="Register" method="post">
						<input type="text" name="user_name" placeholder="enter your name"/>
						<br><br>
						<input type="password" name="user_password" placeholder="enter your password"/>
						<br><br>
						<input type="email" name="user_email" placeholder="enter your email"/>
						<br><br>
						<button type="submit" class="btn">
						Submit
						</button>
					</form>
					
<script src="https://code.jquery.com/jquery-3.6.4.min.js" integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous"></script>

<script>
	$(document).ready(function(){ console.log("page is ready"); })

</script>

</body>
</html>