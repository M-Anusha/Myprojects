<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function showCustomer(str) {
		var xmlhttp;
		if (str.length == 0) {
			document.getElementById("t").innerHTML = " ";
			return;
		}
		if (window.XMLHttpRequest) //Request obj creation
		{
			xmlhttp = new XMLHttpRequest();
		} else {
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}

		xmlhttp.onreadystatechange = function() //Response obj creation
		{
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				document.getElementById("txtHint").innerHTML = xmlhttp.responseText;

			}
		}
		xmlhttp.open("GET", "getCustomer.jsp?nm=" +str, true);
		xmlhttp.send();
	}
</script>
<body>
	<form action="">
		<select name="customers" onchange="showCustomer(this.value)">
		<option value="">Select Customer</option>
			<option value="SCOTT">SCOTT</option>
			<option value="BLAKE">BLAKE</option>
			<option value="MILLER">MILLER</option>
			<option value="TURNER">TURNER</option>
		</select>
		<div id="txtHint">Customer info will be listed here...</div>
	</form>
</body>
</html>