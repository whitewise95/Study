<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 전송 기초</title>
<script>
	
	function sendData() {
		// submit() 메서드를 통해서 데이터를 서버로 전송한다.
		// form태그의 name값이 설정이 되어있어야 한다.
		// Ex) document.form태그의 name.submit();
		document.f.submit();
	}

</script>
</head>
<body>
	<!-- action속성에 데이터를 전송할 페이지를 작성한다. -->
	<!-- method속성에 데이터를 전송할 방식을 작성한다. (default는 get방식) -->
	<form action="formEx01Pro.jsp" method="post" name="f">
		<fieldset>
			<!-- form태그 안에 있는 name속성의 이름으로 데이터가 서버로 전송된다. -->
			<p>좋아하는 언어 : <input type="text" name="language"></p>
			<p>좋아하는 이유 : <br>
				<textarea rows="5" cols="30" name="reason">
				</textarea>
			</p>
			<p>사용가능한 언어의 개수 : <input type="text" name="languageCnt"></p>
			<!-- 전송 방법 1) submit타입을 이용하여 서버로 전송한다. -->
			<input type="submit" value="입력완료" >
			
			<!-- 전송 방법 2) 자바스크립트를 이용하여 서버로 전송한다. -->
			<input type="button" value="입력완료" onclick="sendData()">
			
		</fieldset>
	</form>

</body>
</html>