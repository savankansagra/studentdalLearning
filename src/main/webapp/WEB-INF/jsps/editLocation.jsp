<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit location</title>
</head>
<body>
	<form action="updateLoc" method="post">
	<pre>
Id: <input type="text" name="Id" value="${location.id}" readonly/> 
Code: <input type="text" name="code" value="${location.code}"/> 
Name: <input type="text" name="name" value="${location.name}"/> 
Type: Urban	<input type="radio" name="type" value="urban" ${location.type=='urban'?'checked':''} />
	Rural <input type="radio" name="type" value="rural" ${location.type=='rural'?'checked':''}/>	
<input type="submit" value="save" />
	</pre>
	</form>

<a href="displayLocations">View All</a>
</body>
</html>