<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--送信先のサーブレットを指定。doGetメソッドで --%>
	<form action="http://\\\\\\\:8080ginzi/itemList" method="get">
		<h3>検索</h3>
		<%--検索ワードの入力 --%>
			<input type="text" name="word">
		<br>
		<br>
		<%--カテゴリーの選択 --%>
			カテゴリ
			<select name="cut">
			<option value="1">食べ物</option>
			<option value="1">食べ物</option>
			<option value="2">飲み物</option>
			<option value="2">飲み物</option>
		<table>
			<tr>
			<th>見出しセル</th>
			</tr>
			<tr>
			<td>データセル</td>
			</tr>
		</table>

		</select>
		<br>
		<input type="submit">
	</form>
	<br>

</body>
</html>