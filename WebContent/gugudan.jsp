<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
int dan = Integer.parseInt(request.getParameter("dan"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<colgroup><col width= "25%"><col width= "25%"><col width= "50%"></colgroup>
		
		
		<%for(int i=1; i<=9; i++){%>	<!-- java code는 <% %> 로 감싸준다. -->
			<tr><td><%=dan%></td><td><%=i%></td><td><%=dan*i%></td></tr>
		<%}%>
	</table>
	
	<!-- http://localhost:8088/helloweb/gugudan.jsp?dan=5 -->

</body>
</html>