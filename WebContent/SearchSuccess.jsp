<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BookInfo</title>
</head>
<body>
	<table>
	<thead>
		<tr>
			<th>Title</th>
			<th>ISBN</th>
			<th>Price</th>
			<th>Price</th>
			<th>Operation</th>
		</tr>
	</thead>
	<tbody>
	<s:iterator value="#request.booklist" var="ebook" status="statu">
	<tr>
	<td class="hidden-xs">
					 <s:url var="url" action="moreInfo.action">
					  <s:param name="authorid" value="#ebook.authorid"></s:param>
					 <s:param name="title" value="#ebook.title"></s:param>
					 </s:url>
						<s:a href="%{url}">《<s:property value="#ebook.Title" />》</s:a></td>
					<td><s:property value="#ebook.Publisher" /></td>
					<td><s:property value="ebook.Price" /></td>
					<td><a href='delete.action?ISBN=<s:property value="#ebook.ISBN" />'>Delete</a></td>
					
	
	</tr>
	</s:iterator>
	</tbody>
	</table>
	<br></br>
	<br></br>
	<br></br>
	<br></br>
	
	<a href="index.jsp">return to homepage</a>
</body>
</html>