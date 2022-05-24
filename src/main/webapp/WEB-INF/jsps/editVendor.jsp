<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="updateVendor" method="post">
	<pre>
id : <input type="text" name="id" value="${vendor.id}" />
code : <input type="text" name="code" value="${vendor.code}" />
name : <input type="text" name="name" value="${vendor.name}" />
type : <input type="text" name="type" value="${vendor.type}" />
email : <input type="text" name="email" value="${vendor.email}" />
phone : <input type="text" name="phone" value="${vendor.phone}" />
address : <input type="text" name="address" value="${vendor.address}" />
<input type="submit" value="save" />
	</pre>
</form>

<a href="displayVendors">View All Vendors</a>

</body>
</html>