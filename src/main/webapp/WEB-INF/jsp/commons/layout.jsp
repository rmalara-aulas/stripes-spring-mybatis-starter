<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@include file="/WEB-INF/jsp/commons/taglibs.jsp"%>
<s:layout-definition>
	<%-- Este é o layout comum entre todas as páginas --%>
	<!DOCTYPE html>
	<html lang="pt-BR">
		<head>
		  <meta charset="utf-8">	
		  <title>${title}</title>	
		</head>
		
		<body>
		  <s:layout-component name="body" />
		</body>
	</html>
</s:layout-definition>