<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp内置对象3示例</title>
</head>
<body>
<%
	Cookie myCookie = new Cookie("webadd", "www.wangmy.tk");
	myCookie.setMaxAge(60000);
	response.addCookie(myCookie);
%>
</body>
</html>