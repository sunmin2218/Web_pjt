<%@page import="com.office.ex.member.MemberConfig"%>
<%@page import="com.office.ex.Config"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    Object object = session.getAttribute(Config.SIGNINED_MEMBER_ID);
    
    if (object != null) {
    	%>
    <a href="<%= request.getContextPath().concat(Config.HOME) %>">home</a>
    &nbsp;&nbsp; |  &nbsp;&nbsp;
    <a href="<%= request.getContextPath().concat(MemberConfig.MEMBER_SIGNOUT_CONFIRM) %>">sign-out</a>
    &nbsp;&nbsp; |  &nbsp;&nbsp;
    <a href="<%= request.getContextPath() %>/modify.mem">modify</a>
    &nbsp;&nbsp; |  &nbsp;&nbsp;
    <a href="<%= request.getContextPath() %>/delete.mem">delete</a>
    	<%
    } else {
    	%>
    	<a href="<%= request.getContextPath() %>/">home</a>
    &nbsp;&nbsp; |  &nbsp;&nbsp;
    <a href="<%= request.getContextPath() %>/signup.mem">sign-up</a>
    &nbsp;&nbsp; |  &nbsp;&nbsp;
    <a href="<%= request.getContextPath() %>/signup.mem">sign-in</a>
    	<%
    }
    %>