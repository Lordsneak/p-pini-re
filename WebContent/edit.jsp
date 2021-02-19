<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Dao.Imp.ArticleImpDao" %>
<%@ page import="Model.Article" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit page JSP</title>
</head>
<body>

	 <form method="post" action="/CRUD-Ar/UpdateServlet?id=<%= request.getParameter("id") %>">
	 <h1>Edit Article</h1>
  <label for="fname">Name :</label><br>
  <input type="text" id="aname" name="aname"><br>
  <label for="lname">Price:</label><br>
  <input type="text" id="aprice" name="aprice">
  <br>
  <button type="submit" >Edit Article</button>
 </form>
</body>
</html>