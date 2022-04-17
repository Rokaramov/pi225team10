<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор - площадь кругового сектора</title>
</head>
<body>
<h1>Калькулятор - площадь кругового сектора</h1>
	<form action="${pageContext.request.contextPath}/Calc" method="post">
			<label for="first">Радиус:</label>
			<input type="text" name="first" id="first" value="${first}">
			<label for="second">Угол: </label>
			<input type="text" name="second" id="second" value="${second}">
			<input type="submit" name="sign" value="Calculate">
		</form>
		// check
		</body>
	</html>