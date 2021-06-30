<%@page import="java.util.ArrayList"%>
<%@page import="step4_00_boardEx.BoardDTO2"%>
<%@page import="step4_00_boardEx.BoardDAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	ul {
	    list-style:none;
	    margin:0;
	    padding:0;
	}
	
	li {
	    margin: 0 0 0 0;
	    padding: 0 0 0 0;
	    border : 0;
	    float: left;
	}
</style>
</head>
<body>
<script >
	function c(){									//""사용안함
		var onePageView = document.getElementById("onePageView").value;
		var searchPage = document.getElementById("searchPage").value;
		var search = document.getElementById("search").value;
		location.href="04_bList.jsp?onePageView="+onePageView+"&searchPage="+searchPage+"&search="+search;
	}
	
</script>
<%
		//게시글 갯수를 알아야하며 / limit 때문에 스타트넘도 알아야함!

	request.setCharacterEncoding("utf-8");
	
	String search = request.getParameter("search");
	if(search==null){
		search="";
	}
	
	String searchPage = request.getParameter("searchPage");
	if(searchPage==null){
		searchPage="total";
	}
	
	String tempNumber = request.getParameter("currentPageNumber");
	if(tempNumber==null){
		tempNumber="1";
	}
	int currentPageNumber = Integer.parseInt(tempNumber);
	
	
	String tempPage = request.getParameter("onePageView");
	if(tempPage==null){
		tempPage="10";
	}
	int onePageView = Integer.parseInt(tempPage);
	
	int totBoardList = BoardDAO2.getInstance().getAllCount(searchPage, search);
	
	int startPageNum = (currentPageNumber-1)*onePageView;
	
	ArrayList<BoardDTO2> bd =BoardDAO2.getInstance().getAllBoardList(search, searchPage, onePageView, startPageNum);
	
	
	


%>
	
	
	<div align="center" style="padding-top: 100px" >
		<h6>전체게시글보기</h6>
		<table border="1">
		<col width="10%">
		<col width="30%">
		<col width="20%">
		<col width="20%">
		<col width="10%">
		<col width="10%">
			<tr>
				<td>조회<a style="color: red;"><%=totBoardList %></a>개</td>
				<td colspan="4" align="right">
					<select name="onePageView" id="onePageView" onchange="c()">
						<option
		<%
							if(onePageView == 5){
		%>
								selected	
		<%
							}
		%>					
						value="5">5</option>
						<option
		<%
							if(onePageView == 7){
		%>
								selected	
		<%
							}
		%>			
						value="7">7</option>
						<option
		<%
							if(onePageView == 10){
		%>
								selected	
		<%
							}
		%>			
						value="10">10</option>
					</select>
				</td>
			</tr>
			<tr align="center">
				<td>번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>작성일</td>
				<td>조회수</td>
			</tr>
	<%
				for(int i =0; i<bd.size(); i++){
	%>
			<tr>
				<td><%=bd.get(i).getNum()%></td>
				<td><%=bd.get(i).getSubject()%></td>
				<td><%=bd.get(i).getWriter()%></td>
				<td><%=bd.get(i).getRegDate()%></td>
				<td><%=bd.get(i).getReadCount()%></td>
			</tr>
	<%
				}
	%>
			<tr>
				<td colspan="5" align="right">
					<input type="button" value="글쓰기" onclick="location.href='02_bWrite.jsp'" >
				</td>
			</tr>
			<tr>
				<td colspan="5" align="center">
					<select name="searchPage" id="searchPage">
						<option
		<%
							if(searchPage=="total"){
		%>
								selected	
		<%
							}
		%>			
						value="total">전체검색</option>
						<option
		<%
							if(searchPage=="writer"){
		%>
								selected	
		<%
							}
		%>			
						value="">작성자</option>
						<option
		<%
							if(searchPage=="subject"){
		%>
								selected	
		<%
							}
		%>			
						value="subject">제목</option>
					</select>
					<input type="text" name="search" id="search">
					<input type="button" value="검색" onclick="c()">
				</td>
			</tr>
		</table>
	</div>
	<%
	
	
	if(totBoardList>0){
		
			int addPage = totBoardList%onePageView==0 ? 0:1;
			int totPageCount = totBoardList / onePageView + addPage;
			
			int startPage = 1;
			
			if(currentPageNumber%10==0){
				startPage = (currentPageNumber/5-1)*5+1;
			}
			else{
				startPage = (currentPageNumber/5)*5+1;
			}
			
			int endPage = startPage+4;
			
			if(endPage>totPageCount){
				endPage = totPageCount;
			}
			if(onePageView > totBoardList){
				startPage=1;
				endPage=0;
			}
	%>
			<ul>
	<% 
			
			if(startPage>5){
	%>
			<li>
				<a href="04_bList.jsp?currentPageNumber=<%=startPage-5 %>&onePageView=<%=onePageView%>&searchPage=<%=searchPage %>&search=<%=search %> ">이전</a>
			</li>
	<%
			}
			for(int i=startPage; i<=endPage; i++){
	%>
			<li>	
				<a href="04_bList.jsp?currentPageNumber=<%=i%>&onePageView=<%=onePageView%>&searchPage=<%=searchPage %>&search=<%=search %> "><%=i %></a>
			</li>
	<%
			}
			if(endPage<=totBoardList&&endPage>=5){
	%>
			<li>	
				<a href="04_bList.jsp?currentPageNumber=<%=startPage+5 %>&onePageView=<%=onePageView%>&searchPage=<%=searchPage %>&search=<%=search %> ">다음</a>
			</li>
		
	<% 		
	
				
				
			}
	%>			
		
		
			
		 </ul>	
	
	<%
		}
	 %>	


	
</body>
</html>