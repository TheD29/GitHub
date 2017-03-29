<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Dima
  Date: 3/19/2017
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String login = request.getParameter("username");
    String password = request.getParameter("password");
    String sessionCreationTime;
    String getSessionName = (String) session.getAttribute("uSes");
    Date date = new Date(session.getCreationTime());
    sessionCreationTime = date.toString();

%>
<p>Login <%=  login %>
</p>
<p>Password <%=    password %>
</p>
<p>Create session time <%= sessionCreationTime%>
</p>
<p><%=getSessionName%>
</p>

</body>
</html>
