<%@ include file="/WEB-INF/views/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">	
</head>
<body>
<h1>Hallo, Welt</h1>
<table>
	<tr>
		<th>name</th>
		<th>Street</th>
		<th>houseNumber</th>
		<th>zip</th>
		<th>city</th>
	</tr>
	<c:forEach items="${addresses}" var="address">
	<tr>
		<td>${address.name}</td>
		<td>${address.street}</td>
		<td>${address.houseNumber}</td>
		<td>${address.zip}</td>
		<td>${address.city}</td>	
	</tr>
	</c:forEach>
</table>
</body>
</html>