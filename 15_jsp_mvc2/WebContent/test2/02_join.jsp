<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function c(){
		var id = document.getElementById("id");
		if(id.length == 0){
			alert("아이디를 입력해주세요");
			focus();
			retuen false;
		}
		var pw = document.getElementById("pw");
		if(pw.length == 0){
			alert("아이디를 입력해주세요");
			focus();
			retuen false;
		}
		var name = document.getElementById("name");
		if(name.length == 0){
			alert("아이디를 입력해주세요");
			focus();
			retuen false;
		}
		var tel = document.getElementById("tel");
		if(tel.length == 0){
			alert("아이디를 입력해주세요");
			focus();
			retuen false;
		}
		var email = document.getElementById("email");
		if(email.length == 0){
			alert("아이디를 입력해주세요");
			focus();
			retuen false;
		}
		return true;
		
	}

</script>
</head>
<body>
	<div align="center">
		<form action="joinAction2" method="post" onsubmit="return f()">
			<p><a>아이디 <input type="text" name="id" id="id"></a></p>
			<p></p>
			<p><a>패스워드 <input type="password" name="pw" id="pw"></a></p>
			<p></p>
			<p><a>이름 <input type="text" name="naem" id="naem" placeholder="빈공간없이 입력해주세요"></a></p>
			<p></p>
			<p><a>연락처 <input type="tel" name="tel" id="tel" placeholder="000-0000-0000"></a></p>
			<p></p>
			<p><a>이메일 <input type="email" name="email" id="email"></a></p>
			<p></p>
			<hr>
			<p></p>
			<input type="submit" value="회원가입">
			<input type="reset" value="다시쓰기">
		</form>
	</div>
</body>
</html>