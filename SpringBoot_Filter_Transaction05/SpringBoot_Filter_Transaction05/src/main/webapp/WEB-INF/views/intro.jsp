<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC 기능 테스트</title>
</head>
<body>
<fieldset>
	<legend>전체조회</legend>
	<a href="./selectJobs.do">Jobs전체조회 실행</a>
</fieldset>

<fieldset>
	<legend>입력</legend>
	<form action="./insertJobs.do" method="post">
		아이디:<input name="id" value="IT_Test"><br>
		직업명:<input name="title" value="SpringBootIT"><br>
		최소급여:<input name="minSal" value="1000"><br>
		최대급여:<input name="maxSal" value="9999"><br>
		사용여부:<span>SQL문에서 자동으로 Y로 입력</span>
		<input type="submit" value="새글입력">
	</form>
</fieldset>

<fieldset>
	<legend>수정</legend>
	<a href="./updateJobs.do">JOBS의 모든 USEAGE를 N으로 변경</a>
</fieldset>

<fieldset>
	<legend>Transaction 처리</legend>
	<a href="./transaction.do">Update성공&amp;Insert실패</a>
</fieldset>

</body>
</html>