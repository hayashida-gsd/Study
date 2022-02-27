<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>input</title>
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
		<p>スコープに登録する情報を入力してください</p>
		<form action="ScopeServlet" method="post">
			<input type="text" name="input"/><br/>
			<input type="submit" value="送信">
		</form>
	</body>
</html>