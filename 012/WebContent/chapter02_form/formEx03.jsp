<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>입력값 유효성 체크</title>
<script>

	function formValidationCheck() {
		
		var name = document.getElementById("name");
		
		if (name.value.length == 0) {
			alert("이름을 입력하세요.");
			name.focus(); // .focus() : 엘리먼트에 포커스를 적용한다.
			return false;
		}
		
		var id = document.getElementById("id");
		if (id.value.length == 0) {
			alert("아이디를 입력하세요.");
			id.focus();
			return false;
		}
		
		var pwd = document.getElementById("pwd");
		if (pwd.value.length == 0) {
			alert("비밀번호를 입력하세요.");
			pwd.focus();
			return false;
		}	
		
		if (pwd.value.length < 8) {
			alert("비밀번호는 8자 이상으로 입력하세요.");
			pwd.focus();
			return false;
		}	
				
		var hobbies = document.getElementsByName("hobbies");
		var isCheckedCnt = 0;
		for (var i=0; i<hobbies.length; i++) {
			if (hobbies[i].checked) isCheckedCnt++;
		}
		
		if (isCheckedCnt == 0) {
			alert("취미는 최소 1개이상 선택해 주세요.");
			return false;
		}
		
		return true;
		
	}

</script>
</head>
<body>
	<!-- 
		  # onsubmit
		  
		  - submit 버튼을 누를때 발생하는 이벤트.
		  - 메서드 명앞에 return 키워드를 붙이며 return값이 false이면 
		    데이터를 서버로 전송하지 않는다.	
	 -->
	<form method="post" action="formEx02Pro.jsp" onsubmit="return formValidationCheck()">
		<fieldset>
			<legend>회원가입 폼</legend>
			<p><label for="name"><span style="color: red">*</span>이름 : </label><input type="text"  id="name" name="name"/></p>
			<p><label for="id"><span style="color: red">*</span>아이디 : </label><input type="text" id="id" name="id"/></p>
			<p><label for="pwd"><span style="color: red">*</span>비밀번호 : </label><input type="password" id="pwd" name="pwd"/></p>
			<p><label for="age">나이 : </label><input type="text" id="age" name="age"/></p>
			<p>
				성별 : <input type="radio" name="gender" value="1"/>남자
			   		   <input type="radio" name="gender" value="2"/>여자
			</p>
			<p>
				<span style="color: red">*</span>취미 : 
					<input type="checkbox" name="hobbies" value="운동"/>운동
					<input type="checkbox" name="hobbies" value="잠자기"/>잠자기
					<input type="checkbox" name="hobbies" value="공부하기"/>공부하기
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