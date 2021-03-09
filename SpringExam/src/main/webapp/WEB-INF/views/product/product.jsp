<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Product 목록</h3>
	<c:forEach items="${list}" var="product">
상품번호: ${product.product_id} 상품이름: ${product.product_name} 
상품가격: ${product.product_price} 상품정보: ${product.product_info} 
등록날짜: ${product.product_date} 
회사: ${product.company} 판매자: ${product.manager_id}<br>
	</c:forEach>
	<ul>
		<li><a href="/insert">상품 등록 페이지로</a></li>
	</ul>
</body>
</html>