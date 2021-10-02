<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>데이터 전송기초 2</title>
<script>
</script>
</head>
<body>									
	<form method="post" action="formEx02Pro.jsp" >
		<fieldset>
			<legend>회원가입 폼</legend>
			<p><label for="name">이름 : </label><input type="text"  id="name" name="name"/></p>
			<p><label for="id">아이디 : </label><input type="text" id="id" name="id"/></p>
			<p><label for="pwd">비밀번호 : </label><input type="password" id="pwd" name="pwd"/></p>
			<p><label for="age">나이 : </label><input type="text" id="age" name="age"/></p>
			<p>
				성별 : <input type="radio" name="gender" value="1"/>남자
			   		   <input type="radio" name="gender" value="2"/>여자
			</p>
			<p>
				<label for="travel"> 가고 싶은 여행지는</label>
				<select id="travel" name="travel">
					<option value="괌">괌</option>
					<option value="다낭">다낭</option>
					<option value="나트랑">나트랑</option>
					<option value="코타니카발루">코타키나발루</option>
					<option value="대만">대만</option>
					<option value="푸꾸옥">푸꾸옥</option>
				</select>
			</p>
			<p>
				<label for="content">메모</label><br/>
				<textarea rows="10" cols="50" id="content" name="content"></textarea>
			</p>
			<p>
				<input type="submit" value="회원가입"/>
				<input type="reset" value="다시쓰기"/>
			</p>
		</fieldset>
	</form>
</body>
</html>
</body>
</html>