<%@ include file="/WEB-INF/views/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">	
</head>
<body>
<h1>Neue Adresse:</h1>
<form:form id="formId" commandName="address" method="post">
<table>
<tr>
	<td><form:label path="name">Name</form:label></td>
	<td><form:input path="name" /><form:errors path="name" /></td>
</tr>
<tr>
	<td><form:label path="street">Strasse</form:label></td>
	<td><form:input path="street" /><form:errors path="street" /></td>
</tr>
<tr>
	<td><form:label path="houseNumber">Hausnummer</form:label></td>
	<td><form:input path="houseNumber" /><form:errors path="houseNumber" /></td>
</tr>
<tr>
	<td><form:label path="zip">PLZ</form:label></td>
	<td><form:input path="zip" /><form:errors path="zip" /></td>
</tr>
<tr>
	<td><form:label path="city">Stadt</form:label></td>
	<td><form:input path="city" /><form:errors path="city" /></td>
</tr>
</table>
<input id="createNewAddress" type="submit" value="Speichern" />
</form:form>
</body>
</html>