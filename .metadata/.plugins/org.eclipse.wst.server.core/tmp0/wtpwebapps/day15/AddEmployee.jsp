<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function check(str) {
		var xmlhttp;
		if (str.length == 0)
		{
			document.getElementById("t").innerHTML = " ";
			return;
		}
		if (window.XMLHttpRequest) //Request obj creation
		{
			xmlhttp = new XMLHttpRequest();
		} else 
		{
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}

		xmlhttp.onreadystatechange = function() //Response obj creation
		{
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) 
			{
				document.getElementById("t").innerHTML = xmlhttp.responseText;

			}
		}
		xmlhttp.open("GET", "getCustomer.jsp?nm=" + str, true);
		xmlhttp.send();
	}
</script>
<body>
	<form action="AddEmployee">
		Enter Empcode: <input type="text" name="Empcode"
			onblur="check(this.value)">
	
			Checking: <span id="t"></span>
	
	</form>
</body>
</html>