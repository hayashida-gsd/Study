<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>偶数を表示</title>
	</head>
	<body>
		<%
			for (int i = 1; i <= 10; i++) {
				if ((i % 2) == 0) {
		%>
				<p>現在の値は<%=i%>です</p>
		<%
				}
			}
		%>
	</body>
</html>