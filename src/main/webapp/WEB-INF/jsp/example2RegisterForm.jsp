<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ page session="false"%>
<html>
<head>
<title>Example 2 Register Form</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/style.css" />">
</head>
<body>
	<h1>Register</h1>

	<sf:form method="POST" commandName="example2user" action="example2-register">
		<sf:errors path="*" element="div" cssClass="errors" />
		<sf:label path="email" cssErrorClass="error">Email</sf:label>: 
        <sf:input path="email" cssErrorClass="error"/>
        <sf:errors path="email" cssErrorClass="error"/>
		<br />
		<sf:label path="username" cssErrorClass="error">Username</sf:label>: 
        <sf:input path="username" cssErrorClass="error" />
		<br />
		<sf:label path="password" cssErrorClass="error">Password</sf:label>: 
        <sf:password path="password" cssErrorClass="error" />
		<br />
		<input type="submit" value="Register" />
	</sf:form>
</body>
</html>
