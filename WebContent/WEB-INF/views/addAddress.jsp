<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Address</title>
</head>
<body>
<form:form method="POST" action="/Groott/addAddress.htm" modelAttribute="addressBean">
   <table>
    <tr>
        <td><form:label path="addressID">addressID</form:label></td>
        <td><form:input path="addressID"/></td>
    </tr>
    <tr>
        <td><form:label path="address1">address1</form:label></td>
        <td><form:input path="address1"/></td>
    </tr>
    
     <tr>
        <td><form:label path="address2">address2</form:label></td>
        <td><form:input path="address2"/></td>
    </tr>
     <tr>
        <td><form:label path="city">city</form:label></td>
        <td><form:input path="city"/></td>
    </tr>
     <tr>
        <td><form:label path="state">state</form:label></td>
        <td><form:input path="state"/></td>
    </tr>
     <tr>
        <td><form:label path="zipCode">zipCode</form:label></td>
        <td><form:input path="zipCode"/></td>
    </tr>
     <tr>
        <td><form:label path="userName">userName</form:label></td>
        <td><form:input path="userName"/></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>