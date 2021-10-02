<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>

	<%
		
		request.setCharacterEncoding("utf-8");
	
		// 폴더 경로 구분자로 \\를 사용한다.
	
		// 파일의 저장 경로는 웹서비스 경로가 아닌 물리적인 실제 경로를 적어주어야 한다.
		String fileSaveLocation = "C:\\Users\\user\\git\\12_jsp_basic\\WebContent\\chapter06_file\\file_repo";
		int maxSize = 1024 * 1024 * 5; // '한번에' 업로드될 최대 용량 지정
	//			   kb  >  mb  > 5mb

	/*
        
		# 파일 업로드를 수행하는 MultipartRequest 객체 생성 ( 핵심 역할 )
    	
		[ 생성자의 인수 설명 ]
				
        - 첫번째 인자는 폼에서 가져온 인자 값을 얻기 위해 request객체를 전달한다. 
		- 두번째 인자는 업로드 될 파일의 위치를 입력한다.
        - 세번째는 파일 업로드 최대 용량 크기를 의미하며 최대 크기를 넘는경우 Exception이 발생한다.
        - 네번째 인자는 한글 이름이 넘어올 경우 한글에 문제되지 않도록 인코딩을 지정한다.
		- 다섯번째 인자는 똑같은 파일을 업로드 할 경우 중복되지 않도록 파일이름을 변환해 주는 기능을 갖는다.
   
	 */
		 
	// MultipartRequest 이 코드가 실제로 파일 업로드를 담당하는 부분이다.
		MultipartRequest multi = new MultipartRequest(request, fileSaveLocation, maxSize, "utf-8", new DefaultFileRenamePolicy());
	
				//  multipart/form-data형식으로 전송 되었기 때문에 request.getParamete가 불가능하며
				//  multipartRequest객체의 getParameter메서드를 사용해야 한다.
		String userName = multi.getParameter("userName");
		Enumeration<?> files = multi.getFileNames(); // <input type="file">인 모든 파라메타를 반환
		
		if (files.hasMoreElements()) {	// 다음 정보가 있으면
			
			String element          = (String)files.nextElement();         // file을 반환
			String serverFileName   = multi.getFilesystemName(element) ;   // 서버에 업로드된 파일명을 반환
			String originalFileName = multi.getOriginalFileName(element);  // 사용자가 업로드한 파일명을 반환
			String fileType         = multi.getContentType(element); 	   // 업로드된 파일의 타입을 반환
			long fileLength         = multi.getFile(element).length(); 	   // 파일의 크기를 반환 (long타입만 가능)
			
			
			String result = "-----------------<br>";
				  result += "사용자 이름 : " + userName + "<br>";
				  result += "파라메타 이름 : " + element + "<br>";
				  result += "서버에 업로드 된 파일 이름 : " + serverFileName + "<br>";
				  result += "사용자가 업로드 한 파일 이름 : " + originalFileName + "<br>";
				  result += "파일 타입 : " + fileType + "<br>";
				  result += "파일 크기 : " + fileLength + "<br>";
				  result += "-----------------<br>";
			
			out.println(result);
			
		}		
				
	%>
</body>
</html>