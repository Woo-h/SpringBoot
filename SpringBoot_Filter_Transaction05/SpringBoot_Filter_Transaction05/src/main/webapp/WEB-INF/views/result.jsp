<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 화면</title>
</head>
<body>
<button onclick="history.back(-1)">뒤로가기</button>
<fieldset>
	<legend>전체조회</legend>
	<c:forEach var="vo" items="${selectResult}">
		${vo}<br>
	</c:forEach>
</fieldset>

<fieldset>
	<legend>입력</legend>
	${insertResult}
</fieldset>

<fieldset>
	<legend>수정</legend>
	${updateResult}
</fieldset>
</body>
</html>