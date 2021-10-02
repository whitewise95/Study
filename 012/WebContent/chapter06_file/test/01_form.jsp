<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form  method="post" enctype="multipart/form-data"  action="02_upload.jsp">
		<fieldset>
			<p><label>작성자: <input type="text" name="userName"></label></p>
			<p><label>제  목: <input type="text" name="title"></label></p>
			<p><label>파일명1: <input type="file" name="uploadFile1"></label></p>
			<p><label>파일명2: <input type="file" name="uploadFile2"></label></p>
			<input type="submit" value="파일 올리기"><br>
		</fieldset>
	</form>
</body>
</html>
