<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="02_insertPro.jsp" method="post">
		<fieldset>
			<p>id : <input type="text" name="id"></p>
			<p>password : <input type="password" name="pw"></p>
			<p>name : <input type="text" name="name"></p>
			<input type="submit" value="join">
			<input type="reset" value="reset">
		</fieldset>
	</form>
</body>
</html>