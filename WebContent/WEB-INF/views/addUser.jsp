<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>
<form:form method="POST" action="/Groott/addUser.htm" modelAttribute="addUserBean">
   <table>
    <tr>
        <td><form:label path="userName">userName</form:label></td>
        <td><form:input path="userName"/></td>
    </tr>
    <tr>
        <td><form:label path="password">password</form:label></td>
        <td><form:input path="password" type="password"/></td>
    </tr>
    
     <tr>
        <td><form:label path="firstName">firstName</form:label></td>
        <td><form:input path="firstName"/></td>
    </tr>
     <tr>
        <td><form:label path="lastName">lastName</form:label></td>
        <td><form:input path="lastName"/></td>
    </tr>
     <tr>
        <td><form:label path="email">email</form:label></td>
        <td><form:input path="email"/></td>
    </tr>
     <tr>
        <td><form:label path="phoneNumber">phoneNumber</form:label></td>
        <td><form:input path="phoneNumber"/></td>
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