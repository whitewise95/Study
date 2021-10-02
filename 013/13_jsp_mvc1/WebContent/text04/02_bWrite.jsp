<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	function formValidationCheck(){
		
		var writer = document.f.writer;
		if(writer.value.length==0){
			alert("작성자를 입력해주세요");
			writer.focus();
			return  false;
		}
		var subject = document.f.subject;
		if(subject.value.length==0){
			alert("제목을 입력해주세요");
			subject.focus();
			return  false;
		}
		
		var email = document.f.email;
		if(email.value.length==0){
			alert("이메일를 입력해주세요");
			email.focus();
			return  false;
		}
		
		var password = document.f.password;
		if(password.value.length==0){
			alert("이메일를 입력해주세요");
			password.focus();
			return  false;
		}
		
		
		
		return true;
	}
</script>
</head>
<body>
	
		<form action="03_bWritePro.jsp" method="post" onsubmit="return formValidationCheck()" name="f"  style=" padding-top: 100px">
			<h2 align="center">게시글 쓰기</h2>
			<table border="1" style="width: 700px" >
				<colgroup>
					 <col width="20%" align="right">
					 <col width="80%">
				</colgroup>
				<tr>
					<td align="center"><span style="color: red">*</span>작성자</td>
					<td><input type="text" name="writer" ></td>
				</tr>
				<tr>
					<td align="center"><span style="color: red">*</span>제목</td>
					<td><input type="text" name="subject"></td>
				</tr>
				<tr>
					<td align="center"><span style="color: red">*</span>이메일</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td align="center"><span style="color: red">*</span>패스워드</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>글내용</td>
					<td><textarea rows="10" cols="50" name="content"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="글쓰기" >
						<input type="reset" value="다시작성">
						<input type="button" value="전체게시글 보기" onclick="location.href='04_bList.jsp'">
					</td>
				</tr>
			</table>
		</form>
</body>
</html>