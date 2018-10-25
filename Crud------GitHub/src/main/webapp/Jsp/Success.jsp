<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<center>
<head>
<h1>**Login page**</h1>
</head>
<body bgcolor="pink">
<script type="text/javascript">
function add(){
	alert("add()")
	document.myform.action="registerpage";
	document.myform.submit();
}
function del(){
	alert("del()")
	document.myform.action="del";
	document.myform.submit();
}
function edit(){
	alert("edit()")
	document.myform.action="edit";
	document.myform.submit();
}
</script>
${msg}
<form name="myform">
<table border="2">
<tr><th>ID</th><th>Name</th><th>Username</th><th>Password</th></tr>
<c:forEach items="${data}" var="data" >
<tr>
<td><input type="radio" name="id" value="${data.id}"></td>
<td>${data.nm}</td>
<td>${data.un}</td>
<td>${data.pw}</td>
</tr>
</c:forEach>
<tr><td colspan="4" align="center"><input type="button" value="Add" onclick="add()">
<input type="button" value="Delete" onclick="del()">
<input type="button" value="Edit" onclick="edit()">
</td></tr>
</table>
</form>
</body>
</center>
</html>