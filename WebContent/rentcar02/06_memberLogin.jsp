<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
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
	
				<form action="loginAction" method="post">
					<table border="1">
						<tr height="50px">
							<td>아이디 </td>
							<td><input type="text" id="id" name="id"></td>
						</tr>
						<tr  height="50px"> 
							<td >비밀번호 </td>
							<td ><input type="password" id="pw" name="pw"></td>
						</tr>
						<tr>
							<td colspan="2" align="center"  height="50px">
								<input type="button" value="회원가입" onclick="location.href='join'">				
								<input type="submit" value="로그인" >
							</td>
						</tr>
					</table>
				</form>
			</td>
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