<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>에러입니다</h1>
- 에러 상태 코드 출력<br>
<c:out value="${requestScope['javax.servlet.error.status_code']}"/><br><br>
- 예외처리 클래스 출력<br>
<c:out value="${requestScope['javax.servlet.error.exception_type']}"/><br><br>
- 오류 메세지 출력<br>
<c:out value="${requestScope['javax.servlet.error.message']}"/><br><br>
- 문제가 되는 request uri 정보를 출력<br>
<c:out value="${requestScope['javax.servlet.error.request_uri']}"/><br><br>
- 발생한 예외처리 내용 출력<br>
<c:out value="${requestScope['javax.servlet.error.exception']}"/><br><br>
- 에러가 난 서블릿 명 출력<br>
<c:out value="${requestScope['javax.servlet.error.servlet_name']}"/><br><br>
</body>
</html>