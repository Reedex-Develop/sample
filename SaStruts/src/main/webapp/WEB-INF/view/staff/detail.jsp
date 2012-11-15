<%@page pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>職務経歴</title>
</head>
<body>
<table>
	<tr><td>姓名</td><td>${ f:h(staffName) }</td></tr>
	<tr><td>カナ</td><td>${ f:h(staffKana) }</td></tr>
	<tr><td>性別</td><td><logic:equal name="sex" value="0">男</logic:equal><logic:equal name="sex" value="1">女</logic:equal></td></tr>
	<tr><td>生年月日</td><td>${ f:h(birthday) }</td></tr>
	<tr><td>郵便番号</td><td>${ f:h(zipCode) }</td></tr>
	<tr><td>住所</td><td>${ f:h(address) }</td></tr>
	<tr><td>電話番号</td><td>${ f:h(tel) }</td></tr>
	<tr><td>最寄り駅</td><td>${ f:h(station) }</td></tr>
	<tr><td>最終学歴</td><td>${ f:h(lastAcademicRecord) }</td></tr>
</table>
<s:form action="update">
	<html:hidden property="staffId" />
	<s:submit value="基本情報更新" />
</s:form>
<s:form action="/career/">
	<s:submit value="経歴情報" />
	<html:hidden property="staffId" value="${ staffId }" />
</s:form>
</body>
</html>
