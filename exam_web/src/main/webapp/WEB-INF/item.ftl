<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<a href="http://localhost:8081/stuadd.html#id="+${oid}>购买</a>
		<tr>
			<td>课程名称:</td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>讲课老师:</td>
			<td>${pople}</td>
		</tr>
		<tr>
			<td>课程类别</td>
			<td>${type}</td>
		</tr>
		<tr>
			<td>数量:</td>
			<td>${date?date}</td>
		</tr>
	</table>
</body>
</html>