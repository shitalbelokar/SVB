<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<center>
<head>
<h1>**Login page**</h1>
</head>
<body bgcolor="powderblue">
${msg}
<form action="log">
<pre>
Username:-<input type="text" name="un">

Password:-<input type="text" name="pw">

          <input type="submit" value="Login">
          <a href="registerpage">New Registration</a>
</pre>
</form>
</body>
</center>
</html>