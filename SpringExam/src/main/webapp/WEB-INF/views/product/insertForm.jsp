<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<h3>상품등록</h3>
<form action="insertProduct" method="post" name="frm">
상품번호: <input name="product_id"><br>
상품이름: <input name="product_name"><br>
상품가격: <input name="product_price"><br>
상품정보: <input name="product_info"><br>
등록날짜: <input name="product_date"><br> 
회사: <input name="company"><br>
판매자: <input name="manager_id"><br>

	<button type="submit">등록</button>
	<button type="reset">초기화</button>
</form>
</body>
</html>