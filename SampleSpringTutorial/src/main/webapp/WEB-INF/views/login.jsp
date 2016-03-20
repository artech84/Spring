<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<style type="text/css">
.content{
	 margin:auto;
    position:absolute;
    top: 50%;
    left: 50%;
    width:30em;
    height:18em;
    margin-top: -9em; /*set to a negative number 1/2 of your height*/
    margin-left: -15em; /*set to a negative number 1/2 of your width*/

}

</style>
<title>Sign in</title>
</head>
<body>
<div class="content">
	<h1>Hello world!</h1>
	<br />
	<form action="" method="post">
		<table>
			<tr>
				<td><span style="font-weight: bold;">User Id :</span></td>
				<td><input type="text" title="userName" id="userName"></td>
			</tr>
			<tr>
				<td><span style="font-weight: bold;">Password :</span></td>
				<td><input type="password" title="password" id="password"></td>
			</tr>
			<tr></tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>
