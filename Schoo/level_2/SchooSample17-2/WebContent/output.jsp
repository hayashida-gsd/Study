<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>output</title>
	</head>
	<body>
		<p>スコープに登録されている値</p>
		<%
			// アプリケーションスコープの情報
			String applicationData = (String)application.getAttribute("data");
			// リクエストスコープの情報
			String requestData = (String)request.getAttribute("data");
			// セッションスコープの情報
			String sessionData = (String)session.getAttribute("data");
		%>
		<p>アプリケーションスコープの値：<%=applicationData%></p>
		<p>リクエストスコープの値：<%=requestData%></p>
		<p>セッションスコープの値：<%=sessionData%></p>
		<br/>
		<a href="input.jsp">input画面に戻る</a>
	</body>
</html>