<%--
  Created by IntelliJ IDEA.
  User: MHB
  Date: 9/10/2019
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/submitform" modelAttribute="user" method="post">
    <form:input path="name" placeholder="enter Your name"></form:input>
    <br>
    <form:input path="userName" placeholder="enter your user name"></form:input>
    <br>
    <form:password  path="password" placeholder="enter your password"></form:password>
    <br>
    <form:input  path="email" placeholder="enter your email"></form:input>
    <br>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
