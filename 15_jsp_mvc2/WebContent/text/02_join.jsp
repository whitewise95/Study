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
			<hr>											<!-- return을 안적음 -->
			<form action="joinAction" method="post" onsubmit="return checked()" name="f">
				<h6>로그인 정보</h6>
				<p><label>아이디 <input type="text" name="id" id="id"></label></p>
				<p><label>패스워드 <input type="password" name="pw" id="pw"></label></p>
				<h6><label>개인 정보</label></h6>
				<p><label>이름 <input type="text" name="name" id="name" placeholder="공백없이 입력하세요"></label></p>
				<p><label>연락처 <input type="tel" name="tel" id="tel" placeholder="000-0000-0000"></label></p>
				<p><label>이메일 <input type="email" id="email" name="email"></label></p>
				<p></p>
				<input type="submit" value="회원가입">
				<input type="reset" value="다시쓰기">
			</form>
		</div>
</body>
</html>