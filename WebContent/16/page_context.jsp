<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext 对象示例</title>
</head>
<body>
<%
	JspWriter myOut = pageContext.getOut();
	myOut.println("hello world");
	
	pageContext.setAttribute("key", "value", pageContext.SESSION_SCOPE);
	String key = session.getAttribute("key").toString();
	out.println(key + "<br/>");
%>
</body>
</html>