<%@ page import="model.Human"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>output</title>
	</head>
	<body>
		<%
			Human human;
			human = (Human)request.getAttribute("human");
		%>
		<p>入力された情報は以下です</p>
		<p>名前：<%=human.getName()%></p>
		<p>年齢：<%=human.getAge()%></p>
	</body>
</html>