<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Spring 3 MVC Series - TodoList Manager</title>
</head>
<body>



<div align="center" class="body">
<h2>TODO</h2>
 <form:form modelAttribute="todoList" method="post" action="addTodo.html">
 		
		<table>
			<tr>
				<td><form:label path="date">日付</form:label></td>
				<td><form:input path="date" value= "${map.todoi.date}" /></td>
			</tr>
			<tr>
				<td><form:label path="contents">内容</form:label></td>
				<td><form:input path="contents" /></td>
			</tr>
			<tr>
				<td><form:label path="emergency">緊急性</form:label></td>
				<td><form:input path="emergency" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="AddTodo" /></td>
			</tr>
		</table>
</form:form>


<table border="1">
	<tr class="header">
		<th align="center" width="80">日付</th>
		<th align="center" width="320">内容</th>
		<th align="center" width="100">緊急性</th>
	</tr>

	<c:forEach items="${map.todoAll}" var="item">
		<tr class="record">
			<td align="date">${item.date}</td>
			<td align="contents">${item.contents}</td>
			<td align="emergency">${item.emergency}</td>
		</tr>
	</c:forEach>
</table>
</div>
</body>
</html>