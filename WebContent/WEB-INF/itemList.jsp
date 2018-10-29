<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <% ItemListServlet list = new ItemListServlet()%>
			<% List<ItemBean> list =  (List<ItemBean>)req.getAttribute("rs") %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--送信先のサーブレットを指定。doGetメソッドで --%>
	<form action="/ginzi/itemList" method="get">
		<h3>検索</h3>
		<%--検索ワードの入力 --%>
			<input type="text" name="word">
		<br>
		<br>
		<%--カテゴリーの選択 --%>
			カテゴリ
		<select name= "cut" >
			<option value= "1" >食べ物</option>
			<option value= "2">飲み物</option>
		</select>

		<table>
			<tr>
			<th>商品名</th>
			<th>価格</th>
			<th>詳細</th>
			</tr>

			<%for(ItemList bean:list){%>


			<tr>
			<td><%=bean.getproName() %></td>
			<td><%=bean.getproPrice %></td>
			<td><input type="button" value="詳細"></td>

			</tr>

		</table>

		</select>
		<br>
		<input type="submit">
	</form>
	<br>

</body>
</html>