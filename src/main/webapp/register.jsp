<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body>
<form action="UserController" method="post">
<h1>Register</h1>
		<table>
			<tr>
				<td>Name : </td>
				<td><input type="text" name="name" placeholder="enter your name"></td>
			</tr>
			<tr>
				<td>Contact : </td>
				<td><input type="tel" name="contact" placeholder="enter your contact number"></td>
			</tr>
			<tr>
				<td>Gender : </td>
				<td><input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female">Female
				</td>
			</tr>
			<tr>
				<td>DOB : </td>
				<td><input type="date" name="dob" ></td>
			</tr>
			<tr>
				<td>Address : </td>
				<td><input type="text" name="address" placeholder="enter your Address"></td>
			</tr>
			<tr>
				<td>Email : </td>
				<td><input type="email" name="email" placeholder="enter your email"></td>
			</tr>
			<tr>
				<td>Password : </td>
				<td><input type="password" name="password" placeholder="enter your password"></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="register"></td>
			</tr>
		</table>
	</form>
</body>
</html>