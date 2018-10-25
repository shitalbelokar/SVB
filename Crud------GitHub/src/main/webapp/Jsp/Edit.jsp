<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<center>
<head>
<h1>**Login page**</h1>
</head>
<body bgcolor="powderblue">
<form action="update">
<pre>
<input type="hidden" name="id" value="${data.id}">

name:-    <input type="text" name="nm" value="${data.nm}">

Username:-<input type="text" name="un" value="${data.un}">

Password:-<input type="text" name="pw" value="${data.pw}">

            <input type="submit" value="Registered">
         
</pre>
</form>
</body>
</center>
</html>