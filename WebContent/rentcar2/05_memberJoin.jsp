<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="06_memberJoinPro.jsp" method="post"> 
		<table>
			<tr>
				<td align="center">아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td align="center">비밀번호</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td align="center">이메일</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td align="center">관련취미</td>
				<td><input type="text" name="hobby"></td>
			</tr>
			<tr>
				<td align="center">전화번호</td>
				<td><input type="tel" name="tel"></td>
			</tr>
			<tr>
				<td align="center">직업</td>
				<td><input type="text" name="job"></td>
			</tr>
			<tr>
				<td align="center">나이</td>
				<td><input type="text" name="age"></td>
			</tr>
			<tr>
				<td align="center">전달사항</td>
				<td><textarea rows="20" cols="50" name="info"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="회원가입"></td>
			</tr>
		</table>
	</form>
</body>
</html>