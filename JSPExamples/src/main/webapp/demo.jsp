<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>welcome to html web page</h2>
<%!int a,b,sum;%> 
<%
//int a=50;
//int b=20;
//int sum=a-b;
out.println("welcome to jsp<br>");
out.println("sum of numbers is "+sum);
a=40;
b=30;
sum=a+b;
out.println("<br/> <font color=blue> sum of two numbers is "+sum+"</font>");

%>
<%
out.println("<br/>we can write n number of scriplet tag");
%>
<br/>
<p>sum of two numbers is <%=10+20 %><p>
<p>sum of two numbers is<%=sum %></p>
<font color="red">sum of <%=a %> and <%=b %> is <%=sum %></font>
</body>
</html>