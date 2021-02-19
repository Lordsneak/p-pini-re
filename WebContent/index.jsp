<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="Dao.Imp.ArticleImpDao" %>
<%@ page import="Model.Article" %>
<%@ page import="java.util.List" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Add Article </h1> 
<a href="/CRUD-Ar/add.jsp"> Add Article</a>
 <table style="width:100%">
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Price</th>
    <th>Action</th>
  </tr>
  
  <%
	ArticleImpDao dp = new ArticleImpDao();
	List<Article> article = dp.getAllArticle();
	for(Article q:article) {
  %>
  <tr>
    <td><%= q.getId() %></td>
    <td><%= q.getNom() %></td>
    <td><%= q.getPrice() %></td>
    <td><button><a href="/CRUD-Ar/edit.jsp?id=<%= q.getId() %>">Edit</a></button><button><a href="/CRUD-Ar/DeleteServlet?id=<%= q.getId() %>">Delete</a></button></td>
  </tr>
  <% } %>
</table> 
</body>
</html>