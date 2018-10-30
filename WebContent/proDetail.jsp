<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品紹介</title>
</head>
<body>
<jsp:useBean id = "result" scope ="request" class = "web.ItemBean" type = "web.ItemBean"/>
	<h1>商品紹介</h1>
	<% int stock = Integer.parseInt(request.getParameter("stockNo"));%>

	<form action = "ProDet" method = "POST">
	<img src="proImg" align="left">

	<table border = "1">
	<tr><td>商品名</td><td><jsp:getProperty name ="result" property ="proName"/></td></tr>
	<tr><td>カテゴリ</td><td><jsp:getProperty name ="result" property ="catName"/></td></tr>
	<tr><td>価格</td><td><jsp:getProperty name ="result" property ="proPrice"/></td></tr>
	<tr><td>在庫</td><td><jsp:getProperty name ="result" property ="stockNo"/></td></tr>
	<tr><td>商品紹介</td><td><jsp:getProperty name ="result" property ="proMsg"/></td></tr>
	</table>

	個数<select name = "num">
	<% for(int i = 1;i <= stock; i++){ %><option value=<%= i %>><%= i%></option><% } %>
	</select>

	<input type="submit" value = "カートへ" name = "cart"><input type="submit" value = "戻る" name = "back">
	<input type="hidden" name="proName" value=<jsp:getProperty name ="result" property ="proName"/>>
	<input type="hidden" name="proPrice" value=<jsp:getProperty name ="result" property ="proPrice"/>>
	<input type="hidden" name="proCd" value=<jsp:getProperty name ="result" property ="proCd"/>>
	</form>

</body>
</html>