<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />

<jsp:include page="./WEB-INF/page/include/importCSS.jsp"/>
<title>欢迎访问PICCHR</title>
</head>
<body>
	<div id="box">
		<div style="text-align: center;">
		<br/><br/><br/><br/><br/><br/>
		<h4 class="text-info">欢迎使用 PICC湖南省分公司人力资源管理系统</h4>
		<br/><br/><br/>	
		</div>
	</div>
</body>
<jsp:include page="./WEB-INF/page/include/importJS.jsp"/>
</html>
