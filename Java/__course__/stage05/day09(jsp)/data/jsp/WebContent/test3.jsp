<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8" import="java.util.*"%>
<%@page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  顶替
  <%=new Date() %>
  
  <%
      session.setAttribute("user", "liayin");
  
  %>
</body>
</html>