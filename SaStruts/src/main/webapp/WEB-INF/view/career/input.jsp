<%@page pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>職務経歴</title>
</head>
<body>
	<h2>職務登録</h2>
	<html:errors/>
	<s:form action="confirm">
	<table>
		<tr>
			<th>プロジェクト名</th>
			<td><html:text property="projectName" /></td>
		</tr>
		<tr>
			<th>顧客概要</th>
			<td><html:text property="customer" /></td>
		</tr>
		<tr>
			<th>担当内容</th>
			<td><html:textarea property="summary" /></td>
		</tr>
		<tr>
			<th>Projectメンバー数</th>
			<td><html:text property="projectMmembers" /></td>
		</tr>
		<tr>
			<th>Teamメンバー数</th>
			<td><html:text property="teamMembers" /></td>
		</tr>
		<tr>
			<th>開始月</th>
			<td><html:text property="startYm" /></td>
		</tr>
		<tr>
			<th>終了月</th>
			<td><html:text property="endYm" /></td>
		</tr>
 		<tr>
			<th>OS</th>
			<td>
				<ul>
				<logic:iterate id="mstOs" name="mstOsList">
					<li><html:checkbox property="osList" value="${ mstOs.id }">${ f:h(mstOs.name) }</html:checkbox></li>
				</logic:iterate>
				</ul>
			</td>
		</tr>
		<tr>
			<th>言語</th>
			<td>
				<ul>
				<logic:iterate id="mstLang" name="mstLangList">
					<li><html:checkbox property="langList" value="${ mstLang.id }">${ f:h(mstLang.name) }</html:checkbox></li>
				</logic:iterate>
				</ul>
			</td>
		</tr>
		<tr>
			<th>DB</th>
			<td>
				<ul>
				<logic:iterate id="mstDb" name="mstDbList">
					<li><html:checkbox property="dbList" value="${ mstDb.id }">${ f:h(mstDb.name) }</html:checkbox></li>
				</logic:iterate>
				</ul>
			</td>
		</tr>
		<tr>
			<th>ミドル</th>
			<td>
				<ul>
				<logic:iterate id="mstMiddle" name="mstMiddleList">
					<li><html:checkbox property="middleList" value="${ mstMiddle.id }">${ f:h(mstMiddle.name) }</html:checkbox></li>
				</logic:iterate>
				</ul>
			</td>
		</tr>
		<tr>
			<th>役割</th>
			<td>
				<ul>
				<logic:iterate id="mstRole" name="mstRoleList">
					<li><html:checkbox property="roleList" value="${ mstRole.id }">${ f:h(mstRole.name) }</html:checkbox></li>
				</logic:iterate>
				</ul>
			</td>
		</tr>
		<tr>
			<th>担当</th>
			<td>
				<ul>
				<logic:iterate id="mstAssign" name="mstAssignList">
					<li><html:checkbox property="assignList" value="${ mstAssign.id }">${ f:h(mstAssign.name) }</html:checkbox></li>
				</logic:iterate>
				</ul>
			</td>
		</tr>
 	</table>
	<s:submit value="登録確認" />
	<html:hidden property="staffId" />
 	</s:form>
</body>
</html>
