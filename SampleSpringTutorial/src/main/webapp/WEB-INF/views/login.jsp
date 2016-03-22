<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<style type="text/css">
.login_form {
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
<script type="text/javascript">
(function() {
	document.getElementById('userName').focus();
})();

</script>
<title>Sign in</title>
</head>
<body>
	<div class="login_form">
		<h1>Sign in!</h1>
		<br />
		<c:if test="${not empty error}">
			<div class="msg-box" style="background-color: coral;">${error}</div>
		</c:if>
		
			<form action="<c:url value='j_spring_security_check' />"
				method="post" id="login">
				<table>
					<tr>
						<td><span style="font-weight: bold;">User Id :</span></td>
						<td><input type="text" name='username' title="userName" id="userName"></td>
					</tr>
					<tr>
						<td><span style="font-weight: bold;">Password :</span></td>
						<td><input type="password" name='password' title="password" id="password"></td>
					</tr>
					<tr><input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" /></tr>
					<tr>
						<td><input type="reset" value="Reset"></td>
						<td style="padding-left: 115px;"><input type="submit" value="Submit"></td>
					</tr>
				</table>
			</form>
	</div>
</body>
</html>
