<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="08_memberLoginPro.jsp" method="post">
		<table border="1">
			<tr align="center">
				<td colspan="2" height="100">로그인</td>
			</tr>
			<tr>
				<td align="center">아이디</td>
				<td> <input type="text" name="id" ></td>
			</tr>
			<tr>
				<td align="center">비밀번호</td>
				<td> <input type="password" name="pw" ></td>
			</tr>
			<tr height="40">
				<td align="center" colspan="2">
					<input type="submit" value="로그인">
					<input type="button" value="회원가입" onclick="location.href='01_carMain.jsp?center=05_memberJoin.jsp'" >
				</td>
			</tr>
		</table>
		
	</form>

</body>
</html>