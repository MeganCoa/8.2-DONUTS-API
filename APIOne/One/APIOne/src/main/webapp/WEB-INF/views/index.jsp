<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Hello there! Lets start with the first API</h3>

<table>
  <thead>
    <tr>
      <th>Name</th>
    </tr>
    <c:forEach items="${donuts}" var="donut">
    <tr>
   <td><a href="/donut-deets?id=${donut.id}">"${donut.name}"</a></td>
   </tr>
</c:forEach>
   </thead>
   <tbody>
     
</table>
</body>
</html>