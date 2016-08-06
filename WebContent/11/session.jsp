<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp内置对象session示例</title>
</head>
<body>
session的唯一标示符：<%= session.getId() %><br/>
session的创建时间：<%= new java.util.Date(session.getCreationTime()).toString() %><br/>
session的最后访问时间：<%= new java.util.Date(session.getLastAccessedTime()).toString() %><br/>
session的失效时间：<%= session.getMaxInactiveInterval() %><br/>
</body>
</html>