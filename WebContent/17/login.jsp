<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/loginServlet" method="post">
用户：<input type="text" name="uname"/><br/>
密码：<input type="password" name="upwd"/><br/>
<input type="submit" value="submit"/>
<input type="reset" value="reset"/>
</form>
</body>
</html>