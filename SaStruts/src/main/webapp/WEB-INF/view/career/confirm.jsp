<%@page pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>職務経歴</title>
</head>
<body>
	<s:form action="regist">
	<table>
		<tr>
			<th>プロジェクト名</th>
			<td>${ f:h(projectName) }</td>
		</tr>
		<tr>
			<th>顧客概要</th>
			<td>${ f:h(customer) }</td>
		</tr>
		<tr>
			<th>担当内容</th>
			<td>${ f:h(summary) }</td>
		</tr>
		<tr>
			<th>Projectメンバー数</th>
			<td>${ f:h(projectMmembers) }</td>
		</tr>
		<tr>
			<th>Teamメンバー数</th>
			<td>${ f:h(teamMembers) }</td>
		</tr>
		<tr>
			<th>開始月</th>
			<td>${ f:h(startYm) }</td>
		</tr>
		<tr>
			<th>終了月</th>
			<td>${ f:h(endYm) }</td>
		</tr>
 		<tr>
			<th>OS</th>
			<td>
				<ul>
				<logic:iterate id="mstOs" name="mstOsList">
					<logic:iterate id="os" name="osList">
					<logic:equal value="${ os }" name="mstOs" property="id">${ f:h(mstOs.name) }<br /></logic:equal>
					</logic:iterate>
				</logic:iterate>
				</ul>
			</td>
		</tr>
		<tr>
			<th>言語</th>
			<td>
				<ul>
				<logic:iterate id="mstLang" name="mstLangList">
					<logic:iterate id="lang" name="langList">
					<logic:equal value="${ lang }" name ="mstLang" property="id">${ f:h(mstLang.name) }<br /></logic:equal>
					</logic:iterate>
				</logic:iterate>
				</ul>
			</td>
		</tr>
		<tr>
			<th>DB</th>
			<td>
				<ul>
				<logic:iterate id="mstDb" name="mstDbList">
					<logic:iterate id="db" name="dbList">
					<logic:equal value="${ db }" name ="mstDb" property="id">${ f:h(mstDb.name) }<br /></logic:equal>
					</logic:iterate>
				</logic:iterate>
				</ul>
			</td>
		</tr>
		<tr>
			<th>ミドル</th>
			<td>
				<ul>
				<logic:iterate id="mstMiddle" name="mstMiddleList">
					<logic:iterate id="middle" name="middleList">
					<logic:equal value="${ middle }" name ="mstMiddle" property="id">${ f:h(mstMiddle.name) }<br /></logic:equal>
					</logic:iterate>
				</logic:iterate>
				</ul>
			</td>
		</tr>
		<tr>
			<th>役割</th>
			<td>
				<ul>
				<logic:iterate id="mstRole" name="mstRoleList">
					<logic:iterate id="role" name="roleList">
					<logic:equal value="${ role }" name ="mstRole" property="id">${ f:h(mstRole.name) }<br /></logic:equal>
					</logic:iterate>
				</logic:iterate>
				</ul>
			</td>
		</tr>
		<tr>
			<th>担当</th>
			<td>
				<ul>
				<logic:iterate id="mstAssign" name="mstAssignList">
					<logic:iterate id="assign" name="assignList">
					<logic:equal value="${ assign }" name ="mstAssign" property="id">${ f:h(mstAssign.name) }<br /></logic:equal>
					</logic:iterate>
				</logic:iterate>
				</ul>
			</td>
		</tr>
 	</table>
	<s:submit value="登録確認" />
	<html:hidden property="staffId" />
	<html:hidden property="careerId" />
	<html:hidden property="projectName" />
	<html:hidden property="customer" />
	<html:hidden property="summary" />
	<html:hidden property="projectMmembers" />
	<html:hidden property="teamMembers" />
	<html:hidden property="startYm" />
	<html:hidden property="endYm" />
	<html:hidden property="osList" />
	<html:hidden property="langList" />
	<html:hidden property="dbList" />
	<html:hidden property="middleList" />
	<html:hidden property="roleList" />
	<html:hidden property="assignList" />
 	</s:form>
</body>
</html>