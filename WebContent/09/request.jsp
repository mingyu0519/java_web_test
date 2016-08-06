<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
	<input type="text" name="UserName" />
	<input type="submit" value="提交" />
</form>
获取请求方法名：<%=request.getMethod() %><br/>
获取请求的资源：<%=request.getRequestURI() %><br/>
获取请求的协议：<%=request.getProtocol() %><br/>
获取请求服务器的IP：<%=request.getServerName() %><br/>
获取请求服务器的的端口：<%=request.getServerPort() %><br/>
获取客户端的地址：<%=request.getRemoteAddr() %><br/>
获取客户端的主机名：<%=request.getRemoteHost() %><br/>
获取客户端的端口：<%=request.getRemotePort() %><br/>
表单提交的username：<%=request.getParameter("UserName") %>
</body>
</html>