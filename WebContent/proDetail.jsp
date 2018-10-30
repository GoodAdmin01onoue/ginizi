<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品紹介</title>
</head>
<body>
	<h1>商品紹介</h1>
<<<<<<< HEAD
	<% int stock = (Integer)request.getAttribute("stockNo");%>
=======
	<% String proName = request.getParameter("proName");%>
	<% String catName = request.getParameter("catName");%>
	<% String proPrice1 =request.getParameter("proPrice");%>
	<% String stockNo1 = request.getParameter("stockNo");%>
	<% String proMsg = request.getParameter("proMsg");%>
	<% String proImg = request.getParameter("proImg");%>
	<% String proCd1 = request.getParameter("proCd");%>

	<% proPrice1 = proPrice1.trim();
		stockNo1 = stockNo1.trim();
		proCd1 = proCd1.trim();

		int proPrice = Integer.parseInt(proPrice1);
		int stockNo = Integer.parseInt(stockNo1);
		int proCd = Integer.parseInt(proCd1);
	%>

>>>>>>> 12_1

	<form action = "ProDet" method = "POST">
	<img src="<%= proImg%>" align="left">

	<table border = "1">
	<tr><td>商品名</td><td><%= proName%></td></tr>
	<tr><td>カテゴリ</td><td><%= catName%></td></tr>
	<tr><td>価格</td><td><%= proPrice%></td></tr>
	<tr><td>在庫</td><td><%= stockNo%></td></tr>
	<tr><td>商品紹介</td><td><%= proImg%></td></tr>
	</table>

	個数<select name = "num">
	<% for(int i = 1;i <= stockNo; i++){ %><option value=<%= i %>><%= i%></option><% } %>
	</select>

	<input type="submit" value = "カートへ" name = "cart"><input type="submit" value = "戻る" name = "back">
	<input type="hidden" name="proName" value=<%= proName %>>
	<input type="hidden" name="proPrice" value=<%= proPrice %>>
	<input type="hidden" name="proCd" value=<%= proCd %>>
	</form>

</body>
</html>