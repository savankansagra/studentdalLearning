<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>new location</title>
</head>
<body>
	<form action="saveLoc" method="post">
	<pre>
Id: <input type="text" name="Id" /> 
Code: <input type="text" name="code" /> 
Name: <input type="text" name="name" /> 
Type: Urban	<input type="radio" name="type" value="urban" />
	Rural <input type="radio" name="type" value="rural"/>	
<input type="submit" value="save" />
	</pre>
	</form>
${msg}

<a href="displayLocations">View All</a>

</body>
</html>