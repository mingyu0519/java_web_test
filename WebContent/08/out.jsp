<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="10kb" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("jikexueyuan");
	out.print("darkmi");
	out.newLine();
	out.flush();
	out.clearBuffer();
	//out.clear();
	out.println("<br/>");
	out.println("获取当前缓冲区大小：" + out.getBufferSize());
	out.println("<br/>");
	out.println("获取当前缓冲区剩余字节数：" + out.getRemaining());
%>
</body>
</html>