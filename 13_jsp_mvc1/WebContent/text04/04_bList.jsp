<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div  align="center" style="padding-top: 100px"   >
		<h2>전체 게시글보기 </h2>
		<table border="1">
			<colgroup>
				<col width="10%">
				<col width="40%">
				<col width="20%">
				<col width="20%">
				<col width="10%">
			</colgroup>
			<tr>
				<td>조회?개</td>
				<td colspan="4" align="right">
					<select name="board">
						<option value="5">5</option>
						<option value="7">7</option>
						<option value="10">10</option>
					</select>			
				</td>
			</tr>
			<tr> 
				<td  align="center">번호</td>
				<td  align="center">제목</td>
				<td  align="center">작성자</td>
				<td  align="center">작성일</td>
				<td  align="center">조회수</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr align="right">
				<td colspan="5"><input type="button" value="글쓰기" onclick="02_bWrite.jsp" ></td>
			</tr>
			<tr >
				<td colspan="5" align="center">
					<select>
						<option value="allSearch,">전체검색</option>
						<option value="writerSearch,">작성자</option>
						<option value="subjectSearch">제목</option>
					</select>
					<input type="text" name="searchWord" id="searchWord">
					<input type="button" value="검색" onclick="">
				</td>
			</tr>
		</table>
	</div>
</body>
</html>