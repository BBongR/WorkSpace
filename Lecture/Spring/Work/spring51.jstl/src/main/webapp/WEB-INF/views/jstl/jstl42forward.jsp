<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="code" value="800" scope="request" />
<c:set var="name" value="9" scope="request" />

<jsp:forward page="jstl03.jsp">
    <jsp:param name="price" value="2234" />
    <jsp:param name="browser" value="my" />
</jsp:forward>