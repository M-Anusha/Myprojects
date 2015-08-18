<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Sample JSP</h1>
<% String colour=request.getParameter("colour"); 

switch(colour.charAt(0))
{
	case 'r': %> <font color="red">red colour</font> <%  break;
	case 'b':%> <font color="blue">blue colour</font> <%break;
	case 'g':%><font color="green">green colour</font><% break;
	} 
%>
</body>
</html>