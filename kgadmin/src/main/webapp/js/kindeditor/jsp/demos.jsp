<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String htmlData = request.getParameter("content1") != null
			? request.getParameter("content1")
			: "";
%>
<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<title>KindEditor JSP</title>
<!-- 文本编辑器 Start-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/kindeditor/themes/default/default.css" />
<script charset="utf-8"
	src="${pageContext.request.contextPath}/kindeditor/kindeditor-min.js"></script>
<script charset="utf-8"
	src="${pageContext.request.contextPath}/kindeditor/config.js"></script>
<script type="text/javascript">
	MyEditor("#FDText");
</script>
<!-- 文本编辑器 End -->
</head>
<body>
	<textarea id="FDText" cols="100" rows="8"
		style="width: 700px; height: 200px; visibility: hidden;"> </textarea>
</body>
</html>
