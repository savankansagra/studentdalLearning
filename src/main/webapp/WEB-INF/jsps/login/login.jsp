<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User login</title>
</head>
<body>
<h2>login:</h2>
<form action="login" method="post">
    <pre>
        User Name: <input type="text" name="email" />
        Password: <input type="password" name="password" />
        <input type="submit" value="login" />
    </pre>
</form>

<span>${msg}</span>
</body>
</html>