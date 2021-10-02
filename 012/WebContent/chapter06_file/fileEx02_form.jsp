<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>파일 업로드 예제폼</title>
	<!-- 
	
		CREATE DATABASE FILE_EX;
		
		USE FILE_EX;
		
		CREATE TABLE FILE (
			USER_NAME VARCHAR(30),
		    TITLE VARCHAR(50),
		    ORIGIN_FILE_NAME VARCHAR(256),
		    SERVER_FILE_NAME VARCHAR(256),
		    FILE_TYPE VARCHAR(256),
		    FILE_UPLOAD_DATE DATE
		);
	
	 -->
</head>
<body>
   <form  method="post" enctype="multipart/form-data" action="fileEx02_upload.jsp">
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