<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.content {
	margin: auto;
	position: absolute;
	top: 50%;
	left: 50%;
	width: auto;
	height: auto;
	margin-top: -9em;
	margin-left: -15em;
}

.msg-box {
    padding: 15px;
    width: auto;
    height: auto;
    margin-bottom: 10px;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="content">
		<h1>Title : ${title}</h1>
		<h1>Message : ${message}</h1>
		
		<c:if test="${not empty logoutMsg}">
			<div class="msg-box" style="background-color: aquamarine;" onload="javascript:alert(${logoutMsg});">${logoutMsg}</div>
		</c:if>

		<input type="button"
			onclick="document.getElementById('loginUser').click();"
			value="Sign in user"> <a
			href="${pageContext.request.contextPath}/user" id="loginUser"></a> <input
			type="button"
			onclick="document.getElementById('loginAdmin').click();"
			value="Sign in admin"> <a
			href="${pageContext.request.contextPath}/admin" id="loginAdmin"></a>
	</div>

</body>
</html>