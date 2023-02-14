<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
a {
	text-decoration: none;
}

table {
	width: 600px;
	border-collapse: collapse;
	text-align: center;
}

table, th, td {
	border: 1px solid black;
	padding: 3px;
}

div {
	width: 600px;
	margin: auto;
	text-align: center;
}
</style>
<script type="text/javascript">
	function update_go(k) {
		k.action="up.do";
		k.submit();
	}
	function delete_go(k) {
		location.href = "delete.do?idx="+k;
	}
</script>
</head>
<body>
	<div>
		<h2>방명록 : 내용화면</h2>
		<hr>
		<p>
			<p><a href="list.do">[목록으로 이동]</a></p>
		</p>
		<form method="post">
			<table>
				<tr align="center">
					<td bgcolor="#99ccff">작성자</td>
					<td>${gvo.name}</td>
				</tr>
				<tr align="center">
					<td bgcolor="#99ccff">제 목</td>
					<td>${gvo.subject }</td>
				</tr>
				<tr align="center">
					<td bgcolor="#99ccff">email</td>
					<td>${gvo.email }</td>
				</tr>
				<tr style="text-align: left;">
					<td colspan="2"><pre style="padding-left: 15px">${gvo.content}</pre>
					</td>
				</tr>
				<tfoot>
					<tr align="center">
						<td colspan="2">
							<input type="button" value="수정" onclick="update_go(this.form)">
							<input type="hidden" name="idx" value="${gvo.idx}">
							&nbsp;&nbsp; 
							<input type="button" value="삭제" onclick="delete_go(${gvo.idx})">
						</td>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>
</body>
</html>