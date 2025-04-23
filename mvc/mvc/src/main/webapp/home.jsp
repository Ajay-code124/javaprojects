<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align:center">
 <h1>Welcome to Home Page</h1>
 <form action="addCustomer" method="POST">
 <input type="text" name="firstname"  placeholder="First Name" /> <br/> 
 <input type="text" name="lastname"  placeholder="last Name" /> <br/> 
 <input type="text" name="email"  placeholder="Email" /> <br/> 
 <input type="submit" value="submit"/> <br/>
 </form>
</body>
</html>