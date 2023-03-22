<%@page import="com.estf.TaskExamjee.beans.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
// Récupération de la liste de tâches à afficher
List<Task> tasks = (List<Task>) request.getAttribute("tasks");
%>
<html>
<head>
<meta charset="UTF-8">
<title>List of Tasks</title>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>
<main>
	<h1>List of Tasks</h1>
	<ul>
		<li>id</li>
		<li>Task</li>
		<li>options</li>
		<% for(Task task : tasks) { %>
			<li><%= task.getId() %></li>
			<li><%= task.getTask() %></li>
			<li><a href="deleteTask?id=<%= task.getId() %>">delete</a></li>
		<% } %>
	</ul>
	
	<!-- Formulaire d'ajout de tâche -->
	<form action="addTask" method="post">
		<label for="task">Task:</label>
		<input type="text" name="task" id="task">
		<button type="submit">Add</button>
	</form>
</main>
<jsp:include page="/footer.jsp"></jsp:include>
</body>
</html>
