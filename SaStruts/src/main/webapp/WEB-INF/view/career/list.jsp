<%@page pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>職務経歴</title>
</head>
<body>
	<h2>職務一覧</h2>
	<html:errors/>
	<table>
		<tr>
		<th>プロジェクト名</th>
		<th>顧客概要</th>
		<th>担当内容</th>
		<th>Projectメンバー数</th>
		<th>Teamメンバー数</th>
		<th>開始月</th>
		<th>終了月</th>
		<th>OS</th>
		<th>言語</th>
		<th>DB</th>
		<th>ミドル</th>
		<th>役割</th>
		<th>担当</th>
		</tr>
	<logic:iterate id="career" name="careerList">
		<tr>
		<td>${ f:h(career.name) }</td>
		<td>${ f:h(career.customer) }</td>
		<td>${ f:h(career.summary) }</td>
		<td>${ f:h(career.projectMembers) }</td>
		<td>${ f:h(career.teamMembers) }</td>
		<td>${ f:h(career.startYm) }</td>
		<td>${ f:h(career.endYm) }</td>
		<td>
		<logic:iterate id="os" name="career" property="careerOsList">
			${ f:h(os.mstOs.Name) }<br />
		</logic:iterate>
		</td>
		<td>
		<logic:iterate id="lang" name="career" property="careerLangList">
			${ f:h(lang.mstLang.Name) }<br />
		</logic:iterate>
		</td>
		<td>
		<logic:iterate id="db" name="career" property="careerDbList">
			${ f:h(db.mstDb.Name) }<br />
		</logic:iterate>
		</td>
		<td>
		<logic:iterate id="middle" name="career" property="careerMiddleList">
			${ f:h(middle.mstMiddle.Name) }<br />
		</logic:iterate>
		</td>
		<td>
		<logic:iterate id="role" name="career" property="careerRoleList">
			${ f:h(role.mstRole.Name) }<br />
		</logic:iterate>
		</td>
		<td>
		<logic:iterate id="assign" name="career" property="careerAssignList">
			${ f:h(assign.mstAssign.Name) }<br />
		</logic:iterate>
		</td>
		</tr>
	</logic:iterate>
	</table>
	<s:form action="input">
		<s:submit value="追加" />
		<html:hidden property="staffId" />
	</s:form>
</body>
</html>
