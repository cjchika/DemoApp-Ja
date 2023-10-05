<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="blue">

	<% 
		int x = Integer.parseInt(request.getParameter("num1"));
		int y = Integer.parseInt(request.getParameter("num2"));
			
		int z = x + y;
		
		out.println("Result: "+ z);
	%>

</body>
</html>