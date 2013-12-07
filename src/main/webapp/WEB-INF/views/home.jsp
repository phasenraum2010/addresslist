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
		<th>&nbsp;</th>
		<th>&nbsp;</th>
	</tr>
	<c:forEach items="${addresses}" var="address">
	<tr>
		<td>${address.name}</td>
		<td>${address.street}</td>
		<td>${address.houseNumber}</td>
		<td>${address.zip}</td>
		<td>${address.city}</td>
		<td><a href="${ctx}/edit/${address.id}">Edit</a></td>
		<td><a href="${ctx}/delete/${address.id}">Delete</a></td>	
	</tr>
	</c:forEach>
</table>
<a href="${ctx}/new">Neue Adresse einf&uuml;gen</a>
</body>
</html>