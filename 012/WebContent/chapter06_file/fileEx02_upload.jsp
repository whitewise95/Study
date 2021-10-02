<%@page import="_06_file.FileDTO"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="_06_file.FileDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
	<% 
		request.setCharacterEncoding("utf-8");
		
		try {
			String saveFolder = "C:\\Users\\user\\git\\12_jsp_basic\\WebContent\\chapter06_file\\file_repo"; //파일 업로드 폴더 지정
			String encType = "utf-8"; 
			int maxSize = 15*1024*1024;  
			
			MultipartRequest multi = new MultipartRequest(request,saveFolder, maxSize,encType , new DefaultFileRenamePolicy());
			 
			String userName      = multi.getParameter("userName"); 
			String title         = multi.getParameter("title");	  
			Enumeration<?> files = multi.getFileNames();
			   
			while (files.hasMoreElements()){
				
				FileDTO fdto = new FileDTO();
				
				String element  		= (String)files.nextElement();
				String serverFileName 	= multi.getFilesystemName(element);
				String originalFileName = multi.getOriginalFileName(element);
				String type     		= multi.getContentType(element);
				
				fdto.setUserName(userName);
				fdto.setTitle(title);
				fdto.setServerFileName(serverFileName);
				fdto.setOriginFileName(originalFileName);
				fdto.setFileType(type);
				
				FileDAO.getInstance().saveFile(fdto);
				
			 }
			 
			 response.sendRedirect("fileEx02_list.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
</body>
</html>