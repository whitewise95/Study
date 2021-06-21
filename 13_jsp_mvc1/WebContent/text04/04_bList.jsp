<%@page import="java.util.ArrayList"%>
<%@page import="step4_00_boardEx.BoardDTO2"%>
<%@page import="step4_00_boardEx.BoardDAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<script>
	function c(){
		var onePageViewCount = document.getElementById("onePageViewCount").value;
		var searchKeyword = document.getElementById("searchKeyword").value;
		var keyword = document.getElementById("keyword").value;
		location.href="04_bList.jsp?searchKeyword="+searchKeyword+"&keyword="+keyword +"&onePageViewCount="+onePageViewCount;
		
		
	}
</script>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	
		String tempCnt = request.getParameter("onePageViewCount");
		if(tempCnt==null){
			tempCnt="10";
		}
		int onePageViewCount = Integer.parseInt(tempCnt);
		
		
		String keyword = request.getParameter("keyword");
		if(keyword==null){
			keyword="";
		}
		
		String searchKeyword = request.getParameter("searchKeyword");
		if(searchKeyword==null){
			searchKeyword="total";
		}
		
		String tempPage = request.getParameter("currentPageNumber");
		if(tempPage==null){
			tempPage="1";
		}
		int currentPageNumber = Integer.parseInt(tempPage);
		int totBoardCount = BoardDAO2.getInstance().getAllCount(searchKeyword, keyword);
		
		int startBoardIdx = (currentPageNumber-1)*onePageViewCount;
		
		ArrayList<BoardDTO2> bdList = BoardDAO2.getInstance().getAllBoardList(keyword, searchKeyword, onePageViewCount, startBoardIdx);
			
	%>
	<div align="center" style="padding-top: 100px" >
	<h2>전체 게시글 보기</h2>
	<table border="1">
		<col width="10%">
		<col width="40%">
		<col width="20%">
		<col width="20%">
		<col width="10%">
		<tr>
			<td>조회 : <a style="color: red;"><%=totBoardCount%></a>개</td>
			<td colspan="4" align="right">
				<select id="onePageViewCount" onchange="c()" style="width: 100px; display: inline;">
					<option 
				<%
					if(onePageViewCount==5){
				%>
						selected
				<%
					}
				%>
					value="5">5</option>
					<option 
				<%
					if(onePageViewCount==7){
				%>
						selected
				<%
					}
				%>
					value="7">7</option>
					<option 
				<%
					if(onePageViewCount==10){
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
			for(int i=0; i<bdList.size(); i++){
			
	%>
		<tr>
			<td><%=bdList.get(i).getNum()%></td>
			<td><%=bdList.get(i).getSubject() %></td>
			<td><%=bdList.get(i).getWriter() %></td>
			<td><%=bdList.get(i).getRegDate() %></td>
			<td><%=bdList.get(i).getReadCount() %></td>
		</tr>
	<%
			}	
	%>
		<tr align="right" >
			<td colspan="5"><input type="button" value="글쓰기" onclick="location.href='02_bWrite.jsp'"></td>
		</tr>
		<tr align="center">
			<td colspan="5">
				<select id="searchKeyword">
					<option
				<%
					if(searchKeyword.equals("total")){
				%>
						selected
				<%
					}
				%>
					value="total">전체검색</option>
					<option
				<%
					if(searchKeyword.equals("writer")){
				%>
						selected
				<%
					}
				%>
					value="writer">작성자</option>
					<option
				<%
					if(searchKeyword.equals("subject")){
				%>
						selected
				<%
					}
				%>
					value="subject">제목</option>
				</select>
				<input type="text" id="keyword" name="keyword">
				<input type="text" value="검색" onclick="c()"> 
			</td>
		</tr>
	</table>
	<div style="display: table; margin-left: auto; margin-right: auto">
	<%
		if(totBoardCount>10){
			int addPage = totBoardCount%onePageViewCount == 0 ? 0 : 1;
			int totPageCount = totBoardCount/onePageViewCount+addPage;
			
			
			
			int startPage = 1;
			
			if(currentPageNumber % 10 == 0){
				startPage = (currentPageNumber / 10 - 1) * 10 + 1;
			}
			else{
				startPage = (currentPageNumber/10)*10+1;
			}
			
			int endPage = startPage + 9;
			
			if(endPage>totPageCount){
				endPage=totPageCount;
			}
			if(onePageViewCount>totPageCount){
				startPage = 1;
				endPage =0;
			}
			
	%>
		<ul>
	<%
	if (startPage > 10) {
	%>
			<li>
				<a href="04_bList.jsp?currentPageNumber=<%=startPage - 10%>&onePageViewCount=<%=onePageViewCount %>&searchKeyword=<%=searchKeyword %>&keyword=<%=keyword %>">이전</a>
			</li>
	<% 
			}
	
			for(int i=startPage; i<=endPage; i++){	
	%>
				<li>	
					<a href="04_bList.jsp?currentPageNumber=<%= i %>&onePageViewCount=<%=onePageViewCount %>&searchKeyword=<%=searchKeyword %>&keyword=<%=keyword %>"><%=i%></a>
				</li>
	<% 	
			}
			if (endPage <= totBoardCount && endPage >= 10){
	%>
				<li>
					<a href="04_bList.jsp?currentPageNumber=<%=startPage + 10%>&onePageViewCount=<%=onePageViewCount %>&searchKeyword=<%=searchKeyword %>&keyword=<%=keyword %>">다음</a>
				</li>
			
		
	<% 	
			}
		}
		
	%>
			</ul>
		</div>
	</div>
</body>
</html>