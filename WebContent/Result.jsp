<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h1>お買い上げありがとうございました！</h1></center>

<center>

<form action="./ItemListServlet" method="post">
<input class="common_button" type="submit" name = "a" value="買い物を続ける">
<%  String msg = (String)session.getAttribute("a");%>
</form>

<form action="./SignInServlet" method="post">
<input class="common_button" type="submit" name = "b" value="ログアウト">
<% String msg1 = (String)session.getAttribute("b"); %>
</form>

</center>

</body>
</html>