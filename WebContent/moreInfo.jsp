<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MoreInformation</title>
</head>
<body>
	<table>
	<thead>
		<tr>
			<th>AuthorId</th>
			<th>AuthorName</th>
			<th>Age</th>
			<th>Country</th>
		</tr>
	</thead>
	<tbody>
	<s:iterator value="#request.authorInfo" var="authorInfo" status="statu">
	<tr>
			<td><s:property value="#authorInfo.authorid" /></td>
			<td><s:property value="#authorInfo.name" /></td>
			<td><s:property value="#authorInfo.age" /></td>
			<td><s:property value="#authorInfo.country" /></td>
	</tr>
	</s:iterator>
	</tbody>
	</table>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	<table>
	<thead>
		<tr>
			<th>ISBN</th>
			<th>Title</th>
			<th>Publisher</th>
			<th>PublishDate</th>
			<th>Price</th>
		</tr>
	</thead>
	<tbody>
	<s:iterator value="#request.bookInfo" var="bookInfo" status="statu">
	<tr>
			<td><s:property value="#bookInfo.ISBN"/></td>
			<td><s:property value="#bookInfo.title"/></td>
			<td><s:property value="#bookInfo.publisher"/></td>
			<td><s:property value="#bookInfo.publishdate"/></td>
			<td><s:property value="#bookInfo.price"/></td>
			
			
	</tr>
	</s:iterator>
	</tbody>
	</table>

</body>
</html>