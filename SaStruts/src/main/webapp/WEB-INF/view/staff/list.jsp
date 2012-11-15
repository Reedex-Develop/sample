<%@page pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>職務経歴</title>
</head>
<body>
<h2>社員一覧</h2>
<html:errors/>
<ul>
<logic:iterate id="staff" name="staffList">
<li><a href="detail?staffId=${ staff.id }">${ f:h(staff.name) }</a></li>
</logic:iterate>
</ul>
<s:form action="input"><s:submit value="新規登録" /></s:form>
</body>
</html>