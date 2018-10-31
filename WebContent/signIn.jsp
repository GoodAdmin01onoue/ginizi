<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>
	<h1>ログイン</h1>

	<span class="label label-danger"><font color = "red">${message}</font></span>

	<form action = "SignIn" method = "POST">
	<table>
		<tr><td>名前:</td><td><input type="text" name = "name"></td></tr>
		<tr><td>パスワード:</td><td><input type="password" name = "pass"></td></tr>
	</table>
	<input type="submit" value = "LOGIN">
	</form>

	<br>
	<a href = "./createAccount.jsp">アカウント作成⇒</a>


</body>
</html>