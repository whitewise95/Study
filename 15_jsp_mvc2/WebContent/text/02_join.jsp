<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function checked(){
		
		var id =document.getElementById("id");
		if(id.value.length==0){
			alert("아이디를 입력해주세요");
			id.focus();
			return  false;
		}
		var pw =document.getElementById("pw");
		if(pw.value.length==0){
			alert("비밀번호를 입력해주세요");
			id.focus();
			return  false;
		}
		var name =document.getElementById("name");
		if(name.value.length==0){
			alert("이름을 입력해주세요");
			id.focus();
			return  false;
		}
		var tel =document.getElementById("tel");
		if(id.value.length==0){
			alert("연락처를 입력해주세요");
			id.focus();
			return  false;
		}
		var email =document.getElementById("email");
		if(email.value.length==0){
			alert("이메일을 입력해주세요");
			id.focus();
			return  false;
		}
		
		return  true;
		
	}
</script>
</head>
<body>
		<div align="center">
			<h1>회원 가입</h1>
			<p>메가 아카데미를 찾아주셔서 감사합니다.</p>
			<hr>
			<form action="joinAction" method="post" onsubmit="" name="f">
				<h6>로그인 정보</h6>
				<p>아이디 <input type="text" name="id"></p>
				<p>패스워드 <input type="password" name="pw"></p>
				<h6>로그인 정보</h6>
				<p>이름 <input type="text" name="name" placeholder="공백없이 입력하세요"></p>
				<p>연락처 <input type="tel" name="tel" placeholder="000-0000-0000"></p>
				<p>이메일 <input type="email" name="email"></p>
				<p></p>
				<input type="submit" value="회원가입">
				<input type="reset" value="다시쓰기">
			</form>
		</div>
</body>
</html>