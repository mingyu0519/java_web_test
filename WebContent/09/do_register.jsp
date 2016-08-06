<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String username = request.getParameter("username");
	String skills = "";
	String[] skillsArr = request.getParameterValues("skills");
	if(skillsArr != null && skillsArr.length > 0){
		for(int i=0; i<skillsArr.length; i++){
			skills = skills+skillsArr[i] +"  ";
		}
	}
	request.setAttribute("username", username);
	request.setAttribute("skills", skills);
%>
<jsp:forward page="welcome.jsp"></jsp:forward>