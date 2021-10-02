<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<table  >
		<tr align="center" >
			<td align="center" colspan="3">
				<jsp:include page="${pb.top }"></jsp:include>
			</td>
		</tr>
		<tr align="center">
			<td align="center" colspan="3" >
				<form action="joinAction" method="post">
					<table border="1">
					<tr>
						<td>아이디  </td>
						<td><input type="text" name="id" id="id"></td>
					</tr>
					<tr>
						<td>비밀번호 </td>
						<td><input type="password" name="pw" id="pw"></td>
					</tr>
					<tr>
						<td>이메일  </td>
						<td><input type="email" name="email" id="email"></td>
					</tr>
					<tr>
						<td>연락처  </td>
						<td><input type="tel" name="tel" id="tel"></td>
					</tr>
					<tr>
						<td>취미  </td>
						<td><input type="text" name="hobby" id="hobby"></td>
					</tr>
					<tr>
						<td>직업  </td>
						<td><input type="text" name="job" id="job"></td>
					</tr>
					<tr>
						<td>나이 </td>
						<td><input type="text" name="age" id="age" maxlength="2"></td>
					</tr>
					<tr>
						<td>자기소개 </td>
						<td><textarea rows="10" cols="50" name="info" id="info"></textarea>></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="회원가입">
							<input type="reset" value="다시쓰기">
							<input type="button" value="홈으로가기" onclick="location.href='main'">
						</td>
					</tr>
				</table>
			</form>
		</tr>
		<tr align="center">
			<td align="center" colspan="3">
				<jsp:include page="${pb.bottom }"></jsp:include>
			</td>
		</tr>

	</table>
	</div>
	
	
</body>
</html>