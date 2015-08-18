<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Httpsession s=request.getSession();

<%
String name=request.getParameter("username");
String pwd=request.getParameter("pwd");
if(name.equals("manager") && pwd.equals("manager")){%>
<jsp:forward page="Admin.jsp"></jsp:forward>
<%} 
else if (name.equals("clerk") && pwd.equals("clerk")){%>
<jsp:forward page="User.jsp"></jsp:forward><%
}else{%>
<h3> Authentication required </h3>
<% }
%>
</body>
</html>