<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String a[] = { "anusha", "ankit", "arya", "bunny", "bahu",
				"goutam", "hema", "jose", "swetha" };
		String s = request.getParameter("q");
		//out.println(s);
		String hint = "";
		if (s != null) {
			for (int i = 0; i < a.length; i++)
				if (a[i].toUpperCase().startsWith(s.toUpperCase()))
					hint = hint + a[i] + " ";
		}
		else
			hint = "";
		if (hint == null || hint.length() == 0)
			response.getWriter().write("no suggestions");
		else
			response.getWriter().write(hint);
	%>
</body>
</html>