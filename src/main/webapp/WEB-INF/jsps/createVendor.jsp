<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="saveVendor" method="post">
	<pre>
id : <input type="text" name="id" />
code : <input type="text" name="code" />
name : <input type="text" name="name" />
type : <input type="text" name="type" />
email : <input type="text" name="email" />
phone : <input type="text" name="phone" />
address : <input type="text" name="address" />
<input type="submit" value="save" />
	</pre>
</form>

${msg}

<a href="displayVendors">View All Vendors</a>

</body>
</html>