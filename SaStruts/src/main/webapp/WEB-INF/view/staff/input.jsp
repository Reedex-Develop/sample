<%@page pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>職務経歴</title>
</head>
<body>
<h2>社員情報入力</h2>
<html:errors/>
<s:form action="confirm">
	<table>
		<tr><td>姓名</td><td><html:text property="staffName" /></td></tr>
		<tr><td>カナ</td><td><html:text property="staffKana" /></td></tr>
		<tr><td>性別</td><td><html:radio property="sex" value="0">男</html:radio><html:radio property="sex" value="1">女</html:radio></td></tr>
		<tr><td>生年月日</td><td><html:text property="birthday" /></td></tr>
		<tr><td>郵便番号</td><td><html:text property="zipCode" /></td></tr>
		<tr><td>住所</td><td><html:text property="address" /></td></tr>
		<tr><td>電話番号</td><td><html:text property="tel" /></td></tr>
		<tr><td>最寄り駅</td><td><html:text property="station" /></td></tr>
		<tr><td>最終学歴</td><td><html:text property="lastAcademicRecord" /></td></tr>
	</table>
<logic:present name="staffId">
	<s:submit value="更新確認" />
</logic:present>
<logic:notPresent name="staffId">
	<s:submit value="登録確認" />
</logic:notPresent>
	<html:hidden property="staffId" />
</s:form>
</body>
</html>