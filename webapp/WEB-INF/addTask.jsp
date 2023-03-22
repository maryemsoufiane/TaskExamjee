<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%String message=(String) request.getAttribute("message"); %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>
<main>
<%=message==null?"":message %>
	<form action="addTask" method="post">
		<input placeholder="Task" name="task">
		<button type="submit">add</button>
	</form>
</main>
<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>