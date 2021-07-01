<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function c(){
			//밸류를 안씀;;
		var writer = document.f.writer;
		if(writer.value.length==0){
			alert("작성자를 입력해주세요");
			return false;
		}
		var pw = document.f.pw;
		if(pw.value.length==0){
			alert("비밀번호를 입력해주세요");
			return false;
		}
		var subject = document.f.subject;
		if(subject.value.length==0){
			alert("제목을 입력해주세요");
			return false;
		}
		var email = document.f.email;
		if(email.value.length==0){
			alert("이메일을 입력해주세요");
			return false;
		}
		
		return true;
 		
	}

</script>
</head>
<body>
	<div align="center" style="padding-top: 100px">
		<h2>게시글 쓰기</h2>
		<form action="_03_bWriterAction" method="post" onsubmit="return c()" name="f">
			<table border="1">
				<tr>
					<td><a style="color: red;">*</a>작성자</td>
					<td><input type="text" name="writer" id="writer"></td>
				</tr>
				<tr>
					<td><a style="color: red;">*</a>제목</td>
					<td><input type="text" name="subject" id="subject"></td>
				</tr>
				<tr>
					<td><a style="color: red;">*</a>이메일</td>
					<td><input type="email" name="email" id="email"></td>
				</tr>
				<tr>
					<td><a style="color: red;">*</a>비밀번호</td>
					<td><input type="password" name="pw" id="pw"></td>
				</tr>
				<tr>
					<td>글내용</td>
					<td><textarea rows="10" cols="50" name="content"></textarea></td>
				</tr>
				<tr>
					<td align="center" colspan="5">
						<input type="submit" value="글쓰기">
						<input type="reset" value="다시쓰기">
						<input type="button" value="전체게시글보기" onclick="location.href='_04_bList'">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>