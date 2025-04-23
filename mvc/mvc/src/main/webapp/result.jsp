<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align:center">
<h1>It's an Success Page</h1>
<c:forEach var="i" items="${data}">
<h4> First Name : ${i.firstname}</h4>
<h4> Last Name : ${i.lastname}</h4>
<h4> Email : ${i.Email}</h4>
</hr> </br>
</c:forEach>
</body>
</html>