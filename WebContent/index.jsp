<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>

   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Library</title>
</head>
<body>
   <h1>SearchByAuthorName</h1>
   <form action="searchBookByName"  >
      <label for="name">Please enter author's name:</label><br/>
      <input type="text" name="Name"/>
      <input type="submit" value="Search"/>
   </form>
</body>
</html>