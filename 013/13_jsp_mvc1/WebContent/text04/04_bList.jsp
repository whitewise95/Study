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
<script>
	function c(){
		var PageViewCount = document.getElementById("PageViewCount").value;
		var searchKeyword = document.getElementById("searchKeyword").value;
		var searchWord = document.getElementById("searchWord").value;
		location.href="04_bList.jsp?PageViewCount="+PageViewCount+"&searchKeyword="+searchKeyword+"&searchWord="+searchWord;
	}
</script>
</head>
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
<body>
<%
	request.setCharacterEncoding("utf-8");
	String tempCnt = request.getParameter("PageViewCount");
	if(tempCnt==null){
		tempCnt="10";
	}
	int PageViewCount = Integer.parseInt(tempCnt);
	
	String searchKeyword = request.getParameter("searchKeyword");
	if(searchKeyword==null){
		searchKeyword="total";
	}
	
	String searchWord = request.getParameter("searchWord");
	if(searchWord==null){
		searchWord="";
	}
	
	String temp = request.getParameter("nowPage");
	if(temp==null){
		temp = "1";
	}
	int nowPage = Integer.parseInt(temp);
	
	
	int allBoardCount = BoardDAO2.getInstance().getAllCount(searchKeyword, searchWord);
	
	int StartIndex = (nowPage-1)*PageViewCount;
	
	ArrayList<BoardDTO2> bdto = BoardDAO2.getInstance().getAllBoardList(searchWord, searchKeyword, PageViewCount, StartIndex);
	
	
	
	
	
%>
	<div align="center" style="padding-top: 100px">
	<table border="1">
		<col width="10%">
		<col width="40%">
		<col width="20%">
		<col width="20%">
		<col width="10%">
		<tr>
			<td>조회<a style="color: red;"><%=allBoardCount %></a>개</td>
			<td colspan="4" align="right">
				<select name="PageViewCount" id="PageViewCount" onchange="c()">
					<option 
					<%
						if(PageViewCount==5){
					%>
						selected
					<% 
						}
					%>
					value="5">5</option>
					<option 
					<%
						if(PageViewCount==7){
					%>
							selected
					<% 
						}
					%>
					value="7">7</option>
					<option 
					<%
						if(PageViewCount==10){
					%>
							selected
					<% 
						}
					%>
					value="10">10</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
		<%
			for(int i=0; i<bdto.size(); i++){
		%>
		<tr>
			<td><%=bdto.get(i).getNum() %></td>
			<td><%=bdto.get(i).getSubject() %></td>
			<td><%=bdto.get(i).getWriter() %></td>
			<td><%=bdto.get(i).getRegDate() %></td>
			<td><%=bdto.get(i).getReadCount() %></td>
		</tr>
		<%
			}
		%>
		<tr>
			<td colspan="5">
				<select name="searchKeyword" id="searchKeyword">
					<option
					<%
						if(searchKeyword=="total"){
					%>
						selected
					<% 
						}
					%>
					value="total">전체검색</option>
					<option
					<%
						if(searchKeyword=="writer"){
					%>
						selected
					<% 
						}
					%>
					value="writer"></option>
					<option
					<%
						if(searchKeyword=="writer"){
					%>
						selected
					<% 
						}
					%>
					value="subject"></option>
				</select>
				<input type="text" name="searchWord" id="searchWord">
				<input type="button" value="검색" onclick="c()">
			</td>
		</tr>
	</table>	
	</div>
	<div style="display: table; margin-left: auto; margin-right: auto">
	<%
		if( allBoardCount > 0){
			int addPage = allBoardCount % PageViewCount==0?0:1;
			int totalPage = allBoardCount/PageViewCount+addPage;
			
			
			int startPage=1;
			
			if(nowPage%10==0){
				startPage = (nowPage/10-1)*10+1;
			}
			else{
				startPage = (nowPage/10)*10+1;
			}
			
			int endPage=startPage+9;
			
			if(allBoardCount < PageViewCount){
				endPage =0;
				startPage = 1;
			}
			if(endPage > totalPage){
				endPage = totalPage;
			}
			
		
	%>
		
				<ul>
	<%
			if(startPage>10){
	%>
					<li>		
						<a href="04_bList.jsp?nowPage=<%=startPage-10%>&PageViewCount=<%=PageViewCount%>&searchKeyword=<%=searchKeyword%>&searchWord=<%=searchWord%>">이전</a>	
					</li>
					
	<% 
			}
	
			for(int i=startPage; i<=endPage; i++){
	%>
			
					<li>		
						<a href="04_bList.jsp?nowPage=<%=i%>&PageViewCount=<%=PageViewCount%>&searchKeyword=<%=searchKeyword%>&searchWord=<%=searchWord%>"><%=i %> </a>	
					</li>
					
	<% 
			}
	
			
			if(endPage<totalPage&&endPage>=10){
				
	%>
			
					<li>		
						<a href="04_bList.jsp?nowPage=<%=startPage+10%>&PageViewCount=<%=PageViewCount%>&searchKeyword=<%=searchKeyword%>&searchWord=<%=searchWord%>">다음</a>	
					</li>
					
	<% 
			}

	
			
			
			
		}
	%>
			</ul>
	
	</div>

	
</body>
</html>