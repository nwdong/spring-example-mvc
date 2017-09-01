<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
  <head>
    <title>Spring MVC Demo - User1 Register</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Your Profile Created</h1>
    <c:out value="${example1user.username}" /><br/>
    <c:out value="${example1user.firstName}" /> <c:out value="${example1user.lastName}" /><br/>
    <c:out value="${example1user.email}" />
  </body>
</html>
